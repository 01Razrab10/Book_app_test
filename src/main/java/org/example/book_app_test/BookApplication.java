package org.example.book_app_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;

import java.io.IOException;

public class BookApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BookApplication.class.getResource("View.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 582, 504);
        Image icon = new Image(new File("C:/Users/Valmont/Desktop/Java_projects/Book_app_test/src/main/resources/images/Icon.png").toURI().toString());
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("Literary Essentials");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}