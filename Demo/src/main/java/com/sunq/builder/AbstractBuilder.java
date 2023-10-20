package com.sunq.builder;

public abstract class AbstractBuilder {

    protected CreamCoffee creamCoffee;

    public abstract AbstractBuilder setCup(String cup);
    public abstract AbstractBuilder setSize(int size);
    public abstract AbstractBuilder setCream(String cream);
    public abstract AbstractBuilder setCoffee(String coffee);

}
