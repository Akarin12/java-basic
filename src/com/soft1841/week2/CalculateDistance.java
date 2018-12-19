package com.soft1841.week2;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * 计算两点间距离
 */
public class CalculateDistance {
    public static void main(String[] args) {
        //定义坐标
        int x1;
        int x2;
        int y1;
        int y2;
        //定义距离
        double distence;
        //定义随机
        Random random = new Random();
        //随机坐标
        x1 = random.nextInt();
        x2 = random.nextInt();
        y1 = random.nextInt();
        y2 = random.nextInt();
        //计算距离
        distence = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        //保留两位小数
        DecimalFormat df = new DecimalFormat("0.00");
        //输出
        System.out.println("点(" + x1 + "," + x2 + ")与点(" + y1 + "," + y2 + ")的距离为" + df.format(distence) );
    }
}