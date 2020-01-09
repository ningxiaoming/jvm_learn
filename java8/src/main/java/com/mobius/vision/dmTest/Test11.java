package com.mobius.vision.dmTest;

/**
 * @author NingXioaoming
 * @createTime 2019/12/21 15:40
 * @description
 */
public class Test11 {


    static int a = 1;

    public static void main(String[] args) {
        int c = 5;
        int[] arr = {1, 2};
        show(arr);
        System.out.println(arr[0]);

        Student student = new Student();
        student.setName("zhangsan");
        show(student);
        System.out.println(student.getName());

    }

    static void show(int[] cc) {
        cc[0] = 10;
    }

    static void show(Student student) {
        student.setName("李四");
    }
}

class Student {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
