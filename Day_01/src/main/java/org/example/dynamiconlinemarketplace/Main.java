package org.example.dynamiconlinemarketplace;

public class Main {
    public static void main(String[] args) {
        // Creating Book Category Product
        BookCategory book = new BookCategory("The Alchemist", 1500.0, "Book", "Fiction");
        book.displayDetails();

        // Creating Clothing Category Product
        ClothingCategory clothing = new ClothingCategory("T-Shirt", 1000.0, "Clothing", "Nike");
        clothing.displayDetails();

        // Applying discount on book
        System.out.println("\n Applying 10% discount on book");
        DiscountUtility.applyDiscount(book, 10);
        book.displayDetails();

        // Applying discount on clothing
        System.out.println("\n Applying 20% discount on clothing");
        DiscountUtility.applyDiscount(clothing, 20);
        clothing.displayDetails();
    }
}
