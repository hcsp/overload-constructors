package com.github.hcsp.objectbasic;

public class Cat {
    String name;
    int age;
    boolean cute;

    /** 创建一只指定名字的猫，age的默认值是1，cute的默认值是true */
    public Cat(String name) {
        this(name,1,true);
    }

    /** 创建一只指定名字和年龄的猫，cute的默认值是true */
    public Cat(String name, int age) {
        this(name,age,true);
    }

    /** 创建一只指定名字、年龄和萌属性的猫 */
    public Cat(String name, int age, boolean cute) {
        this.name = name;
        this.age = age;
        this.cute = cute;
    }
}
