package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/11 16:09
 * @description
 */

/*
        对于静态字段来说，只有只有直接定义了该字段的类才会被初始化
        JVM参数：
        -XX:+TraceClassLoading,用于追踪类的加载信息并打印出来

        -XX:+<option>,表示开启option选项
        -XX:-<option>,表示关闭option选项
        -XX:<option>=<value>,表示将option选项的值设置为value。

 */
public class MyTest1 {
    public static void main(String[] args) {
//        System.out.println(MyChild1.str);  //由于静态字段 str定义在MyParent1中所以只有MyParent1才被初始化了
        System.out.println(MyChild1.str2);   //由于初始化一个类的时候，他的父类也会被初始化，所以MyParent1和MyChild1都被初始化了
    }
}

class MyParent1 {
    public static String str = "Helle world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1 {
    public static String str2 = "Helle world welcome";

    static {
        System.out.println("MyChild1 static block");
    }
}
