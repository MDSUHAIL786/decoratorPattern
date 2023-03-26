package org.decoratorPattern;

import org.decoratorPattern.BasePizza.BasePizza;
import org.decoratorPattern.BasePizza.Impl.FarmHouse;
import org.decoratorPattern.BasePizza.Impl.Margherita;
import org.decoratorPattern.Decorator.Impl.ExtraCheese;
import org.decoratorPattern.Decorator.Impl.Mushroom;

public class PizzaStore {
    public static void main(String[] args) {
        /*
        Let say customer want to know the cost of below combination pizza
        1. Margherita+Extra-Cheese
        2. Farmhouse+Extra-cheese+mushroom
         */
        BasePizza pizza1=new ExtraCheese(new Margherita());
        System.out.println("The cost of first combination of pizza is "+pizza1.cost());

        BasePizza pizza2=new Mushroom(new ExtraCheese(new FarmHouse()));
        System.out.println("The cost of second combination of pizza is "+ pizza2.cost());
    }
}