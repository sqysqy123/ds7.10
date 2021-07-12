package com.hp.bean;

import java.util.ArrayList;

/*
 * 输出hello
 * */
public class MyJava {
    //main 方法快捷键  psvm
    public static void main(String[] args) {
        System.out.println("输出的快捷键是sout"); //sout 输出的快捷键
        String name = "云间小迪";
        System.out.println("name = " + name); //soutv 可以显示 变量
        System.out.println("MyJava.main"); //soutm 是输出 方法的名称
        System.out.println("args = [" + args + "]"); //soutp 是输出 方法的参数
        int age = 17;
        //如果小于18 就显示未成年
        if (age<18) {   //if 的快捷键是 ifn
            System.out.println("此仙女未成年");
        }
        ArrayList<String> strings = new ArrayList<>(); //万能快捷键 alt+enter
                  strings.add("唐三藏");  //ctrl+d 快速复制一行
                  strings.add("唐三藏");  //多行编辑 alt+光标
                  strings.add("唐三藏");
                  strings.add("唐三藏");  //ctrl+y 快速删除一行
                         //ctrl+z 一步撤销  ctrl+shift+z 多步撤销

        for (String string : strings) {      //遍历循环的快捷键 iter
            System.out.println("string = " + string);

        }

        //创建电脑
        Computer c1 = new Computer(); //说明他的 构造方法是 public
                 c1.setPrice(6000.0D);
                 c1.setColor("黑色");
                 c1.setTypeName("拯救者");
        System.out.println("c1 = " + c1);  //c1 = com.hp.bean.Computer@677327b6 内存
        // 内存地址是否一样，是判断对象是否相等的依据
        Computer c2 = new Computer();
        c1.setPrice(6000.0D);
        c1.setColor("黑色");
        c1.setTypeName("拯救者");


        System.out.println("c2 = " + c2);

        //判断c1 c2是否相等
        System.out.println(c1 ==  c2);  //false
        //以上就是原型模式 每次new 都会创建一个新对象
        //想要 对象每次new 都唯一怎么办？


        //测试单例模式
        //Phone p1 = new Phone()；//因为：无参构造私有化了..
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1 ==  p2); //true

        //单例模式 分为：饿汉，懒汉


    }

}
