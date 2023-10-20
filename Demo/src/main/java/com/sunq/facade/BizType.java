package com.sunq.facade;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BizType {

    private BillType billType;
    private NoRule noRule;
    private GroupWay groupWay;

}
