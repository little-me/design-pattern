package com.sunq.abstractfactory;

public interface ITransFactory {

    ITrans getTransImpl();

    IQuery getQueryImpl();
}
