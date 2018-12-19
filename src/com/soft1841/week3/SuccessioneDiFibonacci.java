package com.soft1841.week3;

import java.util.Scanner;

public class SuccessioneDiFibonacci {
    public static void main(String[] args) {
        //输入
        System.out.println("请输入你想得到的数列的个数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //定义前两项
        int a = 0;
        int b = 1;
        //定义第三项
        int c;
        //定义和
        int sum = 1;
        //定义循环变量
        int i;
        System.out.println("前" + n + "项是");
        System.out.print(a + "  " + b);
        for (i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            sum = sum + c;
            System.out.print("  " + c);
        }
        System.out.println();
        System.out.println("和为 " + sum);
    }
}