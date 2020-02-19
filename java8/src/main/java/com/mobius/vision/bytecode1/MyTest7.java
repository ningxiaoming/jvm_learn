package com.mobius.vision.bytecode1;

import java.util.Date;




/*
    针对于方法调用动态分派的过程，虚拟机会在类的方法区建立一个虚方法表的数据结构（virtual method table，简称vtable）
    针对于invokeinterface指令来说，虚拟机会建立一个叫做接口方法表的数据结构（interface method table，简称itable）


 */
public class MyTest7 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.test("nihao");
        dog.test(new Date());
    }

}


class Animal{
    public void test(String str){
        System.out.println("Animal str");
    }
    public void test(Date date){
        System.out.println("Animal date");
    }
}
class Dog extends Animal{
    @Override
    public void test(Date date) {
        System.out.println("Dog date");
    }

    @Override
    public void test(String str) {
        System.out.println("Dog str");
    }
}
