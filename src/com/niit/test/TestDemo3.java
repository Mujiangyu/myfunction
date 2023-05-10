package com.niit.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class TestDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,
                new Student("zhangsan",23),
                new Student("lisi",24),
                new Student("wangwu",25),
                new Student("zhaoliu",26));
       /* StringJoiner sj = new StringJoiner("-","","");
        String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                String name = student.getName();
                Integer age = student.getAge();
                name.concat("-"+age);
//                return name + "-" + age;

            }
        }).toArray(String[]::new);*/
        String[] strings = list.stream().map(Student::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

//        System.out.println(Arrays.toString(arr));
    }
}
