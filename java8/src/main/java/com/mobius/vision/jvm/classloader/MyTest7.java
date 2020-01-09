package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/14 16:42
 * @description
 */
public class MyTest7 {

    public static void main(String[] args) throws ClassNotFoundException {
        final Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());


        final Class<?> clazzc = Class.forName("com.mobius.vision.jvm.classloader.bc");
        System.out.println(clazzc.getClassLoader());

    }


}

class bc {

}