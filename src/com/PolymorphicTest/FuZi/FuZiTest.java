package com.PolymorphicTest.FuZi;

public class FuZiTest {
    //类的多态使用
    public static void main(String[] args) {

        //类的多态使用即父类引用指向子类的对象
        Fu f =new Zi();

        //接口的多态使用
        IFu ifu = new Zi();
        ifu.Imethod();

        //子类方法调用
        Zi zi = new Zi();
        zi.method();
        zi.Imethod();
    }

}
