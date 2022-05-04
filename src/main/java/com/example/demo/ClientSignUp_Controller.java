package com.example.demo;

import java.net.URL;
import java.sql.*;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;


public class ClientSignUp_Controller {
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUp_AchieveButton;

    @FXML
    private TextField SignUp_NameClient;

    @FXML
    private TextField SignUp_SurnameClient;

    @FXML
    private TextField SignUp_LoginClient;

    @FXML
    private CheckBox SexMaleClient;

    @FXML
    private CheckBox SexFemaleClient;

    @FXML
    private TextField SignUp_PasswordClient;

    @FXML
    private Button SignUp_BackButton1;

    @FXML
    void initialize() {
        SignUp_AchieveButton.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEvent -> {
            Window owner = SignUp_AchieveButton.getScene().getWindow();

            System.out.println(SignUp_NameClient.getText());
            System.out.println(SignUp_SurnameClient.getText());
            System.out.println(SignUp_LoginClient.getText());
            if (SignUp_NameClient.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, owner, "Error!",
                        "Please enter your Name");
                return;
            }

            if (SignUp_SurnameClient.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, owner, "Error!",
                        "Please enter your Surname");
                return;
            }
            if (SignUp_LoginClient.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, owner, "Error!",
                        "Please enter a Login");
                return;
            }
            if (SignUp_PasswordClient.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, owner, "Error!",
                        "Please enter a password");
                return;
            }

            showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                    "Welcome " + SignUp_NameClient.getText());
        });

        SignUp_BackButton1.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->{
            SignUp_BackButton1.getScene().getWindow().hide();
            Parent root = null;
            try{
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/demo/hello-view.fxml")));
            }catch (Exception e){
                e.printStackTrace();
            }
            Stage stage = new Stage();
            assert root != null;
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        });
    }
    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
}
