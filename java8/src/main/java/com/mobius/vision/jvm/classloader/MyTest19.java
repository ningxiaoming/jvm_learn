package com.mobius.vision.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

public class MyTest19 {

    public static void main(String[] args) {

        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();

        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        Object o = new Object();
        System.out.println(o.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}
