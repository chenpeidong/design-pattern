package site.syso.factory.pizza.city.ny;


import site.syso.factory.pizza.city.Pizza;
import site.syso.factory.pizza.ingredient.factory.PizzaIngredientFactory;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        name = "NY style Clam Pizza";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
