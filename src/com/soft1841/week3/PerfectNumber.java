package com.soft1841.week3;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("完全数有:");
        //假装是完全数的n的自加
        for (int n = 2; n <= 1000; n++) {
            //每次重置临时的和a
            int a = 0;
            //定义假装是因子的i
            for (int i = 1; i < n; i++) {
                //判断i是不是真的是因子
                if (n % i == 0) {
                    //因子的和
                    a = a + i;
                }
            }
                //判断是否真的是完全数
                if (n == a) {
                    System.out.print(n + ".");
                }
        }
    }
}