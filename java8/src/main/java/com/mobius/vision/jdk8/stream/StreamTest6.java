package com.mobius.vision.jdk8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author NingXioaoming
 * @createTime 2019/11/14 15:24
 * @description
 */
public class StreamTest6 {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 80);
        Student student1 = new Student("lisi", 90);
        Student student2 = new Student("wangwu", 100);
        Student student3 = new Student("zhaoliu", 90);
        Student student4 = new Student("zhaoliu", 90);
//        Student student5 = new Student("zhaoliu", 80);

        List<Student> students = Arrays.asList(student, student1, student2, student3, student4);
        //根据Student的name进行分组类似sql的group by
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
        Map<Integer, List<Student>> map1 = students.stream().collect(Collectors.groupingBy(Student::getScore));
        Map<String, Long> collect = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        Map<String, Double> collect1 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingInt(Student::getScore)));
        //对数据分区
        Map<Boolean, List<Student>> collect2 = students.stream().collect(Collectors.partitioningBy(student7 -> student7.getScore() > 80));

        System.out.println(collect2);

        System.out.println(map);
        System.out.println(map1);
        System.out.println(collect);
        System.out.println(collect1);

        students.stream().collect(Collectors.minBy(Student::compareByScore)).ifPresent(System.out::println);
        students.stream().collect(Collectors.maxBy(Student::compareByScore)).ifPresent(System.out::println);
        System.out.println(students.stream().collect(Collectors.averagingInt(Student::getScore)));
        System.out.println(students.stream().collect(Collectors.summingInt(Student::getScore)));
        IntSummaryStatistics collect3 = students.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println(collect3);
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining()));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",", "<start>", "<end>")));
        System.out.println("----------------------");

        Map<Integer, Map<String, List<Student>>> collect4 = students.stream().collect(Collectors.groupingBy(Student::getScore, Collectors.groupingBy(Student::getName)));
        System.out.println(collect4);

        Map<Boolean, List<Student>> collect5 = students.stream().collect(Collectors.partitioningBy(student5 -> student5.getScore() > 80));
        System.out.println(collect5);

        Map<Boolean, Long> collect6 = students.stream().collect(Collectors.partitioningBy(student5 -> student5.getScore() > 80, Collectors.counting()));
        System.out.println(collect6);


    }
}
