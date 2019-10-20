package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ColorSchemerAlpha extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SchemerAlphaMark.fxml"));
        primaryStage.setTitle("Color Schemer Alpha.");
        Scene scene = new Scene(root, 480, 400);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        //The following line of code tells the program which CSS file to use
        scene.getStylesheets().add(getClass().getResource("ColorStylin.css").toExternalForm());
        primaryStage.show();
    }
}