package com.Usine.factory.factorymethod.burgers.classic;

import com.Usine.factory.factorymethod.burgers.Burger;

public class Cheeseburger extends Burger {
    public Cheeseburger() {
        description = "Cheeseburger";
    }

    @Override
    public double cost() {
        return 1.29d;
    }
}
