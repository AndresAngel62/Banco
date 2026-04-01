package com.example.banco;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


public class DepositoController {

    @FXML
    private TextField txtCantidad;

    @FXML
    private Button btnDeposito;

    @FXML
    private Button regresar;

    @FXML
    private Label resultadoDeposito;

    @FXML
    private Label saldoLabel;

    @FXML
    public void initialize() {
        saldoLabel.setText(String.format("Saldo actual: $%.2f", SesionBanco.getSaldo()));
    }

    @FXML
    protected void deposito() {
        try {
            double cantidadDeposito = Double.parseDouble(txtCantidad.getText());
            if (cantidadDeposito > 0) {
                SesionBanco.depositar(cantidadDeposito);
                saldoLabel.setText(String.format("Saldo actual: $%.2f", SesionBanco.getSaldo()));
                resultadoDeposito.setVisible(true);
                resultadoDeposito.setText("Depósito exitoso");
            } else {
                resultadoDeposito.setVisible(true);
                resultadoDeposito.setText("Error: Cantidad no válida");
            }
        } catch (NumberFormatException e) {
            resultadoDeposito.setVisible(true);
            resultadoDeposito.setText("Error: Cantidad no válida");
        }
    }

    @FXML
    protected void salir() throws IOException {
        Stage stage = (Stage) regresar.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("banco-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Menú Principal");
        stage.show();
    }
}
