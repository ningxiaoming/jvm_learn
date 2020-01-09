package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/16 15:05
 * @description
 */
public class MyTest15 {
    public static void main(String[] args) {
        String[] arr = new String[2];
        System.out.println(arr.getClass().getClassLoader());


        System.out.println(int.class.getClassLoader());
    }
}
