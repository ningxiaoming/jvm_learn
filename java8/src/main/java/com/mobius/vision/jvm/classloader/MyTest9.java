package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/16 10:26
 * @description
 */
public class MyTest9 {

    static {
        System.out.println("MyTest9 runing");
    }

    public static void main(String[] args) {
        System.out.println(Child.i);
        System.out.println(Child.a);//不会初始化 Child类
    }

}

class Parent {

    public static int a = 2;

    static {
        System.out.println("parent run");
    }

}

class Child extends Parent {
    public static int i = 1;

    static {
        System.out.println("child run");
    }
}