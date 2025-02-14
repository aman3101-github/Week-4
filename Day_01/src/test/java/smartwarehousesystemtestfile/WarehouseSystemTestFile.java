package smartwarehousesystemtestfile;

import org.example.smartwarehousesystem.*;

import java.util.Arrays;
import java.util.List;

public class WarehouseSystemTestFile {
    public static void main(String[] args) {
        System.out.println("Smart Warehouse System Testing");

        // Storage for Electronics items
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItems(new Electronics("Laptop", 200000.0, "HP"));
        electronicsStorage.addItems(new Electronics("Smartphone", 20000.0, "Realme"));

        // Storage for Groceries items
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItems(new Groceries("Dry Fruits", 1500.00, 3));
        groceriesStorage.addItems(new Groceries("Palm Oil", 150.00, 1));

        // Storage for Furniture items
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItems(new Furniture("Sofa", 20000.00, "Wooden"));
        furnitureStorage.addItems(new Furniture("Table", 10000.00, "Glass"));

        System.out.println("\n Testing Electronics Storage");
        WarehouseItemUtility.displayItems(electronicsStorage.retrieveItems());

        System.out.println("\n Testing Groceries Storage");
        WarehouseItemUtility.displayItems(groceriesStorage.retrieveItems());

        System.out.println("\n Testing Furniture Storage");
        WarehouseItemUtility.displayItems(furnitureStorage.retrieveItems());

        System.out.println("\n Test Completed Successfully");
    }
}
