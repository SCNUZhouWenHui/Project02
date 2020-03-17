package com.atguigu.bean;

import java.util.Date;

public class Customer {
    /**
     *快捷键的使用
     * @param args
     */
    public static void main(String []args){

        //try_catch快捷键：Alt+Shift+z
        //shift+enter 下一行
        //全局搜索：Ctrl+H
        int num = 10;
        try {
            System.out.println("hello world。。。");
            Date date = new Date();
            System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
