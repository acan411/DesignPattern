package priv.acan.creational.builder.manager;

import priv.acan.creational.builder.in.impl.item.burger.ChickenBurger;
import priv.acan.creational.builder.in.impl.item.burger.VegBurger;
import priv.acan.creational.builder.in.impl.item.drink.Coke;
import priv.acan.creational.builder.in.impl.item.drink.Pepsi;

/**
 * @author acan
 * @version 2022/12/12 04:02
 */
public class MealBuilder {

    public Meal vegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal nonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
