package com.Usine.decorator.problemtask;

import com.Usine.decorator.problemtask.service.Espresso;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        espresso.setMilk();
        espresso.hasWhip();
        System.out.format(Locale.ENGLISH,"Beverage %.2f%n", espresso.cost());
    }
}
