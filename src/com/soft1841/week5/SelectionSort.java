package com.soft1841.week5;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        //定义常量N
        final int N = 10;
        //定义数组
        int[] a = new int[N];
        //随机数种子
        Random random = new Random();
        System.out.println("排序前");
        //随机出N个数
        for (int i = 0; i < N; i++) {
            a[i] = random.nextInt(100);
        }
        //遍历循环输出
        for (int n : a) {
            System.out.print(n + "  ");
        }
        System.out.println();
        System.out.println("排序后");
        int min;
        int temp;
        //选择排序的优化
        for (int i = 0; i < N - 1; i++) {
            min = i;
            // 做第i趟排序
            for (int j = i + 1; j < N; j++) {
                // 选最小的记录
                if (a[j] < a[min]) {
                    //记下目前找到的最小值所在的位置
                    min = j;
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i != min) {
                //交换i和min
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        for (int n : a) {
            System.out.print(n + "  ");
        }
    }
}