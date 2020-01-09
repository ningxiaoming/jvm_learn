package com.mobius.vision.jdk8.stream;

import java.util.stream.IntStream;

/**
 * @author NingXioaoming
 * @createTime 2019/11/11 18:18
 * @description
 */
public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.of(new int[]{2, 3}).forEach(System.out::println);
        System.out.println("------------------");
        IntStream.range(3, 8).forEach(System.out::println);
        IntStream.rangeClosed(3, 8).forEach(System.out::println);
    }
}
