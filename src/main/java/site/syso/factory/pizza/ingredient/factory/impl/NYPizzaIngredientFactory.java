package site.syso.factory.pizza.ingredient.factory.impl;

import site.syso.factory.pizza.ingredient.Cheese;
import site.syso.factory.pizza.ingredient.Dough;
import site.syso.factory.pizza.ingredient.Sauce;
import site.syso.factory.pizza.ingredient.factory.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        System.out.println("NY dough");
        return null;
    }

    @Override
    public Sauce createSauce() {
        System.out.println("NY sauce");
        return null;
    }

    @Override
    public Cheese createCheese() {
        System.out.println("NY cheese");
        return null;
    }

}
