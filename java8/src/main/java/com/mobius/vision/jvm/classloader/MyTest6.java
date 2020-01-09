package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/12 20:34
 * @description
 */
public class MyTest6 {
    public static void main(String[] args) {
        Singleton.getInstance();  //调用静态方法 对类进行初始化  给静态变量赋初始值
        System.out.println("a=" + Singleton.a);
        System.out.println("b=" + Singleton.b);
    }
}

class Singleton {
    public static int a;
    private static Singleton singleton = new Singleton();//创建类的实例  对类进行初始化  给静态变量赋初始值 并执行构造方法   执行顺序 是从上往下

    public Singleton() {
        a++;
        b++;//准备阶段的意义
    }

    public static int b = 1;

    public static Singleton getInstance() {
        return singleton;
    }
}
