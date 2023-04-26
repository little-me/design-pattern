package com.sunq.proxy;

public class PayVoucher implements IVoucher {

    private EVoucher voucher;

    public PayVoucher (EVoucher voucher) {
        this.voucher = voucher;
    }


    public String getPayAcctNo() {
        return voucher.getPay_account_no();
    }

    public String getPayAcctName() {
        return voucher.getPay_account_name();
    }
}
