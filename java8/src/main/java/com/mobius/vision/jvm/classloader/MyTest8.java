package com.mobius.vision.jvm.classloader;

import java.util.UUID;

/**
 * @author NingXioaoming
 * @createTime 2019/12/16 10:03
 * @description
 */
public class MyTest8 {

    public static void main(String[] args) {
        System.out.println(FinalTest.a);
        System.out.println(FinalTest.b);
        System.out.println(FinalTest.uuid);
    }
}

class FinalTest {
    public static final int a = 1;
    public static int b = 10;
    public static final String uuid = UUID.randomUUID().toString();

    static {
        System.out.println("你好");
    }
}
