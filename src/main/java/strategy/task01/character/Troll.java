package com.Usine.strategy.task01.character;

import com.Usine.strategy.task01.weapon.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Troll");
        weapon.useWeapon();
    }
}
