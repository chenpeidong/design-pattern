package site.syso.strategy.behavior.quack.impl;

import site.syso.strategy.behavior.quack.QuackBehavior;


public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }

}
