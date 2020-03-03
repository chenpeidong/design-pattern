package site.syso.factory;

import site.syso.factory.pizza.city.Pizza;
import site.syso.factory.pizza.store.ChicagoPizzaStore;
import site.syso.factory.pizza.store.NYPizzaStore;

/**
 * 抽象工厂模式
 * 工厂方法模式
 */
public class Test {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        System.out.println();

        Pizza pizza1 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(pizza1.getName());
    }

}
