package com.niit.funtion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6");

        //匿名内部类
       /* list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s -> System.out.println(s));*/

        //lambda表达式
//        list.stream().map(s -> Integer.parseInt(s)).forEach(s -> System.out.println(s));

        //静态方法引用
        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
