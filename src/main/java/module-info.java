module com.example.week4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.week4 to javafx.fxml;
    exports com.example.week4;
}