package com.soft1841.week3;

import java.util.Scanner;

/**
 * 猜数字游戏
 */

public class NumberGuess {
    public static void main(String[] args) {
        //定义answer变量
        int answer = 147;
        //定义guess变量
        int guess;
        //提示
        System.out.println("请输入你的猜测");
        //输入
        Scanner scanner = new Scanner(System.in);
        guess = scanner.nextInt();
        //循环
        while(guess != answer){
            if (guess > answer){
                System.out.println("太大了,请重新输入");
                guess = scanner.nextInt();
            }
            if (guess < answer){
                System.out.println("太小了,请重新输入");
                guess = scanner.nextInt();
            }
            if (guess == answer){
                System.out.println("YesYesYesYes");
                break;
            }
        }
    }
}
