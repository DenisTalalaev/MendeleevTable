module com.example.mendeleevtable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mendeleevtable to javafx.fxml;
    exports com.example.mendeleevtable;
}