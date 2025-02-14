package org.example.smartwarehousesystem;
import java.util.List;
// Utility class : Implement the Wildcard Method to display items irrespective of their specific types
public class WarehouseItemUtility {

    /* Wildcard Method is static because it doesn't belong to a specific instance of Storage<T>,
    it is a general utility function that operates on List<? extends WarehouseItem>
    Utility methods are usually static because they do not depend on the instance variables
    */
    public static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items){
            item.displayDetails();
        }
    }
}
