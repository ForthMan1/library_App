package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddNewBook_ClientController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField NameAuthor_Field;

    @FXML
    private TextField NameBook_Field;

    @FXML
    private TextField DateOfPublic_Field;

    @FXML
    private Button AddNewBook_Button;

    @FXML
    private Button BackClient_Button;

    @FXML
    void initialize() {
        BackClient_Button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            BackClient_Button.getScene().getWindow().hide();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("Client_AuthorSide.fxml"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        });
    }
}
