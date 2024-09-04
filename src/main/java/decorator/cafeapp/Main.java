package com.Usine.decorator.cafeapp;

import com.Usine.decorator.cafeapp.beverage.Beverage;
import com.Usine.decorator.cafeapp.beverage.Espresso;
import com.Usine.decorator.cafeapp.beverage.Size;
import com.Usine.decorator.cafeapp.components.Mocha;
import com.Usine.decorator.cafeapp.components.Soy;
import com.Usine.decorator.cafeapp.components.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.setSize(Size.TALL);
        espresso = new Whip(espresso);
        espresso = new Mocha(new Mocha(espresso));
        espresso = new Soy(espresso);
        System.out.println(espresso.getSize() + " "+espresso.getDescription() + " " + espresso.cost());
    }
}
