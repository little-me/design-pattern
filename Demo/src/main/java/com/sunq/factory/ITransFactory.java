package com.sunq.factory;

public interface ITransFactory {

    ITrans getTransImpl();

    IQuery getQueryImpl();
}
