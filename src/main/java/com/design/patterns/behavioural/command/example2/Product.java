package com.design.patterns.behavioural.command.example2;

public class Product {
    private final String name;
    private final String description;

    private Integer quantity;

    public Product(String name, String description, Integer quantity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public void buy() {
        quantity--;
        System.out.println("One unit of " + name + " ( " + description + ") brought by someone");
        System.out.println("Available Quantity: " + quantity);
    }

    public void sell() {
        quantity++;
        System.out.println("One unit of " + name + " ( " + description + ") sold by someone");
        System.out.println("Available Quantity: " + quantity);
    }
}
