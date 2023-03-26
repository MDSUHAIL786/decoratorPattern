package org.decoratorPattern.BasePizza.Impl;

import org.decoratorPattern.BasePizza.BasePizza;

public class FarmHouse extends BasePizza {

    @Override
    public int cost() {
        return 200;
    }
}
