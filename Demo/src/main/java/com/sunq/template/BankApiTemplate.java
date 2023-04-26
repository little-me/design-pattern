package com.sunq.template;

public abstract class BankApiTemplate implements IBankApi {
    public boolean invoke() {
        String req = getReq();
        String resp = doSend(req);
        boolean isTransSuccess = parseResp(resp);
        return isTransSuccess;
    }

    protected abstract String getReq();
    protected abstract boolean parseResp(String resp);


    private String doSend(String req) {
        // 调用http发起请求，及获取回执报文
        return "{'code': '0000', 'msg': 'success'}";
    }
}
