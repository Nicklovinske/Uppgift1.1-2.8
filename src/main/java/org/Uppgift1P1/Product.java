package org.Uppgift1P1;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product() {
        name = "Undefined";
        price = 1;
        stockQuantity = 1;
    }

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String setName(String name) {
        this.name = name;

        return name;
    }

    public String getName() {
        return name;
    }


    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public double getPrice() {
        return price;
    }


    public int setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity must be greater than or equal to 0");
        }

        return stockQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }


    public int totalValue() {
        return (int) (price * stockQuantity);
    }
}