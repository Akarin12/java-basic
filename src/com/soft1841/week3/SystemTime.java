package com.soft1841.week3;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 和系统时间同步，到秒级
 * @author Tang
 * 2018.10.24
 */

public class SystemTime {
    public static void main(String[] args) throws InterruptedException {
        //通过time的API指定结束的时间
        LocalDateTime endTime = LocalDateTime.of(2018,10,25,8,51,30);
        while (true) {
            //使用JDK8的时间API,获取当前系统时间,去毫秒
            LocalDateTime currentTime = LocalDateTime.now().withNano(0);
            System.out.println(currentTime);
            Thread.sleep(1000);
            //当前时间超过结束时间时结束
            if(currentTime.isAfter(endTime)){
                break;
            }
        }
        System.out.println("时间到");
    }
}