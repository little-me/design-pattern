package com.sunq.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;

@Data
public class SlowConn implements Cloneable {

    public SlowConn() throws InterruptedException {
        // 漫长的连接获取
        Thread.sleep(5000);
        // 漫长的认证
        Thread.sleep(5000);
    }

    private String url;
    private int port;


    public Object clone() {
        try {
            SlowConn sc = (SlowConn) super.clone();
            return sc;
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new RuntimeException(e);
        }
    }
}
