package com.mobius.vision.jvm.classloader;

import sun.misc.Launcher;

public class MyTest25 implements Runnable {

    private Thread thread;

    public MyTest25(){
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        ClassLoader contextClassLoader = this.thread.getContextClassLoader();
//        this.thread.setContextClassLoader(contextClassLoader);

        System.out.println("Class: "+contextClassLoader.getClass());
        System.out.println("Parent: "+contextClassLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest25();
    }
}
