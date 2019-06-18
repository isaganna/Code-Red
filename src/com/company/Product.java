package com.company;

public class Product {
    String name = "Produkt1";

    int quantityinstore = 50;
    int price =  10;

    int totalPrice() {
        int total = quantityinstore * price;
        System.out.println("Sum " + total);
        return total;
    }

    public Product(String name, int quantityinstore, int price) {
        this.name = name;
        this.quantityinstore = quantityinstore;
        this.price = price;
    }
}
