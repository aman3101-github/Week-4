package mealplangeneratortestfile;

import org.example.mealplangenerator.*;

public class MealPlannerTestFile {
    public static void main(String[] args) {
        System.out.println(" Meal Plan Generator Testing");

        try {
            // Generate a Vegetarian Meal
            System.out.println("\n Generating Vegetarian Meal");
            VegetarianMeal vegMeal = MealGenerator.generateMeal(VegetarianMeal.class);
            Meal<VegetarianMeal> vegetarian = new Meal<>(vegMeal);
            vegetarian.displayMealDetails();

            // Generate a Vegan Meal
            System.out.println("\n Generating Vegan Meal");
            VeganMeal veganMeal = MealGenerator.generateMeal(VeganMeal.class);
            Meal<VeganMeal> vegan = new Meal<>(veganMeal);
            vegan.displayMealDetails();

        } catch (Exception e) {
            System.out.println("Error: Could not generate meal.");
        }

        System.out.println("\n Test Completed Successfully");
    }
}
