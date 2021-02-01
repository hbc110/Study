package com.InterfaceTests.PlayerImpl;

class Person {
    String name;//姓名
    int age;//年龄
    String gender;//性别

    //无参构造
    public Person() {
    }

    //有参构造
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //吃
    public void eat(){
        System.out.println("吃饭");
    }

    //睡
    public void sleep(){
        System.out.println("睡觉");
    }
}
