package com.niit.funtion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhang-15","li-16","wang-17","zhao-18","zheng-19");
/*
        List<Student> newlist = list.stream().map(s ->
        new Student(s.split("-")[0],
        Integer.parseInt(s.split("-")[1])))
        .collect(Collectors.toList());
        System.out.println(newlist);*/

        List<Student> list2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(list2);
    }
}
