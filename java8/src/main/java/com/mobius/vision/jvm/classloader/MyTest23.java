package com.mobius.vision.jvm.classloader;



/*
        在运行期，一个Java类是由该类的完全限定名（binary name，二进制名）和用于加载该类的定义类加载器
        （defining loader）所共同决定的。
        如果同样名字（即使相同的完全限定名）的类是由两个不同的类加载器所加载，那么这些类就是不同的，即便
        .class文件的字节码完全一样，并且从相同的位置加载亦是如此。

 */

/*
    内建于JVM中的启动类加载器会加载java.lang.ClassLoader以及其他的Java平台类，
    当JVM启动时，一块特殊的机器码会运行，他会加载扩展类加载器与系统类加载器，
    这段特殊的机器码叫做启动类加载器（Bootstrap）。

    启动类加载器还会负责加载供JRE正常所需要的基本组件，这包括java.util与java.lang包中的类。。。 等等

 */
public class MyTest23 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
