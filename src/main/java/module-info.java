module com.example.pr1_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr1_2 to javafx.fxml;
    exports com.example.pr1_2;
}