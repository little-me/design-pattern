package com.sunq.proxy;

public class ReqVoucher implements IVoucher {

    private EVoucher voucher;

    public ReqVoucher (EVoucher voucher) {
        this.voucher = voucher;
    }


    public String getPayAcctNo() {
        return voucher.getAdvance_account_no();
    }

    public String getPayAcctName() {
        return voucher.getAdvance_account_name();
    }

}
