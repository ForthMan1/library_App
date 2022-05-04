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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Client_BookSideController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ClientBack_Button;

    @FXML
    private Button AddBook_Button;

    @FXML
    private Button ShowList_Button;

    @FXML
    void initialize() {
        ClientBack_Button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            ClientBack_Button.getScene().getWindow().hide();
            Parent root = null;
            try{
                root = FXMLLoader.load(getClass().getResource("mainly_pacage.fxml"));
            }catch (Exception e ){
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        });

        AddBook_Button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            AddBook_Button.getScene().getWindow().hide();
            Parent root = null;
            try{
                root = FXMLLoader.load(getClass().getResource("AddNewBook_Client.fxml"));
            }catch (Exception e ){
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        });
    }
}
