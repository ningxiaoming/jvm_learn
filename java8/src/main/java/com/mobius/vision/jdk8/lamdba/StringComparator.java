package com.mobius.vision.jdk8.lamdba;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author NingXioaoming
 * @createTime 2019/11/7 16:17
 * @description
 */
public class StringComparator {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("zhangsan", "李四", "wangwu", "aa");
/*        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        System.out.println(list);
    }
}
