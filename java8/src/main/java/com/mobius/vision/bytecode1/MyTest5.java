package com.mobius.vision.bytecode1;



/*

         方法的静态分派
        Grandpa g1 = new Father();
        以上代码，g1的静态类型是Grandpa，而g1的实际类型（真正指向的类型）是Father

        我们可以得出一个结论：变量的静态类型是不会发生变化的，而变量实际类型则是可以改变的（多态的一种体现），实际类型在
        运行期方可确定。


 */

public class MyTest5 {

    public void test(Grandpa grandpa){
        System.out.println("grandpa");
    }
    public void test(Father father){
        System.out.println("father");
    }
    public void test(Son son){
        System.out.println("son");
    }


    public static void main(String[] args) {
        Grandpa g1 = new Father();
        Grandpa g2 = new Son();

        MyTest5 myTest5 = new MyTest5();
        myTest5.test(g1);
        myTest5.test(g2);
    }
}

class Grandpa{

}
class Father extends Grandpa{

}
class Son extends  Father{

}
