package com.soft1841.week5;

import java.util.Random;

/**
 * 随机数数组
 */
public class RandomArray {
    public static void main(String[] args) {
        //定义数组
        int[] a = new int[10];
        //随机数种子
        Random random = new Random(0);
        //循环输入随机数
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
    }
}
