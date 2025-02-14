package org.example.dynamiconlinemarketplace;

public class BookCategory extends Product<String> {
    // Specific attribute of the BookCategory class
    private String genre;

    // Constructor of the class
    public BookCategory(String productName, double productPrice, String category, String genre){
        super(productName, productPrice, category);
        this.genre = genre;
    }

    // Getter method
    public String getGenre(){
        return genre;
    }

    // Method overriding of the Generic class
    @Override
    public void displayDetails(){
        System.out.println("Product Name: " + getName());
        System.out.println("Product Category: " + getCategory());
        System.out.println("Product Price: " + getPrice());
        System.out.println("Book Genre: " + getGenre());
    }
}
