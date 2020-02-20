package com.mobius.vision.bytecode1;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("From real subject");
    }
}
