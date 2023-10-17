package com.sunq.factorymethod;

public class SameBankTransFactory extends AbstractTransFactory {

    @Override
    protected ITrans getTrans() {
        return new SameBankTrans();
    }
}
