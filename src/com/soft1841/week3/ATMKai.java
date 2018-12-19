package com.soft1841.week3;

import java.util.Scanner;

public class ATMKai {
    public static void main(String[] args) throws Exception {
        System.out.println("欢迎光临南京银行ATM机");
        System.out.println("请插入你的银行卡");
        //定义一个输入对象
        Scanner scanner = new Scanner(System.in);
        //循环
        while(true) {
            //休眠三秒
            Thread.sleep(1000);
            System.out.println("************************");
            System.out.println("Welcome to ATMKai");
            System.out.println("1.取款");
            System.out.println("2.存款");
            System.out.println("3.查看余额");
            System.out.println("4.退出");
            System.out.println("************************");
            System.out.println("请选择服务");
            //初始化总金额
            int total = 1000;
            //定义一个用来接收用户输入的变量
            int choice;
            //接收一个整数
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("取款界面");
                //输入用户取款数
                System.out.println("请输入你要取的金额");
                int withdraw = scanner.nextInt();
                //金额不足
                if (withdraw > total) {
                    System.out.println("金额不足");
                } else {
                    total = total - withdraw;
                    //输出结果
                    System.out.println("你取了" + withdraw + "元");
                    System.out.println("当前余额为：" + total);
                }
            }
            if (choice == 2) {
                System.out.println("存款界面");
                //输入用户存款数
                System.out.println("请输入你要存的金额");
                int deposit = scanner.nextInt();
                total = total + deposit;
                //输出结果
                System.out.println("你存了" + deposit + "元");
                System.out.println("当前余额为：" + total);
            }
            if (choice == 3) {
                System.out.println("当前余额是：" + total);
            }
            if (choice == 4) {
                System.out.println("欢迎下次再来");
                Thread.sleep(1000);
                //系统结束
                break;
            }
        }
    }
}