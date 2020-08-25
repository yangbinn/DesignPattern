package com.amazing.designpatternslib.creation.singleton;

/**
 * 枚举
 */
public class EnumSingleton {

    private enum EnumSingletonHolder {
        INSTANCE;

        private EnumSingleton mEnumSingleton;

        EnumSingletonHolder() {
            mEnumSingleton = new EnumSingleton();
        }

        public EnumSingleton getEnumSingleton() {
            return mEnumSingleton;
        }
    }

    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return EnumSingletonHolder.INSTANCE.getEnumSingleton();
    }

}
