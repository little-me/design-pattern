package com.sunq.state;

public class NoReqVoucherState implements VoucherState {

    @Override
    public void backToFin() {
        System.out.println("未请款，可以退回财政");
    }

    @Override
    public void reqMoney() {
        System.out.println("未请款，开始请款...");
        System.out.println("请款成功");
    }

    @Override
    public void trans() {
        System.out.println("未请款，不能转账");
    }

    @Override
    public void writeOff() {
        System.out.println("未请款，不能冲销");
    }

    @Override
    public void signAndSend() {
        System.out.println("未请款，无法签章发送");
    }
}
