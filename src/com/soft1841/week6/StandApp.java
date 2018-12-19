package com.soft1841.week6;

public class StandApp {
    public static void main(String[] args) {
        Stand[] stands ={
                new Stand("Jotaro","Star Platinmu"),
                new Stand("DIO","The World")
        };
        for (Stand stand:stands
             ) {
            System.out.println(stand);
        }
    }
}
class Stand{
    private String User;
    private String Stand;

    public Stand() {
    }

    public Stand(String user, String stand) {
        User = user;
        Stand = stand;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getStand() {
        return Stand;
    }

    public void setStand(String stand) {
        Stand = stand;
    }

    @Override
    public String toString() {
        return "Stand{" +
                "User='" + User + '\'' +
                ", Stand='" + Stand + '\'' +
                '}';
    }
}
