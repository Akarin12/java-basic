package com.soft1841.week1;

import java.util.Scanner;

/**
 * 摄氏转华氏
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius;
        System.out.println("请输入摄氏温度");
        Scanner scanner = new Scanner(System.in);
        celsius = scanner.nextDouble();
        double fahrenheit = 32 + celsius * 1.8;
        System.out.println("华氏温度为：" + fahrenheit);
        int result = (int) fahrenheit;
        System.out.println("整形结果是：" + result);
    }
}
