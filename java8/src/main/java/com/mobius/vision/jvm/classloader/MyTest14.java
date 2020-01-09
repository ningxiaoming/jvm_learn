package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/16 13:56
 * @description
 */
public class MyTest14 {
    public static void main(String[] args) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        System.out.println(contextClassLoader);


        final Class<MyTest14> clazz = MyTest14.class;
        System.out.println(clazz.getClassLoader());//由系统类加载sun.misc.Launcher$AppClassLoader@18b4aac2
        final Class clazz1 = String.class;
        System.out.println(clazz1.getClassLoader()); //由根类或者启动类加载的，null    因为String位于rt.jar包中
    }
}
