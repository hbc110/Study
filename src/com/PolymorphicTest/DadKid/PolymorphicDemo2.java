package com.PolymorphicTest.DadKid;

public class PolymorphicDemo2 {
    public static void main(String[] args) {
        Dad d = new Kid();
        System.out.println(d.num); //20

        d.method();//我是子类方法

        d.function();//我是父类静态方法
    }
}
