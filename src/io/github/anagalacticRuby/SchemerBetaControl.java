package io.github.anagalacticRuby;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SchemerBetaControl implements Initializable {

  public Separator separate;
  @FXML private ToolBar toolBarA;

  @FXML private Ellipse gradient1;

  @FXML private Button btnTest;

  @FXML private ToggleButton toggleStroke;

  @FXML private ColorPicker colorPicker;

  @FXML private ComboBox<String> comboShapeNum;

  @FXML private Circle circle2;

  @FXML private Circle circle1;

  @FXML private Circle circle3;

  @FXML private Circle circle4;

  @FXML private Circle circle5;

  @FXML private Circle circle6;

  @FXML private Circle circle1S;

  @FXML private Circle circle4S;

  @FXML private Circle circle2S;

  @FXML private Circle circle5S;

  @FXML private Circle circle3S;

  @FXML private Circle circle6S;

  @FXML private TitledPane optionsPane;

  @FXML private TabPane betaTabPane;

  @FXML private Button quitButton;
  /**
   * This method is attached to the apply color button!
   *
   * <p>It will take the current shape selected in the combo box and apply the current color to that
   * shape's fill or stroke.
   *
   * <p>It will only apply the color to the shape's stroke if the stroke toggle is on.
   *
   * @param event when you click the button this method will be called
   */
  @FXML
  void applyColor(MouseEvent event) {
    String shapeNum = comboShapeNum.getValue();
    switch (shapeNum) {
      case "Circle 1":
        {
          // If the toggle stroke button is enabled, it will apply the color to the circle's stroke
          // only.
          if (toggleStroke.isSelected()) {
            circle1.setStroke((colorPicker.getValue()));
          } else {
            circle1.setFill(colorPicker.getValue());
          }
          break;
        }
      case "Circle 2":
        {
          if (toggleStroke.isSelected()) {
            circle2.setStroke(colorPicker.getValue());
          } else {
            circle2.setFill(colorPicker.getValue());
          }
          break;
        }
      case "Circle 3":
        {
          if (toggleStroke.isSelected()) {
            circle3.setStroke(colorPicker.getValue());
          } else {
            circle3.setFill(colorPicker.getValue());
          }
          break;
        }
      case "Circle 4":
        {
          if (toggleStroke.isSelected()) {
            circle4.setStroke(colorPicker.getValue());
          } else {
            circle4.setFill(colorPicker.getValue());
          }
          break;
        }
      case "Circle 5":
        {
          if (toggleStroke.isSelected()) {
            circle5.setStroke(colorPicker.getValue());
          } else {
            circle5.setFill(colorPicker.getValue());
          }
          break;
        }
      case "Circle 6":
        {
          if (toggleStroke.isSelected()) {
            circle6.setStroke(colorPicker.getValue());
          } else {

            circle6.setFill(colorPicker.getValue());
          }
          break;
        }
      default:
        {
          System.out.println("How did you get here?");
        }
    }
  }

  @FXML
  void changeFill(ActionEvent event) {
    circle1.setFill(colorPicker.getValue());
  }

  @FXML
  void changeFill2(MouseEvent event) {
    circle1.setFill(colorPicker.getValue());
    /*
     The following code allows you to see gradients between two shapes!
    */
    Stop[] stops =
        new Stop[] {new Stop(0, colorPicker.getValue()), new Stop(1, (Color) circle2.getFill())};
    LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
    gradient1.setFill(lg1);
  }

  @FXML
  void quitToMenu(MouseEvent event) throws IOException {

    try {
      Stage stage = (Stage) quitButton.getScene().getWindow();
      Parent root = FXMLLoader.load(getClass().getResource("MainMenuMark.fxml"));

      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    } catch (NullPointerException e) {
      System.out.println("There's no menu to go to silly!");
      System.out.println("Next time install the menu file first!");
    }
  }

  @FXML
  void selectShape(MouseEvent event) {}

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    comboShapeNum
        .getItems()
        .addAll("Circle 1", "Circle 2", "Circle 3", "Circle 4", "Circle 5", "Circle 6");
    comboShapeNum.getSelectionModel().selectFirst();
    toggleStroke.setSelected(false);
    optionsPane.setExpanded(false);
    /*        betaTabPane.getStyleClass().add(TabPane.STYLE_CLASS_FLOATING);*/

  }
}
