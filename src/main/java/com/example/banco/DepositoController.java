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

    protected void deposito (){
        Stage stage = new Stage();
        stage.setTitle("Depósito");

        cantidadDeposito = Double.parseDouble(String.valueOf(this.txtCantidad.getText()));

        if (cantidadDeposito > 0 ){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Deposito.fxml"));
            try { 


            } catch (IOException e){
                e.printStackTrace();

                resultadoDeposito.setText("Error: Cantidad no válida");
            }


        }

    }
}
