package com.example.banco;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    private double cantidadRetiro;

    @FXML
    protected void retiro() {

        cantidadRetiro = Double.parseDouble(String.valueOf(this.txtCantidad.getText()));


        FXMLLoader loader = new FXMLLoader(getClass().getResource("retiro-view.fxml"));
        if (cantidadRetiro > 0 && ) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Deposito.fxml"));
                Parent root = (Parent) loader.load();

                saldo = saldo - cantidadRetiro;


                resultadoRetiro.setVisible(true);
                resultadoRetiro.setText("Retiro exitoso");

            } catch (IOException e) {
                e.printStackTrace();

                resultadoRetiro.setVisible(true);
                resultadoRetiro.setText("Error: Cantidad no válida");
            }

        }
    }

    @FXML
    protected void salir () {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("banco-view.fxml"));
    }
}
