package com.soft1841.week4;

import java.util.Scanner;

/**
 * 输入n个数比大小
 */
public class MaxMinNumber {
    public static void main(String[] args) {
        final int COUNT = 5;
        //输入第一个数
        System.out.println("请输入" + COUNT + "个数");
        Scanner scanner = new Scanner(System.in);
        System.out.print("1:");
        //定义最大数，输入数，最小数（最大数最小数初值为输入的第一个数）
        int max = scanner.nextInt();
        int num;
        int min;
        min = max;
        int sum = 0;
        //循环后几次
        for (int i = 2; i <= COUNT; i++) {
            System.out.print(i + ":");
            num = scanner.nextInt();
            //比最大
            if (max < num) {
                max = num;
            }
            //比最小
            if (min > num) {
                min = num;
            }
            sum += num;
        }
        System.out.println("最大数为：" + max);
        System.out.println("最小数为：" + min);
        System.out.println(sum);
        scanner.close();
    }
}