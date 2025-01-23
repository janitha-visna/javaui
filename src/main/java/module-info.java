module org.example.javafx_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafx_gui to javafx.fxml;
    exports org.example.javafx_gui;
}