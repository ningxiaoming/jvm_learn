package com.mobius.vision.jdk8.lamdba;

import java.util.function.Supplier;

/**
 * @author NingXioaoming
 * @createTime 2019/11/8 15:38
 * @description
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Person> supplier = Person::new;
        System.out.println(supplier.get().getUserName());
    }
}
