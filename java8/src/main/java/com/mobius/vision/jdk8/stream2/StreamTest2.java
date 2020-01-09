package com.mobius.vision.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author NingXioaoming
 * @createTime 2019/11/27 10:39
 * @description
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello");

        try (Stream<String> stream = list.stream()) {
            stream.onClose(() -> {
                System.out.println("你好");
                throw new NullPointerException("exception run");
            }).onClose(() -> {
                System.out.println("我好");
                throw new NullPointerException("exception run");
            }).onClose(() -> {
                System.out.println("我好");
                throw new NullPointerException("exception run");
            }).forEach(System.out::println);
        }
    }
}
