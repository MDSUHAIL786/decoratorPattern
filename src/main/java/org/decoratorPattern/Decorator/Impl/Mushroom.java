package org.decoratorPattern.Decorator.Impl;

import org.decoratorPattern.BasePizza.BasePizza;
import org.decoratorPattern.Decorator.ToppingDecorator;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza; //as Mushroom have has-a relationship with BasePizza
    public Mushroom(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
