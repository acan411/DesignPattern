package priv.acan.creational.builder;

import priv.acan.creational.builder.manager.Meal;
import priv.acan.creational.builder.manager.MealBuilder;

/**
 * @author acan
 * @since 2022/12/12 04:06
 */
public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.vegMeal();
        vegMeal.showItem();
        System.out.println(vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.nonVegMeal();
        nonVegMeal.showItem();
        System.out.println(nonVegMeal.getCost());
    }
}
