package com.sunq.proxy;

import lombok.Data;

@Data
public class EVoucher implements IVoucher {

    private String pay_account_no;
    private String pay_account_name;
    private String advance_account_no;
    private String advance_account_name;


    private String admdiv_code;
    private String voucher_no;

    public String getPayAcctNo() {
        return pay_account_no;
    }

    public String getPayAcctName() {
        return pay_account_name;
    }
}
