package com.soft1841.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

public class FirstInterfaceWork extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        primaryStage.setTitle("First Interface Work");
        //创建一个边界布局，上下左右中
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: #212429");
        //水平布局
        HBox hBox = new HBox();
        //水平布局组件边距
        hBox.setSpacing(15);
        //水平布局与窗体边距
        hBox.setPadding(new Insets(0, 0, 0, 0));
        String[] buttonNames = {
                "<", ">", "商店", "库", "社区", "JOJO"
        };
        //按钮循环
        for (int i = 0; i < buttonNames.length; i++) {
            Button button = new Button(buttonNames[i]);
            button.setStyle("-fx-background-color: #212429;-fx-min-width: 100px;-fx-min-height: 15px;-fx-font-size: 30px;-fx-text-fill: #FFFFFF");
            hBox.getChildren().add(button);
            if (i == 4 || i == 5) {
                button.setOnAction(event -> {
                    //新舞台
                    Stage secondStage = new Stage();
                    Label label = new Label("错误代码：-102\n" +
                            "服务器连接失败。服务器可能脱机，或者您当前没有与互联网连接。");
                    label.setStyle("-fx-text-fill: #FFFFFF;" + "-fx-font-size: 20px;-fx-background-color: #212429");
                    Scene sscene = new Scene(label, 600, 300);
                    secondStage.setScene(sscene);
                    secondStage.show();
                });
            }
        }

        borderPane.setTop(hBox);
        //垂直布局
        VBox vBox = new VBox();
        vBox.setSpacing(0);
        vBox.setPadding(new Insets(0, 0, 0, 0));
        String[] buttonNames1 = {
                "Red Dead: RedemptionⅡ", "Persona 5             ", "UNCHARTED 4        ", "God of War           ", "Marvel's Spider-Man"
        };
        for (int i = 0; i < buttonNames1.length; i++) {
            Button button = new Button(buttonNames1[i]);
            button.setStyle("-fx-background-color: #212429;-fx-min-width: 100px;-fx-min-height: 30px;-fx-font-size: 10px;-fx-text-fill: #FFFFFF");
            vBox.getChildren().add(button);
        }
        borderPane.setLeft(vBox);
        //网格布局
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10.0);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15, 15, 15, 50));
        gridPane.setStyle("-fx-background-image:url('/img/201809301147136080.jpg');-fx-background-size: 1790px");
        //其他按钮
        Button setButton = new Button("开始游戏");
        setButton.setStyle("-fx-background-color: #468CB4;" + "-fx-min-width: 150px;-fx-min-height: 50px;-fx-font-size: 20px");
        hBox.getChildren().add(setButton);
        setButton.setOnAction(event -> {
            //新舞台
            Stage secondStage = new Stage();
            Label label = new Label("醒醒，代码写完了吗");
            label.setStyle("-fx-text-fill: #4160A5;" + "-fx-font-size: 40px;-fx-font: ");
            Scene sscene = new Scene(label, 400, 300);
            secondStage.setScene(sscene);
            secondStage.show();
        });
        gridPane.add(setButton, 1, 1);
        borderPane.setCenter(gridPane);
        Label label = new Label("Red Dead: RedemptionⅡ");
        label.setStyle("-fx-text-fill: #FFFFFF;-fx-font-size: 30px");
        gridPane.add(label, 1, 0);
        //网格布局中插入图片
        Image image1 = new Image("img/images.jpg");
        ImageView imageView1 = new ImageView(image1);
        gridPane.add(imageView1, 0, 0);
        //场景，显示
        Scene scene = new Scene(borderPane,1900,1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}