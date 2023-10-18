package com.sunq.bridge;

public class BridgeClient {
    public static void main(String[] args) {
        StampAsspService stampAsspService = new StampAsspService();
        NormalVoucherService normalVoucherService = new NormalVoucherService(stampAsspService);
        normalVoucherService.resend();

        System.out.println("更换抽象层========");
        SpecialVoucherService specialVoucherService = new SpecialVoucherService(stampAsspService);
        specialVoucherService.resend();

        System.out.println("更换实现层========");
        SignAsspService signAsspService = new SignAsspService();
        SpecialVoucherService specialVoucherService2 = new SpecialVoucherService(signAsspService);
        specialVoucherService2.resend();
    }
}
