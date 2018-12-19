package com.soft1841.week3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("请输入要计算阶乘的正整数");
        long number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextLong();
        long resout = 1;
        while (number > 0) {
            resout = resout * number;
            number--;
        }
        System.out.println("阶乘为：" + resout);
    }
}