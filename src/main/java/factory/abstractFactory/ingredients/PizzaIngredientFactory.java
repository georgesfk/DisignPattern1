package com.Usine.factory.abstractFactory.ingredients;

import com.Usine.factory.abstractFactory.ingredients.cheese.Cheese;
import com.Usine.factory.abstractFactory.ingredients.clams.Clams;
import com.Usine.factory.abstractFactory.ingredients.dough.Dough;
import com.Usine.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.Usine.factory.abstractFactory.ingredients.sauce.Sauce;
import com.Usine.factory.abstractFactory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
