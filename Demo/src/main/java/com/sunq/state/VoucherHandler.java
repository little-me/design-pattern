package com.sunq.state;

public class VoucherHandler {

    private VoucherState state;

    public VoucherHandler() {
        state = new NoReqVoucherState();
    }

    public void reqMoney() {
        state.reqMoney();
        state = new ReqedVoucherState();
    }

    public void trans() {
        state.trans();
    }

    public void signAndSend() {
        state.signAndSend();
    }

    public void writeOff() {
        state.writeOff();
    }

    public void backToFin() {
        state.backToFin();
    }

    public void printCurrentState() {
        System.out.println("当前状态:" + state.getClass().getSimpleName());
    }
}
