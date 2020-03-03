package site.syso.factory.pizza.store;

import site.syso.factory.pizza.city.Pizza;

public abstract class AbstractPizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);

}
