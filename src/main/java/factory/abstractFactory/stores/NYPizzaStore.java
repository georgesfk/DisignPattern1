package com.Usine.factory.abstractFactory.stores;

import com.Usine.factory.abstractFactory.ingredients.NYPizzaIngredientFactory;
import com.Usine.factory.abstractFactory.ingredients.PizzaIngredientFactory;
import com.Usine.factory.abstractFactory.pizza.CheesePizza;
import com.Usine.factory.abstractFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
