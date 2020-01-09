package com.mobius.vision.jdk8.stream2;

/**
 * @author NingXioaoming
 * @createTime 2019/11/29 13:58
 * @description
 */
public class LambdaTest {
    Runnable r1 = () -> System.out.println(this);

    Runnable r3 = () -> System.out.println(this);

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        Thread t1 = new Thread(lambdaTest.r1);
        t1.start();
        System.out.println("----------------");
        Thread t2 = new Thread(lambdaTest.r2);
        t2.start();
        System.out.println("----------------");
        Thread t3 = new Thread(lambdaTest.r3);
        t3.start();
    }
}
