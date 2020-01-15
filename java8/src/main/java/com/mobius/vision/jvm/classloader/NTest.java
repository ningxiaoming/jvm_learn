package com.mobius.vision.jvm.classloader;

public class NTest {

    NTest(){
        System.out.println(Thread.currentThread().getContextClassLoader());
    }
}
