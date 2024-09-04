package com.Usine.factory.factorymethod;

import com.Usine.factory.factorymethod.burgers.Burger;
import com.Usine.factory.factorymethod.stores.BurgerStore;
import com.Usine.factory.factorymethod.stores.NYBurgerStore;

public class Main {
    public static void main(String[] args) {
        BurgerStore nyBurgerStore = new NYBurgerStore();
        Burger burger = nyBurgerStore.orderBurger("hamburger");
        System.out.println(burger.toString());

    }
}
