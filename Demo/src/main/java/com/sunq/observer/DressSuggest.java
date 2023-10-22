package com.sunq.observer;

public class DressSuggest implements Observer {
    @Override
    public void update(String season) {
        if ("春天".equals(season)) {
            System.out.println("春天穿裙子");
        } else {
            System.out.println(season + "穿裤子");
        }
    }
}
