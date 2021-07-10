package com.hp.bean;


import org.jetbrains.annotations.Contract;

/*
* 标准的单例模式 步骤：1 2 3
* spring 框架默认 单例模式
* */
public class Phone {
    //2.在对象本身 new 自己，而且是一个static修饰的
    private static Phone ourInstance = new Phone();
    //3.写出 返回自身对象的方法的返回值

   @Contract(pure = true)public static Phone getInstance() {
        return ourInstance;
    }

    //1.无参构造方法私有化
    private Phone() {
    }
}
