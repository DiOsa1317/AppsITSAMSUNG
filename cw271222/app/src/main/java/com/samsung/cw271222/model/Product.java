package com.samsung.cw271222.model;

import java.util.Objects;

public class Product {
    private String name;
    private String date;
    private int quantity;
    private int price;

    public Product(String name, String date, int quantity, int price) {
        this.name=name;
        this.date=date;
        this.quantity=quantity;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return  name + "\n" +
                "Date: " + date + "/\n" +
                "Quantity: " + quantity + "\n" +
                "Price: " + price;
    }
}
