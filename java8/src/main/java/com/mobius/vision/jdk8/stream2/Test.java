package com.mobius.vision.jdk8.stream2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author NingXioaoming
 * @createTime 2019/11/26 10:33
 * @description
 */
public class Test {
    public static void main(String[] args) {

/*        Collectors.toList();
        Collector<Object, ?, ArrayList<Object>> objectArrayListCollector = Collectors.toCollection(ArrayList::new);
        Collectors.toSet();

        int i = 1;
        int[] arr = {1};
        List<Integer> list = Arrays.asList(1, 2);
        list.stream().map(item ->arr[0]=54).forEach(System.out::println);
        Stream<Object> empty = Stream.empty();
//        empty.map(item->i+5).forEach(System.out::println);
//        System.out.println(i);
        System.out.println(arr[0]);*/

/*        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream().map((item)->item+1).forEach(System.out::println);
        list.stream().map((item)->item+1).forEach(item-> System.out.println(item));*/

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(list1.stream().reduce(Integer::sum));

        list1.stream().forEach(System.out::println);


    }
}
