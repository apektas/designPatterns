package com.apektas.dp.decorator;

import com.apektas.dp.decorator.imp.BasicPizza;
import com.apektas.dp.decorator.imp.MushroomPizza;
import com.apektas.dp.decorator.imp.OlivePizza;

public class Client {

    // Client code to test decorator pattern
    public static void main(String[] args) {

        // Create basic pizza
        Pizza pizza = new BasicPizza();

        // then give the generated basic pizza to different decorator to change the pizza at runtime!
        // Actually pizzaDecorator includes a pizza object in it. - e.g. composition
        PizzaDecorator decorator = new MushroomPizza(new OlivePizza(new MushroomPizza(pizza)));
        System.out.println(decorator.describe());
        System.out.println(decorator.getCost());


    }

}
