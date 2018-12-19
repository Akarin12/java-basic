package com.soft1841.week6;

public class FlowerApp {
    public static void main(String[] args) {
        Flower[] flowers = {
                new Flower("BigFlower", "12"),
                new Flower("MediumFlower", "24"),
                new Flower("SmallFlower", "450")
        };
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}

class Flower {
    private String flowerName;
    private String flowerPrice;

    //无参
    public Flower() {
    }

    //全参
    public Flower(String flowerName, String flowerPrice) {
        this.flowerName = flowerName;
        this.flowerPrice = flowerPrice;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerPrice(String flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    @Override
    public String toString() {
        return "草:" + flowerName + "  ,Price:" + flowerPrice + " $";
    }
}
