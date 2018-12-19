package com.soft1841.week4;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LsoscelesTriangle {
    public static void main(String[] args) throws FileNotFoundException {
        //定义输出位置
        PrintStream out = System.out;
        PrintStream ps = new PrintStream("./log.txt");
        //标准的输入流
        Scanner scanner = new Scanner(System.in);
        //输入提示；分别输出到日志和控制台
        System.out.println("请输入行数");
        System.setOut(ps);
        System.out.println("请输入行数");
        //定义行数，循环变量
        int line = scanner.nextInt();
        int j;
        //循环
        for (int i = 1; i <= line; i++) {
            for (j = 1; j <= line - i; j++) {
                System.setOut(ps);
                System.out.print(" ");
                System.setOut(out);
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.setOut(out);
                System.out.print("*");
                System.setOut(ps);
                System.out.print("*");
            }
            //换行
            System.setOut(out);
            System.out.println();
            System.setOut(ps);
            System.out.println();
        }
        scanner.close();
    }
}