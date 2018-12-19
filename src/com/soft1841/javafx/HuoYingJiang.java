package com.soft1841.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;

/**
 * 仿制火萤酱
 */
public class HuoYingJiang extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        System.out.println(screenSize.width + " " + screenSize.height);
        primaryStage.setTitle("火萤酱");
        //创建一个边界布局，上下左右中
        BorderPane borderPane = new BorderPane();
        //给外侧边界布局设置背景图
        BackgroundImage bg = new BackgroundImage(
                new Image("img/bg.jpg",
                        screenSize.width,
                        screenSize.height,
                        false,
                        true),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        //背景图设置给边界布局
        borderPane.setBackground(new Background(bg));
        //创建一个水平布局
        HBox hBox = new HBox();
        //设置水平布局组件间距
        hBox.setSpacing(15);
        //设置水平布局与窗体间距
        hBox.setPadding(new Insets(10, 10, 10, 15));
        //创建一个网格布局
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10.0);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15, 15, 15, 50));
        String[] buttonNames = {
                "皮肤", "通用", "网络搜索", "本地搜索", "小程序", "惊艳"
        };
        //开始循环，创建按钮，设置样式，添加到水平布局中
        for (int i = 0; i < buttonNames.length; i++) {
            Button button = new Button(buttonNames[i]);
            //给按钮设置样式
            button.setStyle("-fx-background-color: #FFFFFF;" + "-fx-min-width: 100px;" + "-fx-min-height: 50px;");
            //按钮加入水平布局
            hBox.getChildren().add(button);
        }
        //其他按钮
        Button setButton = new Button("设置");
        setButton.setStyle("-fx-background-color: #4160A5;" + "-fx-min-width: 150px;-fx-min-height: 50px;");
        hBox.getChildren().add(setButton);
        setButton.setOnAction(event -> {
            //新舞台
            Stage secondStage = new Stage();
            Label label = new Label("NMSL");
            label.setStyle("-fx-text-fill: #4160A5;" + "-fx-font-size: 30px;");
            Scene sscene = new Scene(label, 400, 300);
            secondStage.setScene(sscene);
            secondStage.show();
        });

        //日期
        DatePicker datePicker = new DatePicker();
        hBox.getChildren().add(datePicker);
        //将水平布局加入边界布局顶部
        borderPane.setTop(hBox);
        int count = 1;
        //网格布局行和列
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Image image = new Image(new FileInputStream("resources/img/" + count + ".png"));
                ImageView imageView = new ImageView(image);
                imageView.setStyle("-fx-max-width: 1200px;-fx-max-height: 800px;");
                gridPane.add(imageView, j, i);
                count++;
            }
        }
        //将网格布局加入边界布局中间
        borderPane.setCenter(gridPane);
        //创建场景，将边界布局加入场景
        Scene scene = new Scene(borderPane, 800, 500);
        //将场景加入当前舞台
        primaryStage.setScene(scene);
        //设置舞台可见
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}