module com.example.airport {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires mysql.connector.j;

    opens com.example.airport to javafx.fxml;
    exports com.example.airport;
}