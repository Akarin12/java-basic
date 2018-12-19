package com.soft1841.week3;

/**
 * 输出全班学号
 * @author 汤越
 */
public class StudentNumber {
    public static void main(String[] args) throws InterruptedException {
        int number = 1;
        while (number <= 40) {
            if (number < 10) {
                System.out.println("180234330" + number);
            }
            if (number >= 10) {
                System.out.println("18023433" + number);
            }
            Thread.sleep(1000);
            number++;
        }
    }
}
