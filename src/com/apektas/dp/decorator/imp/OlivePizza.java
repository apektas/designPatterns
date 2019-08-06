package com.apektas.dp.decorator.imp;

import com.apektas.dp.decorator.Pizza;
import com.apektas.dp.decorator.PizzaDecorator;

public class OlivePizza extends PizzaDecorator {

    public OlivePizza(Pizza currentPizza) {
        super(currentPizza);
    }

    @Override
    public String describe() {
        return super.describe() + " with OlivePizza";
    }

    @Override
    public float getCost() {
        return super.getCost() + 1;
    }
}
