package com.sunq.state;

public class ReqedVoucherState implements VoucherState {

    @Override
    public void backToFin() {
        System.out.println("已请款，请先冲销");
    }

    @Override
    public void reqMoney() {
        System.out.println("已请款，不要重复请款");
    }

    @Override
    public void trans() {
        System.out.println("已请款，开始转账...");
        System.out.println("转账成功");
    }

    @Override
    public void writeOff() {
        System.out.println("已请款，开始冲销...");
        System.out.println("冲销成功");
    }

    @Override
    public void signAndSend() {
        System.out.println("未转账，无法签章发送");
    }
}
