package com.PolymorphicTest.MiFactoryPhone;

class RedMi implements Phone{
    @Override
    public void call() {
        System.out.println("红米打电话");
    }
}
