package com.mobius.vision.jvm.classloader;

public class Person {
    private Person person;

    public void setPerson(Object object) {
        this.person = (Person)object;
        System.out.println("setPerson run");
    }
}
