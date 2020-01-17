package com.mobius.vision.jvm.classloader;

import java.lang.reflect.Method;


/*
        类加载器的双亲委托模型得到好处：

        1.  可以确保Java核心库的类型安全，所有Java应用都至少引用java.lang.Object类，也就是说在运行期，java.lang.object这个类
            会被加载到Java虚拟机中；如果这个过程是由自己定义个Java应用类加载器所完成的，那么很可能就会在JVM中存在多个版本的
            java.lang.Object类，而且这些类之间还是不兼容的，互相不可见的（正是命名空间在发挥作用）。
            借助于双亲委托机制，Java核心类的加载工作都是由启动类加载器(null)来统一完成，从而确保Java应用所使用的都是同一个版本的
            Java核心类库，它们之间是互相兼容的。

        2.  可以确保Java核心类库所提供的类不会被自定义的类所代替。

        3.  不同类加载器可以为相同名称（binary name）的类创建额外的命名空间，相同的类可以并存于JVM中，只需要用不同的类加载器来
            加载它们即可，不同类加载器所加载的类之间是不兼容的，这就相当于在JVM中创建了一个又一个相互隔离的Java类空间，这类技术
            在很多框架中都得到了实际应用。


 */

public class MyTest21 {
    public static void main(String[] args) throws Exception {

        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");

        loader1.setPath("/Users/xiaomingning/Desktop/");
        loader2.setPath("/Users/xiaomingning/Desktop/");

        Class<?> clazz1 = loader1.loadClass("com.mobius.vision.jvm.classloader.Person");
        Class<?> clazz2 = loader2.loadClass("com.mobius.vision.jvm.classloader.Person");

/*        System.out.println(clazz1.getClassLoader());
        System.out.println(clazz2.getClassLoader());*/

        Object o = new Object();
        System.out.println(o.getClass().getClassLoader());

        System.out.println(Integer.class.getClassLoader());
        System.out.println(clazz1==clazz2);

        Object s = new String();

        Object object1 = clazz1.newInstance();
        Object object2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setPerson", Object.class);
        //由于object1和object2处于两个命名空间  不同命名空间里面的类是互相不可见的  所以报类型转换异常
        method.invoke(object1,object2);//报异常  Caused by: java.lang.ClassCastException: com.mobius.vision.jvm.classloader.Person cannot be cast to com.mobius.vision.jvm.classloader.Person



    }
}
