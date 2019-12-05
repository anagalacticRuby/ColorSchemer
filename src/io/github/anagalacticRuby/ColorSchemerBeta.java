package io.github.anagalacticRuby;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The driver class for ColorSchemer version Beta~
 *
 * @author anagalacticRuby
 */
public class ColorSchemerBeta extends Application {
  /**
   * The stage loader method for the Beta version!
   *
   * @param primaryStage this sets the primary stage if you run this standalone class.
   * @throws Exception throws all the exceptions.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("SchemerBetaMark.fxml"));
    primaryStage.setTitle("Color Schemer!");
    Scene scene = new Scene(root, 650, 500);
    primaryStage.setScene(scene);
    // The following line of code tells the program which CSS file to use
    scene.getStylesheets().add(getClass().getResource("ColorStyler.css").toExternalForm());
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
