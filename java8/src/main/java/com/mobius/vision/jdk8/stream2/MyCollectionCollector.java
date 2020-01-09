package com.mobius.vision.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @author NingXioaoming
 * @createTime 2019/11/25 14:35
 * @description
 */
public class MyCollectionCollector<T> implements Collector<T, Set<T>, Map<T, T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return ((set, t) -> {
            System.out.println("accumulator: " + Thread.currentThread().getName());
            set.add(t);
        });
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return ((set, set2) -> {
            set.addAll(set2);
            return set;
        });
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked");
        return set -> {
            Map<T, T> map = new HashMap<>();
            set.stream().forEach(item -> map.put(item, item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        //加上Characteristics.IDENTITY_FINISH说明不去调用finisher方法   直接默认将set强制转换成Map ，不加则表示调用finisher方法，方法中实现将set转化成map
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome", "nihao", "hello");
        HashSet<String> set = new HashSet<>();
        set.addAll(list);
        Map<String, String> map = set.stream().collect(new MyCollectionCollector<>());
        System.out.println(map);
    }
}
