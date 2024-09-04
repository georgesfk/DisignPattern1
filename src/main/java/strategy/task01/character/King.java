package com.Usine.strategy.task01.character;

import com.Usine.strategy.task01.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.print("King");
        weapon.useWeapon();
    }
}
