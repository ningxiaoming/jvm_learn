package com.mobius.vision.jdk8.lamdba;

import java.util.function.Predicate;

/**
 * @author NingXioaoming
 * @createTime 2019/11/8 14:13
 * @description
 */
public class PredicateTest {

    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println(predicate.test("213213"));

        Predicate<String> predicate1 = s -> s.equals("hee");

        System.out.println(predicate1.equals("hee"));

    }
}
