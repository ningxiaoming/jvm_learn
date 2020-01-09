package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/24 15:08
 * @description
 */
public class MySample {

    public MySample() {
        System.out.println("MySample loader by :" + this.getClass().getClassLoader());
        new MyCat();
    }
}
