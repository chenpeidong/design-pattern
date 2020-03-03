package site.syso.factory.pizza.store;

import site.syso.factory.pizza.city.Pizza;
import site.syso.factory.pizza.city.chicago.ChicagoStyleCheesePizza;
import site.syso.factory.pizza.city.chicago.ChicagoStyleClamPizza;
import site.syso.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import site.syso.factory.pizza.ingredient.factory.impl.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore extends AbstractPizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory);
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza(chicagoPizzaIngredientFactory);
        }
        return pizza;
    }

}
