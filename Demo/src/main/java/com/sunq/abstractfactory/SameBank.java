package com.sunq.abstractfactory;

/**
 * 抽象工厂模式
 * 提供一个接口创建一组相关的产品，这里的接口就是指ITransFactory
 * 可以彻底消除具体产品类型
 *
 * @author SunQiang
 * @date 2023/10/18 0:30
 * @version 1.0
 */
public class SameBank {

    ITransFactory factory;

    public SameBank(ITransFactory factory) {
        this.factory = factory;
    }

    public void queryAndTrans() {
        factory.getQueryImpl().doQuery();
        factory.getTransImpl().doTrans();
    }
}
