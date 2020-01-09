package com.mobius.vision.jvm.classloader;

import java.util.UUID;

/**
 * @author NingXioaoming
 * @createTime 2019/12/12 15:13
 * @description
 */

/*
        一个父接口并不会因为它的子接口或者实现类的初始化而初始化，
        只有当程序首次使用特定接口的静态变量时，才会导致该接口的初始化

 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.bb);
/*        new c();
        new c();*/
    }
}

interface MyParent5 {
    String bb = UUID.randomUUID().toString();
    //    static int c = 1/0;
    static int a = 4;
    Thread t = new Thread() {
        {
            System.out.println("MyParent5 run");
        }
    };
}

class MyChild5 implements MyParent5 {
    public static final String bbc = UUID.randomUUID().toString();
    public static final int b = 5;  //默认为 static和final的
}

class c {
    public c() {//第三执行
        System.out.println("无参构造 run");
    }

    {//第二执行
        System.out.println("nihao");
    }

    static {//先执行
        System.out.println("static 块 run");
    }
}
