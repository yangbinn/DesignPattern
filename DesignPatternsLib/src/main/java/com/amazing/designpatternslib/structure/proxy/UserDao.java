package com.amazing.designpatternslib.structure.proxy;

public class UserDao implements IUserDao {

    @Override
    public void saveData() {
        System.out.println("保存数据");
    }
}
