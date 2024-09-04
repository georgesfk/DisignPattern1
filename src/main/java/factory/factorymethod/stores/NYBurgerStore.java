package com.Usine.factory.factorymethod.stores;

import com.Usine.factory.factorymethod.burgers.Burger;
import com.Usine.factory.factorymethod.burgers.nysyle.NYCheeseburger;
import com.Usine.factory.factorymethod.burgers.nysyle.NYHamburger;

public class NYBurgerStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        Burger burger = null;
        if (type.equals("Hamburger") || (type.equals("hamburger"))){
            burger = new NYHamburger();
        } else if (type.equals("Cheeseburger") || (type.equals("cheeseburger"))){
            burger = new NYCheeseburger();
        }
        return burger;
    }
}
