package com.amazing.designpatternslib.structure.proxy;

public class UserDaoProxy implements IUserDao{

    private UserDao mUserDao;

    public UserDaoProxy(){
        mUserDao = new UserDao();
    }

    @Override
    public void saveData() {
        System.out.println("开始代理");
        mUserDao.saveData();//执行目标对象的方法
        System.out.println("结束代理");
    }
}
