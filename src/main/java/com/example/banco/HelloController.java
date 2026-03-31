package com.example.banco;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private static final String USUARIO_CORRECTO = "admin";
    private static final String CONTRASENA_CORRECTA = "1234";

    @FXML
    private TextField usuarioField;

    @FXML
    private PasswordField contrasenaField;

    @FXML
    private Label errorLabel;

    @FXML
    protected void onIngresarClick() throws IOException {
        String usuario = usuarioField.getText();
        String contrasena = contrasenaField.getText();

        if (usuario.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA)) {
            FXMLLoader loader = new FXMLLoader(HelloController.class.getResource("banco-view.fxml"));
            Scene escena = new Scene(loader.load(), 400, 350);

            Stage ventanaBanco = new Stage();
            ventanaBanco.setTitle("Menú del Banco");
            ventanaBanco.setScene(escena);
            ventanaBanco.show();

            Stage ventanaLogin = (Stage) usuarioField.getScene().getWindow();
            ventanaLogin.close();
        } else {
            errorLabel.setText("Usuario o contraseña incorrectos.");
        }
    }
}
