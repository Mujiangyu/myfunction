package com.niit.funtion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.function.Function;

public class FunctionDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aa", "bb", "cc", "dd");

        //将字符串转换为大写，实际上也是数据类型的转换，从小写的string转换为大写的String
        /*list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s-> System.out.println(s));*/

//        list.stream().map(s ->s.toUpperCase()).forEach(s-> System.out.println(s));
        /*
        * 方法引用的规则
        * 需要函数式接口
        * 被引用的方法必须存在
        * 被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致
        * 被引用方法的功能要满足当前的需求
        *
        * 抽象方法形参的详解
        * 第一个参数：
        *           表示被引用方法的调用者，决定了可以引用哪些类中的方法
        *           在stream流当中，第一个参数一般都表示流中的每一个数据
        *           假设流中的数据全部都是字符串，那么使用这种方式进行方法引用，只能引用string这个类中的方法
        *
        * 其余参数：
        *           跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用的方法需要时无参的成员方法
        *
        *
        *
        * */
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

        /*
        源码

        public String toUpperCase() {
        return toUpperCase(Locale.getDefault());
    }

     /*list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s-> System.out.println(s));
*/

    }
}
