package com.learn.builder;

/**
 * Created by dong on 2017/4/4 0004.
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 15;
    }
}
