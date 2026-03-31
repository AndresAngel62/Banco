package com.example.banco;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BancoController {

    @FXML
    private Label mensajeLabel;

    @FXML
    protected void onConsultarSaldo() {

    }

    @FXML
    protected void onDepositar() {

    }

    @FXML
    protected void onRetirar() {
    }

    @FXML
    protected void onSalir() {
        Stage ventana = (Stage) mensajeLabel.getScene().getWindow();
        ventana.close();
    }
}
