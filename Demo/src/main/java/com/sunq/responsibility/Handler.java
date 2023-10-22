package com.sunq.responsibility;

public abstract class Handler {
    protected Handler next;

    void setNext(Handler handler) {
        this.next = handler;
    }

    public abstract void handleRequest(String req);
}
