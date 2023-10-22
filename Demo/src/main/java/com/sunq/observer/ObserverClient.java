package com.sunq.observer;

public class ObserverClient {
    public static void main(String[] args) {
        DressSuggest ds = new DressSuggest();
        SeasonState state = new SeasonState();
        state.addObserver(ds);
        state.changeSeason("春天");
    }
}
