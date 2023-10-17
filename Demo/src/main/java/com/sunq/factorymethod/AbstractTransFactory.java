package com.sunq.factorymethod;

/**
 * 工厂方法模式
 * 让子类决定，创建哪个对象。
 *
 * @author SunQiang
 * @date 2023/10/17 23:37
 * @version 1.0
 */
public abstract class AbstractTransFactory {

    public void trans() {
        ITrans trans = getTrans();
        trans.doTrans();
    }

    protected abstract ITrans getTrans();
}
