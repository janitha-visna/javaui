package org.example.javafx_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primarystage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/org/example/javafx_gui/styling.css").toExternalForm()); // Add CSS

        primarystage.setScene(scene);
        primarystage.initStyle(StageStyle.UNDECORATED);
        primarystage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}