package com.Usine.decorator.cafeapp.components;

import com.Usine.decorator.cafeapp.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
