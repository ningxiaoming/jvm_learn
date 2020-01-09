package com.mobius.vision.jdk8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author NingXioaoming
 * @createTime 2019/11/11 15:56
 * @description
 */
public class MethodReferenceTest {
    public static void main(String[] args) {

        Student student1 = new Student("zhangsan", 18);
        Student student2 = new Student("lisi", 20);
        Student student3 = new Student("wangwo", 22);
        Student student4 = new Student("xuebing", 16);
        List<Student> list = Arrays.asList(student1, student2, student3, student4);
        list.sort((studentParam1, studentParam2) -> Student.compareStudentByScore(studentParam1, studentParam2));
        //上下这两个排序等价，下面是上面的方法糖
        //1. 类名::静态方法名
        list.sort(Student::compareStudentByScore);
        list.forEach(student -> System.out.println(student.getScore()));
        //2.引用名（对象名）::实类方法名。
        StudentCompare studentCompare = new StudentCompare();
        list.sort(studentCompare::compareByScore);
        list.forEach(student -> System.out.println(student.getScore()));
        //3.类名::示例方法名。
        list.sort(Student::compareByScore);
        //4.构造方法引用：类名::new


        List<Integer> list1 = Arrays.asList(6, 43, 1, 5, 7);
        List<String> list2 = Arrays.asList("a", "q", "bv", "v", "c");
        Collections.sort(list2, String::compareToIgnoreCase);
        Collections.sort(list1, Integer::compareTo);
        list1.forEach(integer -> System.out.println(integer));


    }
}
