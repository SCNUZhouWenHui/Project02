package com.atguigu.bean;


/**
 * @author wenhui
 * @create 2020-03-17 0:06
 */
public class Hello {

    public static final int num = 10;
    /**
     * 客户Id
     */
    private static  int custom_id = 12;
    /**
      * 客户姓名
    */
    private String custom_name;

    public static void main(String[] args) {

        System.out.println(custom_id);
        String name = "wenhui";
        System.out.println("name = " + name);
        System.out.println(num);
    }
    public void testInsert(){
        System.out.println("Hello.testInsert");
    }


}
