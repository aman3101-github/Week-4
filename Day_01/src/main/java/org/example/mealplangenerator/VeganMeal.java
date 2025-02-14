package org.example.mealplangenerator;

// Class implements interface
public class VeganMeal implements MealPlan {

    // Abstract Method implementation of the interface
    @Override
    public String mealType() {
        return "Vegan Meal";
    }

    @Override
    public int getCalories() {
        return 600;
    }

    @Override
    public void mealIngredients() {
        System.out.println("Meal Ingredients: Rice, Salad, Lentil, Fruits");
    }
}