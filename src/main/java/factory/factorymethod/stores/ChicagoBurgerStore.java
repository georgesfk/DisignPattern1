package com.Usine.factory.factorymethod.stores;

import com.Usine.factory.factorymethod.burgers.Burger;
import com.Usine.factory.factorymethod.burgers.chicagostyle.ChicagoCheeseburger;
import com.Usine.factory.factorymethod.burgers.chicagostyle.ChicagoHamburger;

public class ChicagoBurgerStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        Burger burger = null;
        if (type.equals("Hamburger") || (type.equals("hamburger"))){
            burger = new ChicagoHamburger();
        } else if (type.equals("Cheeseburger") || (type.equals("cheeseburger"))){
            burger = new ChicagoCheeseburger();
        }
        return burger;
    }
}
