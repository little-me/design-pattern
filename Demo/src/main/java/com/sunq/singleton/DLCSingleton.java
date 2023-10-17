package com.sunq.singleton;

/**
 * 单例模式
 * Double Checked Locking (双重检查锁定)
 *
 * @author SunQiang
 * @date 2023/10/15 20:57
 * @version 1.0
 */
public class DLCSingleton {

    private static volatile DLCSingleton instance;

    private DLCSingleton() {}

    public DLCSingleton getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (DLCSingleton.class) {
            if (instance == null) {
                instance = new DLCSingleton();
            }
        }
        return instance;
    }
}
