package com.soft1841.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ButtomMove extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Buttom");
        AnchorPane anchorPane = new AnchorPane();
        Button button = new Button("按钮");
        button.setStyle("-fx-min-height: 10px;"+ "-fx-min-width: 10px");
        anchorPane.getChildren().add(button);

        Scene scene = new Scene(button, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
