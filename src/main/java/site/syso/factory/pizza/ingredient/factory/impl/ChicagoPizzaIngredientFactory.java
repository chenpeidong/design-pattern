package site.syso.factory.pizza.ingredient.factory.impl;

import site.syso.factory.pizza.ingredient.Cheese;
import site.syso.factory.pizza.ingredient.Dough;
import site.syso.factory.pizza.ingredient.Sauce;
import site.syso.factory.pizza.ingredient.factory.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        System.out.println("Chicago dough");
        return null;
    }

    @Override
    public Sauce createSauce() {
        System.out.println("Chicago sauce");
        return null;
    }

    @Override
    public Cheese createCheese() {
        System.out.println("Chicago cheese");
        return null;
    }

}
