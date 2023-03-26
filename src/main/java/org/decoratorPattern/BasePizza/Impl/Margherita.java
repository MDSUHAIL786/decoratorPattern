package org.decoratorPattern.BasePizza.Impl;

import org.decoratorPattern.BasePizza.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 120;
    }
}
