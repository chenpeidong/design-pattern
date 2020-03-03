package site.syso.factory.pizza.store;

import site.syso.factory.pizza.city.Pizza;
import site.syso.factory.pizza.city.ny.NYStyleCheesePizza;
import site.syso.factory.pizza.city.ny.NYStyleClamPizza;
import site.syso.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import site.syso.factory.pizza.ingredient.factory.impl.NYPizzaIngredientFactory;

public class NYPizzaStore extends AbstractPizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(nyPizzaIngredientFactory);
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza(nyPizzaIngredientFactory);
        }
        return pizza;
    }

}
