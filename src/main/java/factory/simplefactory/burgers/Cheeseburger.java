package com.Usine.factory.simplefactory.burgers;

public class Cheeseburger extends Burger {
    public Cheeseburger() {
        description = "Cheeseburger";
    }

    @Override
    public double cost() {
        return 1.29d;
    }
}
