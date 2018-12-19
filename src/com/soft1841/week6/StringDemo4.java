package com.soft1841.week6;

/**
 * 禁词过滤
 */

public class StringDemo4 {
    public static void main(String[] args) {
        String content = "你不愿意种花，你说，我不愿看见它一点点凋落。是的，为了避免结束，你避免了一切开始。";
        String finalStr = content.replaceAll("花","**");
        System.out.println(finalStr);
    }
}
