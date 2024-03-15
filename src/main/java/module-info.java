module com.example.ahoracado {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ahoracado to javafx.fxml;
    exports com.example.ahoracado;
}