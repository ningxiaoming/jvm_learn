package com.mobius.vision.jdk8.lamdba;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author NingXioaoming
 * @createTime 2019/11/8 16:35
 * @description
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        System.out.println(BinaryOperatorTest.compute(1, 2, (a, b) -> a * b));

        System.out.println(BinaryOperatorTest.compute1("hell", "world", (a, b) -> a.length() - b.length()));
    }

    public static int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public static String compute1(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.maxBy(comparator).apply(a, b);
    }
}
