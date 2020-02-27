package site.syso.strategy;

import site.syso.strategy.behavior.fly.impl.FlyNoWay;
import site.syso.strategy.behavior.fly.impl.FlyWithRocketPower;
import site.syso.strategy.behavior.fly.impl.FlyWithWings;
import site.syso.strategy.behavior.quack.impl.Quack;
import site.syso.strategy.behavior.quack.impl.Squeak;
import site.syso.strategy.duck.MallardDuck;
import site.syso.strategy.duck.ModelDuck;

/**
 * 策略模式
 */
public class Test {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.display();
        mallardDuck.preformFly();
        mallardDuck.preformQuack();
        System.out.println();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.display();
        modelDuck.preformFly();
        modelDuck.preformQuack();
        System.out.println();

        modelDuck.setFlyBehavior(new FlyWithRocketPower());
        modelDuck.preformFly();
    }

}
