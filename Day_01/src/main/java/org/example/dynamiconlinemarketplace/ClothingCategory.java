package org.example.dynamiconlinemarketplace;

public class ClothingCategory extends Product<String> {

    // Specific attribute of the ClothingCategory class
    private String brand;

    // Constructor of the class
    public ClothingCategory(String productName, double productPrice, String category, String brand){
        super(productName, productPrice, category);
        this.brand = brand;
    }

    // Getter method
    public String getBrand(){
        return brand;
    }

    // Method overriding of the generic class
    public void displayDetails(){
        System.out.println("Product Name: " + getName());
        System.out.println("Product Category: " + getCategory());
        System.out.println("Product Price: " + getPrice());
        System.out.println("Clothing Brand: " + getBrand());
    }
}
