package com.soft1841.week4;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        final int ROW_COUNT = 4;
        int j;
        for (int i = 0; i <= ROW_COUNT; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 0; j >= i; j++) {
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}