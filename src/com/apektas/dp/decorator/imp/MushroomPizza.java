package com.apektas.dp.decorator.imp;

import com.apektas.dp.decorator.Pizza;
import com.apektas.dp.decorator.PizzaDecorator;

public class MushroomPizza extends PizzaDecorator {


    public MushroomPizza(Pizza currentPizza) {
        super(currentPizza);
        description = super.describe() + " with MushroomPizza";
    }

    @Override
    public String describe() {
        return description;
    }

    @Override
    public float getCost() {
        return super.getCost() + 3;
    }
}
