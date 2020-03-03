package site.syso.factory.pizza.city.ny;


import site.syso.factory.pizza.city.Pizza;
import site.syso.factory.pizza.ingredient.factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "NY style Sauce and Cheese Pizza";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
