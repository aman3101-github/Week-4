package org.example.mealplangenerator;

public class Main {
    public static void main(String[] args) {
        try {
            // Generate a Vegetarian Meal
            VegetarianMeal vegMeal = MealGenerator.generateMeal(VegetarianMeal.class);
            Meal<VegetarianMeal> vegetarian = new Meal<>(vegMeal);
            vegetarian.displayMealDetails();

            // Generate a Vegan Meal
            VeganMeal veganMeal = MealGenerator.generateMeal(VeganMeal.class);
            Meal<VeganMeal> vegan = new Meal<>(veganMeal);
            vegan.displayMealDetails();

        } catch (Exception e) {
            System.out.println("Error: Could not generate meal.");
        }
    }
}
