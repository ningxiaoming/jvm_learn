package com.mobius.vision.jvm.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyTest27 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("");
    }
}
