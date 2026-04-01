package com.example.banco;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class BancoController {

    @FXML
    private Label mensajeLabel;

    @FXML
    protected void onConsultarSaldo() throws IOException {
        Stage stage = (Stage) mensajeLabel.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("consulta.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Consulta de Saldo");
        stage.show();
    }

    @FXML
    protected void onDepositar() throws IOException {
        Stage stage = (Stage) mensajeLabel.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("deposito.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Depósito");
        stage.show();
    }

    @FXML
    protected void onRetirar() throws IOException {
        Stage stage = (Stage) mensajeLabel.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("retiro-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Retiro");
        stage.show();
    }

    @FXML
    protected void onSalir() {
        Stage ventana = (Stage) mensajeLabel.getScene().getWindow();
        ventana.close();
    }
}
