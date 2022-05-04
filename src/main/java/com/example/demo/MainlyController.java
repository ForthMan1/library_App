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

public class MainlyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Author_Button;

    @FXML
    private Button Book_Button;

    @FXML
    void initialize() {
        Book_Button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->  {
            Book_Button.getScene().getWindow().hide();
            Parent root = null;
            try{
                root = FXMLLoader.load(getClass().getResource("Client_BookSide.fxml"));
            }catch (Exception e ){
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        });
        Author_Button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            Author_Button.getScene().getWindow().hide();
            Parent root = null;
            try{
                root = FXMLLoader.load(getClass().getResource("Client_AuthorSide.fxml"));
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
