package com.Usine.factory.factorymethod.burgers.nysyle;

import com.Usine.factory.factorymethod.burgers.Burger;

public class NYCheeseburger extends Burger {
    public NYCheeseburger() {
        description = "NYCheeseburger";
        name = "NY style Cheeseburger with coleslaw";
        bun = "low crunch bun";
        cutlet = "large beef cutlet";
        toppings.add("salad");
        toppings.add("gauda cheese");
    }

    @Override
    public double cost() {
        return 1.34d;
    }
}
