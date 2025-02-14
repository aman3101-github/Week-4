package org.example.mealplangenerator;

// subclass implements interface
public class VegetarianMeal implements MealPlan {

    // Abstract Method implementation of the interface
    @Override
    public String mealType() {
        return "Vegetarian Meal";
    }

    @Override
    public int getCalories(){
        return 500;
    }

    @Override
    public void mealIngredients(){
        System.out.println("Meal Ingredients: Rice, Milk, Curd, Paneer");
    }
}
