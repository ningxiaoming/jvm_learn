package com.mobius.vision.jdk8.lamdba;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author NingXioaoming
 * @createTime 2019/11/11 14:34
 * @description
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> heloo = Optional.of("1111");//一定不为空
        Optional<String> heloo1 = Optional.empty();//一定为空
        Optional<String> heloo2 = Optional.ofNullable("1111");//不确定是否为空
        heloo.ifPresent(item -> System.out.println(item));
        System.out.println("--------------------");
        System.out.println(heloo.orElse("nijhap"));

        List<String> list = Arrays.asList("nihapo", "wohap");
        List<String> list1 = Arrays.asList();
        Person person = new Person();
        person.setList(list1);
        Optional<Person> optional = Optional.ofNullable(person);
        //判断person是否为空方法
        System.out.println(optional.map(thePerson -> thePerson.getList()).orElse(Collections.emptyList()));

    }
}
