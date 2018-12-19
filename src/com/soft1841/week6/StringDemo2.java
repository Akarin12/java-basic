package com.soft1841.week6;

/**
 * 分割单词
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "I am your father";
        //regex = regular expression正则表达式
        String[] letters = str.split(" ");
        for (String l:letters) {
            System.out.println(l);
        }
        System.out.println();
        System.out.println("NOOOOOOOOOO!");
    }
}
