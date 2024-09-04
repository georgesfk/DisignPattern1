package com.Usine.factory.abstractFactory.pizza;

import com.Usine.factory.abstractFactory.ingredients.cheese.Cheese;
import com.Usine.factory.abstractFactory.ingredients.clams.Clams;
import com.Usine.factory.abstractFactory.ingredients.dough.Dough;
import com.Usine.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.Usine.factory.abstractFactory.ingredients.sauce.Sauce;
import com.Usine.factory.abstractFactory.ingredients.veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
