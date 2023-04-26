package com.sunq.singleton;


public class DLCSingleton {

    private static volatile DLCSingleton instance;

    private DLCSingleton() {}

    public DLCSingleton getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (DLCSingleton.class) {
            if (instance == null) {
                instance = new DLCSingleton();
            }
        }
        return instance;
    }
}
