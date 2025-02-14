package org.example.smartwarehousesystem;

/* Implementation of a generic storage class : It stores only items of the type WarehouseItem or its subclasses
    Provide methods to add or retrieve items.
 */

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItem> {

    // Creating an encapsulated list of the type T - which extends to type WarehouseItem or its subclasses
    private List<T> items;

    // Constructor of the Storage class
    public Storage(){
        items = new ArrayList<>();
    }

    // Method to add items
    public void addItems(T item){
        items.add(item);
    }
    // Method to retrieve items
    public List<T> retrieveItems(){
        return items;
    }
}
