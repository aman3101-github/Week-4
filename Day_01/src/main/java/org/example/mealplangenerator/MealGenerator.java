package org.example.mealplangenerator;

public class MealGenerator {
    // Generic Method to Generate a Meal
    public static <T extends MealPlan> T generateMeal(Class<T> mealClass) throws Exception {
        return mealClass.getDeclaredConstructor().newInstance();
    }
}
