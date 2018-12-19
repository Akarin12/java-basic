package com.soft1841.week3;

import java.util.Scanner;

public class CycleAddition {
    public static void main(String[] args) {
        System.out.println("请输入要计算的十以内的数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n;
        int b = 0;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            b = b + a;
            a = a * 10;
            c = c + b;
        }
        System.out.println("结果为" + c);
        scanner.close();
    }
}