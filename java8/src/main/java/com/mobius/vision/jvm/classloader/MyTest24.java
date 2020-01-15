package com.mobius.vision.jvm.classloader;




/*
    当前类加载器（Current Classloader）

    每个类都会使用自己的类加载器（即加载自身的类加载器）去加载其他类（指的是所依赖的类），
    如果ClassX引用了ClassY，那么加载ClassX的类加载器就会去加载ClassY（前提ClassY没有被加载）

    线程上下文加载器（Context Classloader）

    线程上下文加载器从JDK1.2开始引入，类Thread中的getContextClassLoader()与setContextClassLoader(ClassLoader c1)
    分别用来获取和设置上下文的类加载器

    如果没有通过setContextClassLoader(ClassLoader c1)进行设置的话，线程将继承其父线程的上下文类加载器。
    Java应用运行是的初始线程的上下文类加载器是系统类加载器。在线程中运行的代码可以通过该类加载器来加载类与资源

    线程上下文类加载器的重要性：
    SPI（Service Provider Interface）服务提供商
    父ClassLoader可以使用当前线程Thread.CurrentThread(),getContextClassLoader()所指定的ClassLoader加载的类。
    这就改变了父ClassLoader不能使用子ClassLoader或是其他没有父子关系的ClassLoader加载的类的情况，即改变了双亲
    委托模型。

    线程上下文类加载器就是当前线程的Current ClassLoader

    在双亲委托模型下，类加载时由下到上的，即下层的类加载器会委托上层进行加载，但是对于SPI来说，有些接口是Java核心库
    提供的，而Java核心库是由启动类加载器来加载的，而这些接口实现却来自不同的jar包（厂商供应），Java的启动类加载器是
    不会加载其他来源的jar包，这样传统的双亲委托模型就无法满足SPI需求，而通过给当前线程设置上下文类加载器，就可以由设
    置的上下文类加载器来实现对于接口实现的加载。

 */
public class MyTest24 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());
    }
}
