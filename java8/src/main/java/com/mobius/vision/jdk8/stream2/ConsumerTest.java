package com.mobius.vision.jdk8.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * @author NingXioaoming
 * @createTime 2019/11/28 13:39
 * @description
 */
public class ConsumerTest {

    public void test(Consumer<Integer> consumer) {
        consumer.accept(100);
    }

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();

        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);

        consumerTest.test(consumer);//面向对象式的对象传递
        consumerTest.test(intConsumer::accept);//函数时方式，传递行为--等价于下面
        consumerTest.test(i -> System.out.println(i));//

    }
}
