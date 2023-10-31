package com.sunq.state;

public class StateClient {
    public static void main(String[] args) {
        VoucherHandler vh = new VoucherHandler();
        vh.printCurrentState();
        vh.reqMoney();
        vh.printCurrentState();
    }
}
