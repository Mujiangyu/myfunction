package com.niit.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class TestDemo2 {
    public static void main(String[] args) {

        /*
        * 技巧：
        *   有没有一个方法符合当前的需求
        *   如果有这个方法，这个方法是否满足引用的规则
        *   (静态：
        *    成员：有两种方式引用
        *    构造：
        *       )
        * */


        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,
                new Student("zhangsan",23),
                new Student("lisi",24),
                new Student("wangwu",25),
                new Student("zhaoliu",26));

/*
        list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                String str = student.toString();
                return str;
            }
        })*/
        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

    }
}
