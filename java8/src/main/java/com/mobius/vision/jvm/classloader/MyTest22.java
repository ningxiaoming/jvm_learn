package com.mobius.vision.jvm.classloader;

public class MyTest22 {

    static {

    }

    public static void main(String[] args) {


        System.out.println(MyTest22.class.getClassLoader());
        System.out.println(MyTest1.class.getClassLoader());
        System.out.println(MyTest22.class.getSuperclass().getClassLoader());
    }
}
