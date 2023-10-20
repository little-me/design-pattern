package com.sunq.prototype;

public class PrototypeClient {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        SlowConn slowConn = new SlowConn();
        long now = System.currentTimeMillis();
        System.out.println("构造创建对象耗时" + (now - start));
        slowConn.clone();
        long now2 = System.currentTimeMillis();
        System.out.println("原型创建对象耗时" + (now2 - now));
    }

}
