package org.example.mealplangenerator;

// Creating interface MealPlan : Acts as the blueprint
public interface MealPlan {
    // Abstract methods of the interface
    String mealType();
    int getCalories();
    void mealIngredients();
}
