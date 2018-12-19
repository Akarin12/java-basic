package com.soft1841.week5;

/**
 * 歌手
 */
public class Singer {
    //封装歌手的姓名属性
    private String name;
    //封装歌手头像属性
    private String avatar;
//1
    public Singer(String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }
//2
    public Singer() {
    }
//3
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
//4
    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}