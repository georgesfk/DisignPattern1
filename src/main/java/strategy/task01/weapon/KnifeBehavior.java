package com.Usine.strategy.task01.weapon;

public class KnifeBehavior implements WeaponBehavor {
    @Override
    public void useWeapon() {
        System.out.println(" hit the Knife");
    }
}
