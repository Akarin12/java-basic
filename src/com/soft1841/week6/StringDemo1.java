package com.soft1841.week6;

import java.util.UUID;

/**
 * 文件重命名
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String fileName = "11.jpg";
        //取出.jpg子串
        String s1 = fileName.substring(2, 6);
        //用UUID生成主文件名
        String newFileName = UUID.randomUUID().toString() + s1;
        System.out.println(newFileName);
    }
}
