package io.github.anagalacticRuby;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * The main menu driver class for ColorSchemer.
 *
 * @author anagalacticRuby
 */
public class ColorMainMenu extends Application {
  /**
   * The start method of the main menu!
   *
   * <p>This is where all the fun begins! The menu is loaded here.
   *
   * @param primaryStage The initial stage. There only needs to be one!
   * @throws Exception throws all the exceptions.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("MainMenuMark.fxml"));
    primaryStage.setTitle("Color Schemer!");
    Scene scene = new Scene(root, 600, 400);
    primaryStage.setScene(scene);

    FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), root);
    fadeIn.setFromValue(0);
    fadeIn.setToValue(1);
    fadeIn.setCycleCount(1);

    fadeIn.play();

    primaryStage.setResizable(false);
    // The following line of code tells the program which CSS file to use
    scene.getStylesheets().add(getClass().getResource("ColorStyler.css").toExternalForm());
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
