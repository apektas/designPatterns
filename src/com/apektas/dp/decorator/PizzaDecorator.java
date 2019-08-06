package com.apektas.dp.decorator;

public class PizzaDecorator extends Pizza {

    // pizza to change on demand
    protected Pizza currentPizza;

    public PizzaDecorator(Pizza currentPizza) {
        this.currentPizza = currentPizza;
    }

    @Override
    public String describe() {
        return currentPizza.describe();
    }

    @Override
    public float getCost() {
        return currentPizza.getCost();
    }
}
