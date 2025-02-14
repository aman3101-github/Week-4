package org.example.smartwarehousesystem;

public class Electronics extends WarehouseItem {

    // Specific attributes of the Electronics class
    private String brand;

    // Constructor of the Electronics class
    public Electronics(String itemName, double itemPrice, String brand){
        super(itemName,itemPrice);
        this.brand = brand;
    }
    // Inherit the abstract method of the abstract class : Method Overriding
    @Override
        public void displayDetails(){
            System.out.println("Item Type: Electronics");
            System.out.println("Brand Name: " + brand);
            System.out.println("Item Price: " + "Rs." + getPrice());
        }

}
