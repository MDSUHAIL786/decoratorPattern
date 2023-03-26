package org.decoratorPattern.Decorator.Impl;

import org.decoratorPattern.BasePizza.BasePizza;
import org.decoratorPattern.Decorator.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza){
        this.basePizza=pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
