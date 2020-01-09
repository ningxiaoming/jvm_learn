package com.mobius.vision.jdk8.stream2;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author NingXioaoming
 * @createTime 2019/11/26 16:05
 * @description
 */
public class AutoCloseableTest implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close  invoked");
    }

    public void test() {
        System.out.println("你好");
    }

    public static void main(String[] args) throws Exception {

        try (AutoCloseableTest autoCloseableTest = new AutoCloseableTest()) {
            autoCloseableTest.test();
        }
    }
}
