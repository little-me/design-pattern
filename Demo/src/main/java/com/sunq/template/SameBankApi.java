package com.sunq.template;

public class SameBankApi extends BankApiTemplate {
    protected String getReq() {
        return "{'type':'same'}";
    }

    protected boolean parseResp(String resp) {
        return true;
    }
}
