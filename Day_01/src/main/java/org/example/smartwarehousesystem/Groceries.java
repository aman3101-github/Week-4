package org.example.smartwarehousesystem;

public class Groceries extends WarehouseItem {

    // Specific attributes of the Groceries class
    private int weight;

    // Constructor of the Electronics class
    public Groceries(String itemName, double itemPrice, int weight){
        super(itemName,itemPrice);
        this.weight = weight;
    }
    // Inherit the abstract method of the abstract class : Method Overriding
    @Override
    public void displayDetails(){
        System.out.println("Item Type: Groceries");
        System.out.println("Item Name: " + getName());
        System.out.println("Item Weight: " + weight);
        System.out.println("Item Price: " + "Rs." + getPrice());
    }
}
