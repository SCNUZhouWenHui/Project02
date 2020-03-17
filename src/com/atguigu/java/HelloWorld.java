package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    private  static final int CURRY = 10;
    /**
     * 多行注释
     * @param args
     */
    public static void main(String[] args) {

        String java = "abs";
        System.out.println(java);
        method01();
        List list = new ArrayList();
        list.add(0, "111");
        list.add(0,2);
        System.out.println(CURRY);
    }
    //这是单行注释
    public static void method01(){
        //模板

        String test = "test";
        System.out.println(test);
    }

}
