package com.sunq.facade;

public class BizService {

    public BillType loadBillType() {
        return new BillType();
    }

    public NoRule loadNoRule() {
        return new NoRule();
    }

    public GroupWay loadGroupWay() {
        return new GroupWay();
    }
}
