package com.soft1841.week2;

import java.util.Random;

/**
 * 随机七位数
 */

public class RandomSevenNumber {
    public static void main(String[] args) {
        //定义七个数
        int one;
        int two;
        int three;
        int four;
        int five;
        int six;
        int seven;
        //定义七位数
        int number;
        //定义随机
        Random random = new Random();
        //开始随机
        one = random.nextInt(10);
        two = random.nextInt(10);
        three = random.nextInt(10);
        four = random.nextInt(10);
        five = random.nextInt(10);
        six = random.nextInt(10);
        seven = random.nextInt(10);
        //输出
        System.out.println("第一位是：" + one + "  第二位是：" + two + "  第三位是：" + three + "  第四位是：" + four + "  第五位是：" + five + "  第六位是：" + six + "  第七位是：" + seven);
    }
}
