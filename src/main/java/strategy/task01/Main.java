package com.Usine.strategy.task01;

import com.Usine.strategy.task01.character.*;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer();
        archer.fight();
        King king = new King();
        king.fight();
        Knight knight = new Knight();
        knight.fight();
        Troll troll = new Troll();
        troll.fight();
        Queen queen = new Queen();
        queen.fight();
    }
}
