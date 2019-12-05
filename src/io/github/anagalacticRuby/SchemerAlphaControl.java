package io.github.anagalacticRuby;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class SchemerAlphaControl {

  public Button quitButton;
  @FXML private Circle circleOuter;

  @FXML private ColorPicker colorPick;

  @FXML private Circle circleMiddle;

  @FXML private Circle circleInner;

  @FXML private RadioButton radioInner;

  @FXML private ToggleGroup group;

  @FXML private RadioButton radioOuter;

  @FXML private RadioButton radioMiddle;

  @FXML private Button colorButton;

  @FXML private Polygon shapeIndicator;

  @FXML
  void applyColor(MouseEvent event) {
    Color yourColor = colorPick.getValue();
    if (radioInner.isSelected()) {
      circleInner.setFill(yourColor);
    } else if (radioMiddle.isSelected()) {
      circleMiddle.setFill(yourColor);
    } else if (radioOuter.isSelected()) {
      circleOuter.setFill(yourColor);
    } else {
      System.out.println("How did you get here?");
      System.out.println("You must select a shape before pushing this button!");
    }
  }

  @FXML
  void moveIndicator(MouseEvent event) {
    // Translate transition tutorial from
    // https://www.tutorialspoint.com/javafx/javafx_animations.htm
    // Creating a new transition animation
    TranslateTransition translateIndicator = new TranslateTransition();
    // Indicating the duration of the translation
    translateIndicator.setDuration(Duration.millis(1000));
    // The following line sets the indicator as the node being moved.
    translateIndicator.setNode(shapeIndicator);
    /*
     * The if-else chain below determines where the arrow is going to translate
     * to depending on which radio button is selected.
     */
    if (radioOuter.isSelected()) {
      // Originally I was going to have the arrow also set its fill
      // To whichever circle was selected.
      // But after readjusting the colors of the indicator,
      // I found that I like the final fill color I applied to the indicator.
      translateIndicator.setToX(0);
    } else if (radioMiddle.isSelected()) {
      translateIndicator.setToX(42);
    } else if (radioInner.isSelected()) {
      translateIndicator.setToX(72);
    }
    // The arrow only needs to go through one cycle.
    translateIndicator.setCycleCount(1);
    // The animation will not replay itself in reverse
    translateIndicator.setAutoReverse(false);
    translateIndicator.play();
  }

  public void quitToMenu(MouseEvent mouseEvent) {
    try {
      Stage stage = (Stage) quitButton.getScene().getWindow();
      Parent root = FXMLLoader.load(getClass().getResource("MainMenuMark.fxml"));

      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    } catch (NullPointerException | IOException e) {
      System.out.println("There's no menu to go to silly!");
      System.out.println("Next time install the menu file first!");
    }
  }
}
