package io.github.anagalacticRuby;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The controller for the Main Menu of ColorSchemer
 * @author anagalacticRuby
 */
public class MainMenuControl {

    @FXML
    private Label mainTitle;

    @FXML
    private RadioButton radioAlpha;

    @FXML
    private ToggleGroup versionSelect;

    @FXML
    private RadioButton radioBeta;

    @FXML
    private RadioButton radioGamma;

    @FXML
    private Button DaBigButton;

    @FXML
    void startSchemer(MouseEvent event) throws IOException {
        try {
            if (radioAlpha.isSelected()) {
                Stage stage = (Stage) radioAlpha.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("SchemerAlphaMark.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else if (radioBeta.isSelected()) {
                Stage stage = (Stage) radioBeta.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("SchemerBetaMark.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else if (radioGamma.isSelected()) {
                System.out.println("Coming Soon!");
            /*
            Stage stage = (Stage) radioGamma.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("SchemerGammaMark.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/

            }
        } catch (NullPointerException N) {
            System.out.println("Please make sure you have the proper versions downloaded!");
            System.out.println("Otherwise you won't be going anywhere.");
        }
    }
}
