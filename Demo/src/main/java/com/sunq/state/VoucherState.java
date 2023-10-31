package com.sunq.state;

public interface VoucherState {

    void backToFin();

    void reqMoney();

    void trans();

    void writeOff();

    void signAndSend();
}
