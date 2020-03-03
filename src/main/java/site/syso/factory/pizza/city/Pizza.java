package site.syso.factory.pizza.city;


import site.syso.factory.pizza.ingredient.Cheese;
import site.syso.factory.pizza.ingredient.Dough;
import site.syso.factory.pizza.ingredient.Sauce;

public abstract class Pizza {

    protected String name;

    protected Dough dough;

    protected Sauce sauce;

    protected Cheese cheese;


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
