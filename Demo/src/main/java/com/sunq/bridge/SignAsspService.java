package com.sunq.bridge;

public class SignAsspService implements AsspService {
    @Override
    public void signAndSend() {
        System.out.println("签名发送");
    }

    @Override
    public void discard() {
        System.out.println("作废");
    }

    @Override
    public void sendOnly() {
        System.out.println("发送");
    }

    @Override
    public void returnToAssp() {
        System.out.println("退回凭证库");
    }
}
