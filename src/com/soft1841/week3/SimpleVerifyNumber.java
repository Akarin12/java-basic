package com.soft1841.week3;

import java.util.Random;

public class SimpleVerifyNumber {
    public static void main(String[] args) {
        String verifyCode = "";
        Random random = new Random();
        int n;
        for (int i = 1; i <= 4; i++) {
            n = random.nextInt(27);
            verifyCode += (char) ('a' + n);
        }
        System.out.println(verifyCode);
    }
}