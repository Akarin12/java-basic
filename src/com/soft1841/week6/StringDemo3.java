package com.soft1841.week6;

/**
 * 文件类型识别
 */

public class StringDemo3 {
    public static void main(String[] args) {
        //定义文件名数组并初始化
        String[] fileNames = {
                "nmsl.doc", "world.jpg", "jojo.png", "dio.bmp", "jotaro.pdf"
        };
        int imgCount = 0;
        int docCount = 0;
        //循环识别
        for (String fileName : fileNames) {
            if (fileName.endsWith("jpg") || fileName.endsWith("png") || fileName.endsWith("bmp")) {
                imgCount++;
            }
            if (fileName.endsWith("pdf") || fileName.endsWith("doc")) {
                docCount++;
            }
        }
        System.out.println("图片有" + imgCount + "个");
        System.out.println("文档有" + docCount + "个");
    }
}
