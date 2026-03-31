package com.example.banco;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    private double cantidadDeposito;

    @FXML
    private Label resultadoDeposito;

    @FXML
    private Label saldoLabel;

    @FXML
    protected void deposito (){
        Stage stage = new Stage();
        stage.setTitle("Depósito");

        saldoLabel.setText(saldo);


        cantidadDeposito = Double.parseDouble(String.valueOf(this.txtCantidad.getText()));

        if (cantidadDeposito > 0 ){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Deposito.fxml"));
                Parent root = (Parent) loader.load();

                saldo = saldo + cantidadDeposito;


                resultadoDeposito.setVisible(true);
                resultadoDeposito.setText("Depósito exitoso");

            } catch (IOException e){
                e.printStackTrace();

                resultadoDeposito.setVisible(true);
                resultadoDeposito.setText("Error: Cantidad no válida");
            }


        }

    }
    @FXML
    protected void salir (){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("banco-view.fxml"));
        
    }
}
