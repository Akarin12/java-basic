package com.soft1841.week2;

import java.util.Scanner;

public class Longin {
    public static void main(String[] args) {
        //定义账号变量
        String account;
        //定义密码变量
        String password;
        //输入变量
        Scanner scanner = new Scanner(System.in);
        //输入账号
        System.out.println("请输入账号");
        account = scanner.nextLine();
        //输入密码
        System.out.println("请输入密码");
        password = scanner.nextLine();
        //判断
        if("soft1841@qq.com".equals(account) && "Soft_1841".equals(password))
        {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
