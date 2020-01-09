package com.mobius.vision.jdk8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NingXioaoming
 * @createTime 2019/11/22 11:21
 * @description
 */
public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "nihao", "world", "welcome");

//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());

        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());

//        Collections.sort(list,(item1,item2)->item2.length()-item1.length());
        Collections.sort(list, Comparator.comparingInt(String::length).reversed());

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);

        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
        System.out.println(list);

        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String::toLowerCase, Comparator.reverseOrder()));
        System.out.println(list);
        Collections.sort(list, Comparator.comparingInt(String::length).reversed().thenComparing(String::toLowerCase, Comparator.reverseOrder()));


//        Collections.sort(list);
        System.out.println(list);

    }
}
