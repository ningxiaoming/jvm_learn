package com.mobius.vision.jdk8.lamdba;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author NingXioaoming
 * @createTime 2019/11/8 11:05
 * @description
 */
public class Test4 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setUserName("zhangsan");
        person.setAge(18);
        Person person1 = new Person();
        person1.setUserName("lisi");
        person1.setAge(20);
        Person person2 = new Person();
        person2.setUserName("wangwu");
        person2.setAge(22);
        List<Person> list = Arrays.asList(person, person1, person2);

        Test4 test4 = new Test4();
        List<Person> persons = test4.getPersonsByUsername("zhangsan", list);
        persons.forEach(pp -> System.out.println(pp.getUserName()));

        List<Person> personsByUsername = test4.getPersonsByUsername(20, list);
        personsByUsername.forEach(user -> System.out.println(user.getAge()));

        List<Person> personsByT = test4.getPersonsByT(19, list, (age, list1) ->
                list1.stream().filter(person3 -> person3.getAge() > age).collect(Collectors.toList())
        );
        personsByT.forEach(person3 -> System.out.println(person3.getAge()));
    }

    public List<Person> getPersonsByT(Integer age, List<Person> list, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, list);
    }

    public List<Person> getPersonsByUsername(String userName, List<Person> list) {
        list.forEach(person -> System.out.println(person.getUserName()));
        return list.stream().filter(person1 -> person1.getUserName().equals(userName)).collect(Collectors.toList());
    }

    public List<Person> getPersonsByUsername(Integer age, List<Person> list) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (age1, personList) ->
                personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        return biFunction.apply(age, list);
    }
}
