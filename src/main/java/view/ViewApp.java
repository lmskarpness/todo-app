package main.java.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ViewApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("../../../resources/fxml/viewholder.fxml"));
        Group root = new Group();
        stage.setTitle("Task Manager");
        stage.setScene(new Scene(root, Color.LIGHTCYAN));

        // Configuration
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(false);
        stage.setX(700);
        stage.setY(150);

        // Display
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
