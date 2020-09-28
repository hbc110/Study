package com.PolymorphicTest.DadKid;

class Kid extends Dad {
    int num = 10;

    public void method(){
        System.out.println("我是子类方法");
    }

    public static void function(){
        System.out.println("我是子类静态方法");
    }
}
