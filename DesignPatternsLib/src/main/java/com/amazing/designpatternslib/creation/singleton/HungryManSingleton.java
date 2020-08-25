package com.amazing.designpatternslib.creation.singleton;

/**
 * 饿汉式,线程安全
 * 浪费内存空间
 */
public class HungryManSingleton {

    private static HungryManSingleton INSTANCE = new HungryManSingleton();

    private HungryManSingleton() {
    }

    public static HungryManSingleton getInstance() {
        return INSTANCE;
    }

}
