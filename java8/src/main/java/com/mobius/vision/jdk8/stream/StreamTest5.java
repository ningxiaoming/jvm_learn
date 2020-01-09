package com.mobius.vision.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author NingXioaoming
 * @createTime 2019/11/12 17:53
 * @description
 */
public class StreamTest5 {
    public static void main(String[] args) {
        //对五百万个UUID进行排序

/*        List<String> list = new ArrayList(5000000);
        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("排序开始");
        long startTime = System.nanoTime();
       // list.stream().sorted().count();//串行排序----->单线程
        list.parallelStream().sorted().count();//并行排序--->多线程执行
        long endTime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(endTime-startTime);
        System.out.println("排序所用时间："+millis);*/
//        List<String> list = Arrays.asList("hello", "nihao", "hey");
//        list.stream().map(item->item).filter(length->length.length()==5).findAny().ifPresent(System.out::println);
/*        int i=0;
        list.stream().mapToInt(item->{
            int length=item.length();
            System.out.println(item);
            return length;
        }).filter(length->length==5).findFirst().ifPresent(item-> System.out.println(item));*/

//        list1.stream().map(item->item.split(" ")).collect(Collectors.toList()).forEach(item->Arrays.asList(item).stream().map(ite->ite).distinct().forEach(System.out::println));

        //List<String> list1 = Arrays.asList("hello ww", "hello ee", "qq hello");
        //flatMap:将多个stream打平放到一个stream中     （单词去重）
        //list1.stream().map(item->item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);

        List<String> list = Arrays.asList("hi", "hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu");
        list.stream().flatMap(item -> list2.stream().map(item1 -> item + " " + item1)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
