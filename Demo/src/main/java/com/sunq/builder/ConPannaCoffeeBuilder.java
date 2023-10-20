package com.sunq.builder;

public class ConPannaCoffeeBuilder extends AbstractBuilder {

    public ConPannaCoffeeBuilder(CreamCoffee creamCoffee) {
        this.creamCoffee = creamCoffee;
    }

    @Override
    public AbstractBuilder setCup(String cup) {
        creamCoffee.setCup(cup);
        return this;
    }

    @Override
    public AbstractBuilder setSize(int size) {
        creamCoffee.setSize(size);
        return this;
    }

    @Override
    public AbstractBuilder setCream(String cream) {
        creamCoffee.setCream(cream);
        return this;
    }

    @Override
    public AbstractBuilder setCoffee(String coffee) {
        creamCoffee.setCoffee(coffee);
        return this;
    }
}
