package com.mobius.vision.bytecode1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        RealSubject rs = new RealSubject();

        InvocationHandler ds = new DynamicSubject(rs);
        Class<?> cls = rs.getClass();
        Subject subject = (Subject) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),ds);

        subject.request();


    }
}
