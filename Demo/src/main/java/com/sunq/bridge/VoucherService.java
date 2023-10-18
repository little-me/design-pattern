package com.sunq.bridge;

public abstract class VoucherService {

    protected AsspService asspService;

    public abstract void backToFin();

    public abstract void resend();
}
