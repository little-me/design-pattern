package com.sunq.adapter;

import java.io.File;

public class SignAdapter implements StandardService {

    private ThirdPartyService service;

    public SignAdapter(ThirdPartyService service) {
        this.service = service;
    }

    @Override
    public void signStampByPos(File file, String stampId) {
        service.signStampByPos(file, 10, 10, stampId);
    }
}
