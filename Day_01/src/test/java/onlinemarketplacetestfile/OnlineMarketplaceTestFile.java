package onlinemarketplacetestfile;

import org.example.dynamiconlinemarketplace.*;

public class OnlineMarketplaceTestFile {
    public static void main(String[] args) {
        System.out.println("Online Marketplace Testing");

        // Creating Book Category Product
        BookCategory book = new BookCategory("The Alchemist", 1500.0, "Book", "Fiction");
        System.out.println("\n Book Details Before Discount");
        book.displayDetails();

        // Creating Clothing Category Product
        ClothingCategory clothing = new ClothingCategory("T-Shirt", 1000.0, "Clothing", "Nike");
        System.out.println("\n Clothing Details Before Discount");
        clothing.displayDetails();

        // Applying discount on Book
        System.out.println("\nApplying 10% discount on Book...");
        DiscountUtility.applyDiscount(book, 10);
        System.out.println("\n Book Details After Discount ");
        book.displayDetails();

        // Applying discount on Clothing
        System.out.println("\nApplying 20% discount on Clothing...");
        DiscountUtility.applyDiscount(clothing, 20);
        System.out.println("\n Clothing Details After Discount");
        clothing.displayDetails();

        System.out.println("\n Test Completed Successfully");
    }
}
