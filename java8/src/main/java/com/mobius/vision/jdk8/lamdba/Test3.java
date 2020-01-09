package com.mobius.vision.jdk8.lamdba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author NingXioaoming
 * @createTime 2019/11/7 15:10
 * @description
 */
public class Test3 {

    public static void main(String[] args) {

/*        Myinterface1 myInterface1 = () -> { };
        Myinterface2 myinterface2 = ()->{};

        System.out.println(myInterface1.getClass().getInterfaces()[0]+"***"+myinterface2.getClass().getInterfaces()[0]);

        new Thread(() -> System.out.println("hello")).start();*/

        List<String> list = Arrays.asList("nihao", "xiaoming");
        list.forEach(item -> System.out.println(item.toUpperCase()));
        List<String> list1 = new ArrayList<>();
        list.forEach(item -> list1.add(item.toUpperCase()));
        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));

        Function<String, String> function = String::toUpperCase;


    }
}

@FunctionalInterface
interface Myinterface1 {
    void myMethod1();
}

@FunctionalInterface
interface Myinterface2 {
    void myMethod2();
}