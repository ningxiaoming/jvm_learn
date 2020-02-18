package com.mobius.vision.bytecode1;

public class MyTest2 {

    String str = "nihao";

    private int x =1;

    public static Integer i = 2;

    public void setX(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();

        myTest2.x=6;
        i=10;

    }
}
