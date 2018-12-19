package com.soft1841.week2;

import java.util.Scanner;

/**
 * 水仙花数
 */

public class FlowerNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        number = scanner.nextInt();
        //定义个十百变量
        int hundred;
        int ten;
        int digit;
        //算百位
        hundred = number / 100;
        //算十位
        ten = number % 100 / 10;
        //算个位
        digit = number % 10;
        //判断
        if (number == hundred * hundred * hundred + ten * ten * ten + digit * digit * digit){
            System.out.println(number + "是水仙花数");
        } else {
            System.out.println(number + "不是水仙花数");
        }
    }
}
