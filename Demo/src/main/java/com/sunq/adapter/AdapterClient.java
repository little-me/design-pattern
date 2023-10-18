package com.sunq.adapter;

import java.io.File;

public class AdapterClient {

    public static void main(String[] args) {
        SignAdapter adapter = new SignAdapter(new ThirdPartyService());
        adapter.signStampByPos(new File("C:/123.txt"), "10001010");
    }
}
