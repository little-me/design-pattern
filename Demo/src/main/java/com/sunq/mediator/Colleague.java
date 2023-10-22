package com.sunq.mediator;

public interface Colleague {

    void setMediator(Mediator mediator);

    void receive(Colleague col, String msg);

    void send(String msg);

    String getName();
}
