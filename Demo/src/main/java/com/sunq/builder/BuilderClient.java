package com.sunq.builder;

public class BuilderClient {

    public static void main(String[] args) {
        CreamCoffee creamCoffee = new CreamCoffee();
        AbstractBuilder builder = new ConPannaCoffeeBuilder(creamCoffee);
        builder.setCup("玻璃杯").setSize(300).setCream("巧克力奶油").setCoffee("意式浓缩");
        System.out.println(creamCoffee);
    }

}
