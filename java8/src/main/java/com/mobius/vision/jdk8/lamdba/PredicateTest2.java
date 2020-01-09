package com.mobius.vision.jdk8.lamdba;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author NingXioaoming
 * @createTime 2019/11/8 14:21
 * @description
 */
public class PredicateTest2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        PredicateTest2.filter(list, integer -> integer % 2 == 0);
        System.out.println("---------");
        PredicateTest2.filter(list, integer -> integer % 2 != 0);
        System.out.println("---------");
        PredicateTest2.filter(list, integer -> integer > 5);
        System.out.println("---------");
        PredicateTest2.filter(list, integer -> true);
        System.out.println("---------");
        PredicateTest2.filter2(list, integer -> integer > 5, integer -> integer % 2 == 0);

    }

    public static void filter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer i : list
        ) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }

    public static void filter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate1) {
        for (Integer i : list
        ) {
            if (predicate.and(predicate1).test(i)) {
                System.out.println(i);
            }
        }

    }

}
