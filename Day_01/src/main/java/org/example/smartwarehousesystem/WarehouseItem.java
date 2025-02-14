package org.example.smartwarehousesystem;

// Abstract class : base class for all other classes
public abstract class WarehouseItem {
    private String itemName;
    private double itemPrice;


    // Constructor for the abstract class
    public WarehouseItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    // Getters
    public String getName() {
        return itemName;
    }

    public double getPrice() {
        return itemPrice;
    }

    // Abstract method to be inherited by other classes
    public abstract void displayDetails();

}