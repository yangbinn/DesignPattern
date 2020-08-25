package com.amazing.designpatternslib.creation.singleton;

/**
 * 懒汉式
 * 有线程安全和线程不安全两种写法，区别就是synchronized关键字
 */
public class LazyManSingleton {

    private static LazyManSingleton INSTANCE;

    private LazyManSingleton() {
    }

    public static LazyManSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyManSingleton();
        }
        return INSTANCE;
    }

}
