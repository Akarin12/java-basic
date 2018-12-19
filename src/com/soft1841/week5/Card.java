package com.soft1841.week5;

public class Card {
    private String name;
    private String picture;
    private String price;

    public Card(String name, String picture, String price) {
        this.name = name;
        this.picture = picture;
        this.price = price;
    }

    public Card() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
