package site.syso.strategy.duck;

import site.syso.strategy.behavior.fly.FlyBehavior;
import site.syso.strategy.behavior.quack.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;


    public abstract void display();

    public void preformFly() {
        flyBehavior.fly();
    }

    public void preformQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
