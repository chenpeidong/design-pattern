package site.syso.factory.pizza.ingredient.factory;


import site.syso.factory.pizza.ingredient.Cheese;
import site.syso.factory.pizza.ingredient.Dough;
import site.syso.factory.pizza.ingredient.Sauce;

/**
 * 调料工厂
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

}
