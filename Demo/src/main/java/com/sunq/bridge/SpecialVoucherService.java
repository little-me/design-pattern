package com.sunq.bridge;

public class SpecialVoucherService extends VoucherService {

    public SpecialVoucherService(AsspService asspService) {
        this.asspService = asspService;
    }

    @Override
    public void backToFin() {
        asspService.signAndSend();
    }

    @Override
    public void resend() {
        asspService.discard();
        asspService.signAndSend();
    }
}
