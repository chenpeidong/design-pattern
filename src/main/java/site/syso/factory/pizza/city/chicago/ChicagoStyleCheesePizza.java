package site.syso.factory.pizza.city.chicago;


import site.syso.factory.pizza.city.Pizza;
import site.syso.factory.pizza.ingredient.factory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
