package com.Usine.factory.factorymethod.stores;

import com.Usine.factory.factorymethod.burgers.Burger;

public abstract class BurgerStore {
    

    public Burger orderBurger (String type){
        Burger burger;

        burger = createBurger(type);

        burger.prepare();
        burger.incase();
        return burger;
    }

    protected abstract Burger createBurger(String type);
}
