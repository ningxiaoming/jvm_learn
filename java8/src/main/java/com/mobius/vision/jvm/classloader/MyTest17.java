package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/24 15:13
 * @description
 */
public class MyTest17 {
    public static void main(String[] args) throws Exception {
        MyTest16 loder1 = new MyTest16("loader1");
        //将MySample类加载到JVM中
        final Class<?> clazz = loder1.loadClass("com.mobius.vision.jvm.classloader.MySample");
        System.out.println("class :" + clazz.hashCode());
        //做实例化MySample对象的操作
        final Object object = clazz.newInstance();


    }
}
