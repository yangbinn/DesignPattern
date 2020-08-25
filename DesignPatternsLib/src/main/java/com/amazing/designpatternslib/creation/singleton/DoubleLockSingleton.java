package com.amazing.designpatternslib.creation.singleton;

/**
 * 双重检锁模式，综合了懒汉式和饿汉式两者的优缺点整合而成
 */
public class DoubleLockSingleton {

    private static DoubleLockSingleton INSTANCE;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleLockSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleLockSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
