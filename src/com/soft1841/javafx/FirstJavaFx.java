package com.soft1841.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * 第一个JavaFx应用
 */

public class FirstJavaFx extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("第一个JavaFx应用");
        Button button = new Button("按钮");
        //将组件加入场景，并指定场景大小
        Scene scene = new Scene(button, 600, 600);
        //将场景添加到舞台
        primaryStage.setScene(scene);
        //舞台可见
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}