package com.example.banco;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class ConsultaController {

    @FXML
    private Label lblSaldo;

    @FXML
    private Button btnRegresar;

    @FXML
    public void initialize() {
        lblSaldo.setText(String.format("Saldo actual: $%.2f", SesionBanco.getSaldo()));
    }

    @FXML
    protected void onRegresarClick() throws IOException {
        Stage stage = (Stage) btnRegresar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("banco-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Menú Principal");
        stage.show();
    }
}