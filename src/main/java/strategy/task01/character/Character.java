package com.Usine.strategy.task01.character;

import com.Usine.strategy.task01.weapon.WeaponBehavor;

public abstract class Character {
    WeaponBehavor weapon;

    abstract void fight();
}
