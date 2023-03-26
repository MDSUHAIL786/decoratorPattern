package org.decoratorPattern.BasePizza.Impl;

import org.decoratorPattern.BasePizza.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
