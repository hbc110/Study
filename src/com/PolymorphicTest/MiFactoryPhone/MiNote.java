package com.PolymorphicTest.MiFactoryPhone;

//小米Note
class MiNote implements Phone{
    @Override
    public void call() {
        System.out.println("小米Note打电话");
    }
}
