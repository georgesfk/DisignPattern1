package com.Usine.factory.simplefactory.plants;

import com.Usine.factory.simplefactory.burgers.Burger;
import com.Usine.factory.simplefactory.burgers.Cheeseburger;
import com.Usine.factory.simplefactory.burgers.Hamburger;

public class SimpleBurgerFactory {
    public Burger createPizza (String type){
        Burger burger = null;
        if (type.equals("Hamburger") || (type.equals("hamburger"))){
            burger = new Hamburger();
        } else if (type.equals("Cheeseburger") || (type.equals("cheeseburger"))){
            burger = new Cheeseburger();
        }
        return burger;
    }
}
