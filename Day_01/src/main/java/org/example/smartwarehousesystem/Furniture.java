package org.example.smartwarehousesystem;

public class Furniture extends WarehouseItem {

    // Specific attributes of the class Furniture
    String material;

    // Constructor of the Furniture class
    public Furniture(String itemName, double itemPrice, String material){
        super(itemName, itemPrice);
        this.material = material;
    }


    // Specific implementation of the abstract method of the abstract class WarehouseItem
    @Override
    public void displayDetails(){
        System.out.println("Item Type: " + "Furniture");
        System.out.println("Item Type: " + "Furniture");
        System.out.println("Item Material: " + material);
        System.out.println("Item Price: " + "Rs." + getPrice());
    }
}
