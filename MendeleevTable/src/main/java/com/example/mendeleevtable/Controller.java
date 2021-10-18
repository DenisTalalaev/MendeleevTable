package com.example.mendeleevtable;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;

public class Controller {
    @FXML
    private Label mainLabel;

    @FXML
    protected void toTableButton() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("WORK");
        alert.setHeaderText("To table");
        alert.setContentText("Hello world");
        alert.showAndWait();
    }

    @FXML
    protected void toGameButton() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("WORK");
        alert.setHeaderText("TO GAME");
        alert.setContentText("Hello world");
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK){
                System.out.println("BUTTON WORD");
            }
        });
    }
}