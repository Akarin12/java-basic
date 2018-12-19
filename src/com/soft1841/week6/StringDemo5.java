package com.soft1841.week6;

/**
 * 正则
 */
public class StringDemo5 {
    public static void main(String[] args) {
        String password = "Aa11258sasss";
        String regexp = "[0-9a-zA-Z]{6,12}";
        boolean flagpassword = password.matches(regexp);
        System.out.println(flagpassword);
    }
}
