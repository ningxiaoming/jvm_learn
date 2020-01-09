package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/24 15:06
 * @description
 */
public class MyCat {
    public MyCat() {
        System.out.println("MyCat loader by :" + this.getClass().getClassLoader());

        System.out.println("from MyCat :" + MySample.class);
    }
}
