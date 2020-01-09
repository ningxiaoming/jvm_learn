package com.mobius.vision.jdk8.lamdba;

/**
 * @author NingXioaoming
 * @createTime 2019/11/5 11:21
 * @description
 */
@FunctionalInterface
interface MyInterface {
    void test1();
}

interface MyInterface1 {
    int ii = 1111;

    void test1();
}

class testt {
    int i = 110;
}

public class Test2 extends testt implements MyInterface, MyInterface1 {

    public void myTest(MyInterface myInterface) {
        System.out.println(i);
        System.out.println(ii);
        System.out.println("start");
        myInterface.test1();
        System.out.println("end");
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTest(() -> {
            System.out.println("MyInterface");
        });
        System.out.println(111111);

        MyInterface myInterface = () -> {
            System.out.println("hello");
        };
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }

    @Override
    public void test1() {

    }
}
