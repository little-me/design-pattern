package com.sunq.composite;

public class CompositeClient {
    public static void main(String[] args) {
        MenuFolder menuFolder = new MenuFolder();
        menuFolder.create("集中支付");
        MenuItem menuItem = new MenuItem();
        menuItem.create("集中支付初审");
        menuFolder.addChild(menuItem);
        System.out.println(menuFolder.getChildList());
    }
}
