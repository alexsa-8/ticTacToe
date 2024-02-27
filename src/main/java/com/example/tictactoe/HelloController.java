package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char nowSym = 'x';

    private final char[][] gameField;

    {
        gameField = new char[3][3];
    }

    private boolean isGame = true;

    @FXML
    void btnClick(ActionEvent event) {
        Button btn = (Button)event.getSource();

        if (!isGame || !Objects.equals(btn.getText(), "")) return;

        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

        gameField[rowIndex][columnIndex] = nowSym;

        btn.setText(String.valueOf(nowSym));

        Alert alert = new Alert(Alert.AlertType.INFORMATION, "У нас есть победитель << " + btn.getText() + " >>", ButtonType.OK);

        if (gameField[0][0] == gameField[0][1] && gameField[0][0] == gameField[0][2] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')) {
            alert.showAndWait();
            isGame = false;
        } else if (gameField[1][0] == gameField[1][1] && gameField[1][0] == gameField[1][2] && (gameField[1][0] == 'x' || gameField[1][0] == 'o')){
            alert.showAndWait();
            isGame = false;
        } else if (gameField[2][0] == gameField[2][1] && gameField[2][0] == gameField[2][2] && (gameField[2][0] == 'x' || gameField[2][0] == 'o')){
            alert.showAndWait();
            isGame = false;
        } else if (gameField[0][0] == gameField[1][0] && gameField[0][0] == gameField[2][0] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')){
            alert.showAndWait();
            isGame = false;
        } else if (gameField[0][1] == gameField[1][1] && gameField[0][1] == gameField[2][1] && (gameField[0][1] == 'x' || gameField[0][1] == 'o')){
            alert.showAndWait();
            isGame = false;
        } else if (gameField[0][2] == gameField[1][2] && gameField[0][2] == gameField[2][2] && (gameField[0][2] == 'x' || gameField[0][2] == 'o')){
            alert.showAndWait();
            isGame = false;
        } else if (gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')){
            alert.showAndWait();
            isGame = false;
        } else if (gameField[0][2] == gameField[1][1] && gameField[0][2] == gameField[2][0] && (gameField[0][2] == 'x' || gameField[0][2] == 'o')){
            alert.showAndWait();
            isGame = false;
        }

        nowSym = nowSym == 'x' ? 'o' : 'x';
    }

    @FXML
    void initialize() {
    }
}