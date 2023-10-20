package com.sunq.facade;

public class FacadeClient {

    public static void main(String[] args) {
        NewBizService newBizService = new NewBizService();
        BizType bizType = newBizService.loadBizType();
        System.out.println(bizType);
    }
}
