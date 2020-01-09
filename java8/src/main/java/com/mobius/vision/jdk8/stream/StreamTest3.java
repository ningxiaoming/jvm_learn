package com.mobius.vision.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author NingXioaoming
 * @createTime 2019/11/11 18:22
 * @description
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 6, 8);
        list.stream().map(i -> i * 2).forEach(integer -> System.out.println(integer));
        //给list中的每一个元素*2然后再相加操作
        //这是一个流：list是源，map是中间操作，reduce是终止操作
        System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));

    }
}
