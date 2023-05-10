package com.niit.funtion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张三丰");

     /*   list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张")&&s.length()==3;
            }
        }).forEach(s -> System.out.println(s));*/

//        list.stream().filter(s ->s.startsWith("张")&&s.length()==3).forEach(s -> System.out.println(s));

        //调用其他类中的方法
        //对象名::方法名
//        list.stream().filter(new StringOpration()::StringJudge).forEach(s-> System.out.println(s));

        //调用本类中的方法
        //静态方法中是没有this关键字的，所以只能创建奔雷的实例对象来调用方法
        list.stream().filter(new FunctionDemo3()::JudgeString).forEach(s-> System.out.println(s));
    }
    public  boolean JudgeString(String s){
        return s.startsWith("张") && s.length()==3;
    }
}
