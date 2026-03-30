module com.example.banco {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.banco to javafx.fxml;
    exports com.example.banco;
}