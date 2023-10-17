package com.sunq.factorymethod;

public class OtherBankTransFactory extends AbstractTransFactory {

    @Override
    protected ITrans getTrans() {
        return new OtherBankTrans();
    }
}
