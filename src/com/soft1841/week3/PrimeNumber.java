package com.soft1841.week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //输入
        System.out.println("请输入要判断的正整数");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                break;
            }
        }
            if (number <= i) {
                System.out.println("是素数");
            } else {
                System.out.println("不是素数");
            }
        scanner.close();
    }
}
