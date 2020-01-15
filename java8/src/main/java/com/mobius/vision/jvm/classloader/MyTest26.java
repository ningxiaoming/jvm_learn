package com.mobius.vision.jvm.classloader;


/*
      线程上下文类加载器的一般使用模式（获取 ->  使用  ->  还原）
      案例:
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            //targetTccl 表示要使用的类加载器
            Thread.currentThread().setContextClassLoader(targetTccl);
            myMethod();
        }finally {
            Thread.currentThread().setContextClassLoader(classLoader);
        }
        myMethod()里面则调用了Thread.currentThread().getContextClassLoader()，获取当前线程的类加载器  做某些操作

        如果一个类由类加载器A加载，那么这个类的依赖类也是由类加载器A加载，（如果该类加载器没有被加载过的话）
        ContextClassLoader的作用就是为了破坏Java的类加载委托机制。

        当高层提供了统一的接口让底层去实现，同时又要在高层加载（或实例化）底层的类时，就必须要通过线程上下文类加载器来
        帮助高层的ClassLoader找到并加载该类。
 */

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class MyTest26 {
    public static void main(String[] args) {
        Thread.currentThread().setContextClassLoader(Thread.currentThread().getContextClassLoader().getParent().getParent());
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = serviceLoader.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println("driver: "+driver.getClass()+"   dirver ClassLoader： "+driver.getClass().getClassLoader());
        }

        NTest nTest = new NTest();


        System.out.println("当前线程的类加载器： "+Thread.currentThread().getContextClassLoader());
        System.out.println("serviceLoader 的类加载器： "+serviceLoader.getClass().getClassLoader());
        System.out.println("当前类的加载器： "+MyTest16.class.getClassLoader());
//        System.out.println("nTest的类加载器： "+ nTest.getClass().getClassLoader());


    }
}
