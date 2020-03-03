package site.syso.factory.pizza.city.chicago;


import site.syso.factory.pizza.city.Pizza;
import site.syso.factory.pizza.ingredient.factory.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        name = "Chicago Style Clam Pizza";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
