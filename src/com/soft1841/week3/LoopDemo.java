package com.soft1841.week3;

/**
 * 循环累加程序
 * 使用断点和debug来调试程序
 */

public class LoopDemo {
    public static void main(String[] args) {
        //循环变量初始化
        int i = 1;
        //求和变量初始化
        int sum = 0;
        //循环条件
        while (i <= 10) {
            //累加求和
            sum = sum + i;
            //循环变量自加
            i++;
        }
        System.out.println("sum = " + sum);
    }
}