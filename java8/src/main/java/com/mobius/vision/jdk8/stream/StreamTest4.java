package com.mobius.vision.jdk8.stream;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author NingXioaoming
 * @createTime 2019/11/12 10:11
 * @description
 */
public class StreamTest4 {
    public static void main(String[] args) {
        //一个流只能被操作一次 多次操作编译报错：Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        Stream<String> stream = Stream.of("hello", "nihap");
//        String[] strings = stream.toArray(length -> new String[length]);
        //等价于上面   这里使用方法引用
//        String[] strings1 = stream.toArray(String[]::new);
        //将stream转化成list集合
/*        List<String> collect = stream.collect(Collectors.toList());
        collect.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("hello","nihap","word");
//        List<String> collect1 = stream1.collect(Collectors.toList());
        ArrayList<String> collect1 = stream1.collect(() -> new ArrayList(), (theList, iteam) -> theList.add(iteam), (theList1, theList2) -> theList1.addAll(theList2));
        //下面的方法引用等价于上面的lambda表达式
        stream1.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        collect1.forEach(item-> System.out.println(item));
*/
        Stream<String> stream2 = Stream.of("nihaop", "wohao", "dajiahao");
        //将流转化成LinkedHashSet以及其他....
//        LinkedHashSet<String> collect2 = stream2.collect(Collectors.toCollection(LinkedHashSet::new));
        //将流对象转化成String
/*        String collect3 = stream2.collect(Collectors.joining());
        System.out.println(collect3);*/

        List<String> list = Arrays.asList("nihap", "wobuhao");
        //将集合中的元素转化成大写并输出
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(item -> System.out.println(item));

        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1, 2), Arrays.asList(2, 3), Arrays.asList(4, 5));
        //flatMap的用法：将多个集合组成的流压成一个流
        listStream.flatMap(theList -> theList.stream()).map(item -> item * item).forEach(integer -> System.out.println(integer));

        //通过Stream的generate静态方法生成Stream对象，然后输出Stream流中的第一个元素
        Stream<String> stream1 = Stream.generate(UUID.randomUUID()::toString);
        stream1.findFirst().ifPresent(System.out::println);
        //构造88个偶数放到Stream流中然后输出2,4,8,16    n+1=n*n
//        Stream.iterate(2,item->item*2).limit(88).forEach(System.out::println);
        Stream<Integer> stream3 = Stream.iterate(1, item -> item + 2).limit(6);
        //取出stream3中的大于2的元素，每一个乘以二，然后再提出前两个元素，然后再取出前两元素，然后去掉重复元素,然后再相加
/*        stream3.filter(itemIn -> itemIn > 200).mapToInt(item -> item * 2).skip(2).limit(2).distinct().max().ifPresent(System.out::println);
        System.out.println(stream3.filter(itemIn -> itemIn > 200).mapToInt(item -> item * 2).skip(2).limit(2).distinct().sum());*/
        //Stream.summaryStatistics();返回IntSummaryStatistics对象包含了一些数字的结果（max，min，count。。。。）
        IntSummaryStatistics intSummaryStatistics = stream3.filter(itemIn -> itemIn > 2).mapToInt(item -> item * 2).skip(2).limit(2).distinct().summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getCount());

    }
}
