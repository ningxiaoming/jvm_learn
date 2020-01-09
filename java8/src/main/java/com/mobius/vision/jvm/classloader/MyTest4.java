package com.mobius.vision.jvm.classloader;

/**
 * @author NingXioaoming
 * @createTime 2019/12/12 14:44
 * @description
 */

/*
        主动使用new创建类的对象，所以MyParent4被示例化

        对于数组实例来说，其类型是有JVM在运行期间动态生成的，表示为[Lcom.mobius.vision.jvm.classloader.MyParent4
        这种形式，动态生成的类型，其类型是object

        对于数组来说，JavaDoc经常将构成数组的元素为Component，实际上就是将数组降低一个维度后的类型。

        助记符：
        anewarray ：表示创建一个引用类型的（如类，接口，数组）数组，并将其引用压入栈顶 如：MyParent4[] myParent4s = new MyParent4[1];
        newarray：表示创建一个指定的原始类型（如int，float，char等）的数组，并将其引用值压入栈顶。
 */
public class MyTest4 {
    public static void main(String[] args) {
        MyParent4 parent4 = new MyParent4();
        System.out.println("-=====");
        MyParent4 parent5 = new MyParent4();//一个类只能被实例化一次

        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());
        System.out.println(myParent4s.getClass().getSuperclass());
        System.out.println("==========");

        int[] arr = new int[1];
        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getSuperclass());

        boolean[] b = new boolean[1];
        System.out.println(b.getClass());
    }
}

class MyParent4 {
    static {
        System.out.println("MyParent static block");
    }
}

