package com.soft1841.week5;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        //定义常量N
        final int N = 10;
        //定义数组
        int[] numbers = new int[N];
        //随机数种子
        Random random = new Random();
        System.out.println("排序前");
        //随机出N个数
        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(100);
        }
        //遍历循环输出
        for (int n : numbers) {
            System.out.print(n + "  ");
        }
        System.out.println();
        System.out.println("排序后");
        int t;
        //外层循环控制排序趟数
        for (int i = 0; i < N - 1; i++) {
            //内层循环控制每一趟排序多少次
            for (int j = i + 1; j < N; j++) {
                //前大于后则对调
                if (numbers[i] > numbers[j]) {
                    t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
        //遍历循环输出
        for (int n : numbers) {
            System.out.print(n + "  ");
        }
    }
}