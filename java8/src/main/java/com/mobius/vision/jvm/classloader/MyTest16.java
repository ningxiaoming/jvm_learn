package com.mobius.vision.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author NingXioaoming
 * @createTime 2019/12/21 10:43
 * @description
 */
public class MyTest16 extends ClassLoader {

    private String classLoaderName;
    private final String fileExtension = ".class";

    private String path;

    public void setPath(String path) {
        this.path = path;
    }

    public MyTest16(String classLoaderName) {
        super(); //将系统加载器当做该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent);//显示指定该类加载器的父加载器
        this.classLoaderName = classLoaderName;
//        System.out.println("nihap111");
    }

/*    @Override
    public String toString() {
        return "["+this.classLoaderName+"]";
    }*/

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        byte[] data = this.loadClassData(className);
        System.out.println("findClass invoked:" + className);
        System.out.println("class loader name:" + this.classLoaderName);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String className) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        className = className.replace(".", "\\");

        try {
            is = new FileInputStream(new File(this.path + className + this.fileExtension));
            baos = new ByteArrayOutputStream();
            int ch;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return data;
    }

/*    public static void test(ClassLoader classLoader) throws Exception{

        final Class<?> clazz = classLoader.loadClass("com.mobius.vision.jvm.classloader.MyTest1");
        final Object object = clazz.newInstance();
        System.out.println(object);
//        System.out.println(object.getClass().getClassLoader());
//        System.out.println(clazz.getClassLoader());
    }*/

    public static void main(String[] args) throws Exception {
        final MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\user\\Desktop\\");
        final Class<?> clazz = loader1.loadClass("com.mobius.vision.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz.hashCode());
        final Object object = clazz.newInstance();
        System.out.println(object.getClass().getClassLoader());

//        test(loader1);
        System.out.println("************************");
        final MyTest16 loader2 = new MyTest16(loader1, "loader2");
        loader2.setPath("C:\\Users\\user\\Desktop\\");
        final Class<?> clazz2 = loader2.loadClass("com.mobius.vision.jvm.classloader.MyTest1");
        System.out.println("class:" + clazz2.hashCode());
        final Object object2 = clazz2.newInstance();
        System.out.println(object2.getClass().getClassLoader());

    }
}
