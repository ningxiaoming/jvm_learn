package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/24 17:11
 * @description
 */
public class MyTest17_1 {
    public static void main(String[] args) throws Exception {
        MyTest16 loder10 = new MyTest16("loader1");
        loder10.setPath("C:\\Users\\user\\Desktop\\");
        //将MySample类加载到JVM中
        final Class<?> clazz = loder10.loadClass("com.mobius.vision.jvm.classloader.MySample");
        System.out.println("class :" + clazz.hashCode());
        //做实例化MySample对象的操作
        final Object object = clazz.newInstance();

//        System.out.println(this.getClass().getClassLoader());


    }
}
