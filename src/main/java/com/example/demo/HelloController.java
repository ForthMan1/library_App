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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ClientSignUpButton;

    @FXML
    private Button ClientSignInButton;

    @FXML
    private TextField Text_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {
        ClientSignUpButton.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
                ClientSignUpButton.getScene().getWindow().hide(); // нужно чтобы при открытии нового окна это окно скрывалась
                FXMLLoader fxmlLoader = new FXMLLoader();
                Parent root = null;
                // далее указываем путь нашего 2 го файла которая будет открываться
                // Мы должны так же его загрузить для его отаброжения
                try {
                    root = FXMLLoader.load(getClass().getResource("/com/example/demo/ClientSignUp.fxml"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // полный путь к нашему файлу который нужно загрузить
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.show();
        });

        ClientSignInButton.setOnAction(actionEvent -> {
            String login_text =ClientSignInButton.getText().trim(); // trim -удаляет лишние пробелы
            String login_pass = ClientSignInButton.getText().trim();
            if(!login_text.equals("") && !login_pass.equals(""))
                LoginUser(login_text,login_pass);
            else System.out.println("Запишите логин и пароль");
        });

        ClientSignInButton.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            ClientSignInButton.getScene().getWindow().hide(); // нужно чтобы при открытии нового окна это окно скрывалась
            FXMLLoader fxmlLoader = new FXMLLoader();
            // далее указываем путь нашего 2 го файла которая будет открываться
            Parent root = null;
            // Мы должны так же его загрузить для его отаброжения
            try {
                root = FXMLLoader.load(getClass().getResource("mainly_pacage.fxml"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            // полный путь к нашему файлу который нужно загрузить
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        });
    }

    private void LoginUser(String loginText, String loginPassword) {

    }
}
