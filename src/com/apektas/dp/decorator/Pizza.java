package com.apektas.dp.decorator;

public abstract class Pizza {

    public String description = "Basic Pizza";

    public String describe(){
        return description;
    }

    public abstract float getCost();
}
