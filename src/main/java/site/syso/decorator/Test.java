package site.syso.decorator;

import site.syso.decorator.beverage.Espresso;
import site.syso.decorator.beverage.HouseBlend;
import site.syso.decorator.condiment.Mocha;
import site.syso.decorator.condiment.Whip;

/**
 * 装饰者模式
 */
public class Test {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ", $" + espresso.cost());
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription() + ", $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + ", $" + houseBlend.cost());


    }

}
