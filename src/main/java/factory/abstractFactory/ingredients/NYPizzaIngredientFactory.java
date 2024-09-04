package com.Usine.factory.abstractFactory.ingredients;

import com.Usine.factory.abstractFactory.ingredients.cheese.Cheese;
import com.Usine.factory.abstractFactory.ingredients.cheese.ReggianoCheese;
import com.Usine.factory.abstractFactory.ingredients.clams.Clams;
import com.Usine.factory.abstractFactory.ingredients.clams.FreshClams;
import com.Usine.factory.abstractFactory.ingredients.dough.Dough;
import com.Usine.factory.abstractFactory.ingredients.dough.ThinCrustDough;
import com.Usine.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.Usine.factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import com.Usine.factory.abstractFactory.ingredients.sauce.MarinaraSauce;
import com.Usine.factory.abstractFactory.ingredients.sauce.Sauce;
import com.Usine.factory.abstractFactory.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies [] veggies = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPapper()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
