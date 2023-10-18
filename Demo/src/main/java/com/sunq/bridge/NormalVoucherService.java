package com.sunq.bridge;

public class NormalVoucherService extends VoucherService {

    public NormalVoucherService(AsspService asspService) {
        this.asspService = asspService;
    }

    @Override
    public void backToFin() {
        asspService.returnToAssp();
    }

    @Override
    public void resend() {
        asspService.sendOnly();
    }
}
