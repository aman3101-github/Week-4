package org.example.mealplangenerator;

// Generic Class to manage different meal plans
public class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void displayMealDetails() {
        System.out.println("Meal Type: " + mealType.mealType());
        System.out.println("Calories: " + mealType.getCalories());
        mealType.mealIngredients();
    }
}
