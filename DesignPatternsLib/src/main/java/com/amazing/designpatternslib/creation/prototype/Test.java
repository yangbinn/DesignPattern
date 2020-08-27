package com.amazing.designpatternslib.creation.prototype;

public class Test {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
//        Student student = new Student(18, "张三");
        for (int i = 0; i < 10000000; i++) {
            Student student = new Student(18, "张三");
//            student.clone();
        }
        System.out.println("time=" + (System.currentTimeMillis() - time));
    }

}
