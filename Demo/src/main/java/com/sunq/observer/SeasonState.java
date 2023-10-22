package com.sunq.observer;

import java.util.ArrayList;
import java.util.List;

public class SeasonState implements Subject {

    private List<Observer> observerList;
    private String season;

    public SeasonState() {
        observerList = new ArrayList<>();
    }

    public void changeSeason(String season) {
        this.season = season;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(season);
        }
    }
}
