package org.example.dynamiconlinemarketplace;

// Generic class Product to define products
public class Product<T> {
    // Encapsulated attributes of the generic class
    private String productName;
    private double productPrice;
    private T category; // T restricts to the category type

    // Constructor of the generic class
    public Product(String productName, double productPrice, T category) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }
    // public getter methods for details
    public String getName(){
        return productName;
    }
    public double getPrice(){
        return productPrice;
    }
    public T getCategory(){
        return category;
    }

    // Setter method to set discounted price
    public void setPrice(double productPrice){
        this.productPrice = productPrice;
    }
    // Method to display product details
    public void displayDetails(){
        System.out.println("Product Name: " + getName());
        System.out.println("Product Category: " + getCategory());
        System.out.println("Product Price: " + getPrice());
    }
}
