package com.sunq.strategy;

public class StrategyClient {
    public static void main(String[] args) {
        TradeData data = new TradeData();
        data.setPayAcctName("司马砸缸");
        TransHandler handler = new TransHandler(new NameValidateStrategy());
        handler.doTrans(data);
    }
}
