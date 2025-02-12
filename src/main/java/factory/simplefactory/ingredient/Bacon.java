package com.Usine.factory.simplefactory.ingredient;

import com.Usine.factory.simplefactory.burgers.Burger;

public class Bacon extends IngredientDecorator {
    Burger burger;

    public Bacon(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Bacon";
    }

    @Override
    public double cost() {
        return 0.15d;
    }
}
