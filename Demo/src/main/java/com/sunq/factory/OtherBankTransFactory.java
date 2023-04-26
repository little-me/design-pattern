package com.sunq.factory;

public class OtherBankTransFactory implements ITransFactory {

    public ITrans getTransImpl() {
        return new OtherBankTrans();
    }

    public IQuery getQueryImpl() {
        return new OtherBankQuery();
    }
}
