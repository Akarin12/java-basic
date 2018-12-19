package com.soft1841.week5;

/**
 * 歌手控制台
 */
public class SingerApp {
    public static void main(String[] args) {
//        //调用无参构造方法，创建一个歌手对象,并通过set方法赋值
//        Singer singer1 = new Singer();
//        singer1.setName("林俊杰");
//        singer1.setAvatar("2.png");
//        //调用两个参数的构造方法
//        Singer singer2 = new Singer("陈奕迅", "1.png");
//        System.out.println(singer1);
//        System.out.println(singer2);
//        //创建歌手数组，并用foreach进行遍历
        Singer[] singers = new Singer[]{
                new Singer("歌手榜", "0.png"),
                new Singer("薛之谦", "1.png"),
                new Singer("花  粥", "2.png"),
                new Singer("陈奕迅", "3.png"),
                new Singer("林俊杰", "4.png"),
                new Singer("邓紫棋", "5.png"),
                new Singer("林宥嘉", "6.png"),
                new Singer("王贰浪", "7.png")
        };
        for (Singer singer : singers) {
            //输出singers数组中的每个singer对象
            System.out.println(singer);
        }
    }
}