package com.soft1841.week4;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) throws FileNotFoundException {
        //定义输出位置
        PrintStream out1 = System.out;
        PrintStream out2 = new PrintStream("./log.txt");
        //输入提示；分别输出到日志和控制台
        System.out.println("请输入行数");
        System.setOut(out2);
        System.out.println("请输入行数");
        //输入
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        //定义和，初值1
        int sum = 1;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.setOut(out1);
                    System.out.print("1 ");
                    System.setOut(out2);
                    System.out.print("1 ");
                } else {
                    sum = sum * (i - j + 1) / (j - 1);
                    System.setOut(out1);
                    System.out.print(sum + " ");
                    System.setOut(out2);
                    System.out.print(sum + " ");
                }
            }
            System.setOut(out1);
            System.out.println();
            System.setOut(out2);
            System.out.println();
        }
    }
}