package com.mobius.vision.jdk8.lamdba;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author NingXioaoming
 * @createTime 2019/11/7 17:02
 * @description
 */
public class FunctionTest {

    public static void main(String[] args) {

        FunctionTest functionTest = new FunctionTest();
/*        System.out.println(functionTest.computer(1,value ->{return 2*value;}));
        System.out.println(functionTest.computer(2,value->5+value));
        System.out.println(functionTest.convert(22,1,value->value+"dd"));*/
        //   System.out.println(functionTest.add(5,6,(value1,value2)->value1-value2));
        System.out.println(functionTest.computer(3, value -> value + value, value1 -> value1 * value1));

        System.out.println(functionTest.addThe(1, 2, (value1, value2) -> value1 + value2, value3 -> value3 * value3));
        //先将1和2作为参数给biFunction：1+2得3然后将3作为参数给function3*3得9
    }

    public Integer addThe(int a, int b, BiFunction<Integer, Integer, Integer> biFunction,
                          Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }

    public int computer(int a, Function<Integer, Integer> function, Function<Integer, Integer> function1) {
        Integer apply = function.apply(a);

        return function.compose(function1).apply(a);
    }

    public String convert(int b, int a, Function<Integer, String> function) {
        return function.apply(b + a);
    }

    public Integer add(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }
}
