package com.niit.funtion;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {2,3,8,4,6,7,9,5};


        //方法引用
        //引用处必须时函数式接口
        //被引用的方法必须已经存在
        //被引用的方法的此乃更惨和返回值需要跟抽象方法的形参和返回值保持一致
        //被引用方法的 功能需要满足当前的要求
        Arrays.sort(arr,FunctionDemo1::substraction);//::---->方法引用符号
        System.out.println(Arrays.toString(arr));
    }
    public static int substraction(int num1,int num2){
        return num2- num1;
    }
}
