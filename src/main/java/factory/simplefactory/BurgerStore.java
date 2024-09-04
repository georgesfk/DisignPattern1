package com.Usine.factory.simplefactory;

import com.Usine.factory.simplefactory.burgers.Burger;
import com.Usine.factory.simplefactory.plants.SimpleBurgerFactory;

public class BurgerStore {
    SimpleBurgerFactory factory;

    public BurgerStore(SimpleBurgerFactory simpleBurgerFactory) {
        this.factory = simpleBurgerFactory;
    }

    public Burger orderBurger (String type){
        Burger burger;

        burger = factory.createPizza(type);

        burger.prepare();
        burger.incase();
        return burger;
    }
}
