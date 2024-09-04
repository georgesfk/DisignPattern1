package com.Usine.factory.factorymethod.burgers.classic;

import com.Usine.factory.factorymethod.burgers.Burger;

public class Hamburger extends Burger {

    public Hamburger() {
        description = "Hamburger";
    }

    @Override
    public double cost() {
        return 0.99d;
    }
}
