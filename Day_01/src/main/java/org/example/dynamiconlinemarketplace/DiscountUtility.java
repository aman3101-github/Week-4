package org.example.dynamiconlinemarketplace;

/* Utility class to apply discounts on the product using generic method
    Utility class - class that contains only static methods and constants, it is not meant to be
    instantiated and provides common, reusable functionalities across multiple classes,
    usually contains private constructor
 */
public class DiscountUtility {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage){
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage/100.00);
        product.setPrice(discountedPrice);
        System.out.println("Discounted price of " + product.getName() + " is Rs. " + product.getPrice());
    }
}

