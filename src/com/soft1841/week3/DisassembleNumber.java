package com.soft1841.week3;

import java.util.Scanner;

public class DisassembleNumber {
    public static void main(String[] args) {
        System.out.println("请输入要分解的数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + " = ");
        int i = 2;
        while (true) {
            if (n % i == 0 && i < n) {
                System.out.print(i + " * ");
                n=n/i;
            }else {
                i++;
            }
            if(n==i){
                System.out.print(i);
                break;
            }
        }
        scanner.close();
    }
}
