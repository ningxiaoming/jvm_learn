package com.mobius.vision.jvm.classloader;

public class MyTest18_1 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("/Users/xiaomingning/Desktop/");

        Class<?> clazz = loader1.loadClass("com.mobius.vision.jvm.classloader.MyTest1");

        System.out.println("class :"+clazz.hashCode());
        System.out.println("classloader :"+clazz.getClassLoader());


    }
}
