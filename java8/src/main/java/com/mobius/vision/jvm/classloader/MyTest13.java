package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/16 13:45
 * @description
 */
public class MyTest13 {

    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        while (null != systemClassLoader) {
            systemClassLoader = systemClassLoader.getParent();
            System.out.println(systemClassLoader);
        }

    }
}
