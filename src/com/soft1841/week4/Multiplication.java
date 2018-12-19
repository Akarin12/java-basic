package com.soft1841.week4;

public class Multiplication {
    public static void main(String[] args) {
        int j, i;
        for (i = 1; i < 10; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
