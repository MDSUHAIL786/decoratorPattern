package org.decoratorPattern.Decorator.Impl;

import org.decoratorPattern.BasePizza.BasePizza;
import org.decoratorPattern.Decorator.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;   //as Extra cheese have has-a relationship with BasePizza
    public ExtraCheese(BasePizza pizza){
        this.basePizza=pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
