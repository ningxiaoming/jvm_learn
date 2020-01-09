package com.mobius.vision.jdk8.lamdba;

import java.util.*;

/**
 * @author NingXioaoming
 * @createTime 2019/11/4 17:57
 * @description
 */


public class SwingTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 5, 2, 66, 5, 2);

        list.forEach(i -> {
            System.out.println(i);
        });

        //method reference
        list.forEach(System.out::println);


    }

}
