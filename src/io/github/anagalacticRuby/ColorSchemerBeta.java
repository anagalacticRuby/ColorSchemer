package io.github.anagalacticRuby;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ColorSchemerBeta extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SchemerBetaMark.fxml"));
        primaryStage.setTitle("Color Schemer!");
        Scene scene = new Scene(root, 650, 500);
        primaryStage.setScene(scene);
        //The following line of code tells the program which CSS file to use
        scene.getStylesheets().add(getClass().getResource("ColorStylin.css").toExternalForm());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
