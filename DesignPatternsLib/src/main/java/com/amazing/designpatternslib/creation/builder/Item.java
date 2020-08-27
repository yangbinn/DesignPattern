package com.amazing.designpatternslib.creation.builder;

/**
 * 条目
 */
public interface Item {

    String name();

    Packing packing();

    float price();

}
