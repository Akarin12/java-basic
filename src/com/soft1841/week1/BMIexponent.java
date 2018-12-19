package com.soft1841.week1;

import java.util.Scanner;

/**
 * 根据身高体重计算BMI的程序
 * @author 汤越
 */
public class BMIexponent {
    public static void main(String[] args) {
        //身高变量，单位：米
        double height;
        //体重，kg
        double weight;
        //输入变量
        Scanner scanner = new Scanner(System.in);
        //输入身高
        System.out.println("输入身高，单位是米");
        height = scanner.nextDouble();
        //输入体重
        System.out.println("输入体重，单位是公斤");
        weight = scanner.nextDouble();
        //BMI公式
        double exponent = weight / (height * height);
        //输出身高
        System.out.println("您的身高为：" + height + "米");
        //输出体重
        System.out.println("您的体重为：" + weight + "公斤");
        //输出BMI
        System.out.println("您的BMI值为：" + exponent);
        //判断
        //过轻（小于18.5）
        if (exponent < 18.5) {
            System.out.println("体重过轻");
        }
        //正常（大于等于18.5，小于24.9）
        if (exponent >= 18.5 && exponent < 24.9){
            System.out.println("体重正常");
        }
        //过重（大于等于24.9，小于29.9）
        if (exponent >= 24.9 && exponent < 29.9){
            System.out.println("体重过重");
        }
        //肥胖（大于等于29.9）
        if (exponent >= 29.9){
            System.out.println("肥胖");
        }
    }
}
