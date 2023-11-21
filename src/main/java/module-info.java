module com.example.travelmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.travelmanagementsystem to javafx.fxml;
    exports com.example.travelmanagementsystem;
}