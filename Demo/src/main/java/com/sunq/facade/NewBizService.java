package com.sunq.facade;

public class NewBizService {

    public BizType loadBizType() {
        BizService bizService = new BizService();
        BillType billType = bizService.loadBillType();
        NoRule noRule = bizService.loadNoRule();
        GroupWay groupWay = bizService.loadGroupWay();
        BizType bizType = new BizType();
        bizType.setBillType(billType);
        bizType.setNoRule(noRule);
        bizType.setGroupWay(groupWay);
        return bizType;
    }
}
