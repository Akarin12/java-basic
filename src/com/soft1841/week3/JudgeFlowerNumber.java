package com.soft1841.week3;

public class JudgeFlowerNumber {
    public static void main(String[] args) {
        //定义数字
        int number = 100;
        //循环判断
        while (number < 1000) {
            int hundred = number / 100;
            int ten = number % 100 / 10;
            int digit = number % 10;
            if (number == hundred * hundred * hundred + ten * ten * ten + digit * digit * digit) {
                System.out.println(number + "是水仙花数");
            }
            number++;
        }
    }
}