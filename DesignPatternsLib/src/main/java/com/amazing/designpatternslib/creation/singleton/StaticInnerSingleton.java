package com.amazing.designpatternslib.creation.singleton;

/**
 * 静态内部类
 */
public class StaticInnerSingleton {

    private static class StaticInnerSingletonHolder {
        private static StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    private StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInnerSingleton.StaticInnerSingletonHolder.INSTANCE;
    }

}
