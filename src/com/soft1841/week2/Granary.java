package com.soft1841.week2;

import java.util.Scanner;

public class Granary {
    public static void main(String[] args) {
        //声明double变量pi赋值
        final  double PI = 3.14;
        //直径变量(米)
        double diameter;
        //高变量（米）
        double height;
        //输入变量
        Scanner scanner = new Scanner(System.in);
        //输入直径
        System.out.println("输入直径，单位米");
        diameter = scanner.nextDouble();
        //输入高
        System.out.println("输入高，单位米");
        height = scanner.nextDouble();
        //输出体积
        double volume = diameter/2 * diameter/2 * height * PI;
        System.out.println("体积为：" + volume + "立方米");
        //储存
        int weight = 750;
        System.out.println("总储量为：" + weight * volume + "千克");
    }
}
