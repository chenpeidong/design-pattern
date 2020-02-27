package site.syso.strategy.behavior.fly.impl;

import site.syso.strategy.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly.");
    }

}
