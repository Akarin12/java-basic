package com.soft1841.week4;

public class StarMatrix {
    public static void main(String[] args) {
        final int ROW_COUNT = 5;
        final int COLUMN_COUNT = 8;
        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {
                System.out.print("*" + " ");
            }
            //换行
            System.out.println();
        }
    }
}
