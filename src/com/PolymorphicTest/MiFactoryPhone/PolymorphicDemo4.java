package com.PolymorphicTest.MiFactoryPhone;

public class PolymorphicDemo4 {
    public static void main(String[] args) {
        MiFactory factory = new MiFactory();
        factory.createPhone(new MiNote());

        factory.createPhone(new RedMi());
    }
}
