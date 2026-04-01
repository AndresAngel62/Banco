package com.example.banco;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class RetiroController {
    @FXML
    private Button btnRetiro;

    @FXML
    private TextField txtCantidad;

    @FXML
    private Label resultadoRetiro;

    @FXML
    private Label txtSaldo;

    @FXML
    public void initialize() {
        txtSaldo.setText(String.format("Saldo actual: $%.2f", SesionBanco.getSaldo()));
    }

    @FXML
    protected void retiro() {
        try {
            double cantidadRetiro = Double.parseDouble(txtCantidad.getText());
            if (cantidadRetiro > 0 && cantidadRetiro <= SesionBanco.getSaldo()) {
                SesionBanco.retirar(cantidadRetiro);
                txtSaldo.setText(String.format("Saldo actual: $%.2f", SesionBanco.getSaldo()));
                resultadoRetiro.setVisible(true);
                resultadoRetiro.setText("Retiro exitoso");
            } else {
                resultadoRetiro.setVisible(true);
                resultadoRetiro.setText("Error: Cantidad no válida o saldo insuficiente");
            }
        } catch (NumberFormatException e) {
            resultadoRetiro.setVisible(true);
            resultadoRetiro.setText("Error: Cantidad no válida");
        }
    }

    @FXML
    protected void salir() throws IOException {
        Stage stage = (Stage) btnRetiro.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("banco-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Menú Principal");
        stage.show();
    }
}
