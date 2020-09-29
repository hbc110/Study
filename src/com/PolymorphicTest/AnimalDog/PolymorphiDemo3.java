package com.PolymorphicTest.AnimalDog;

public class PolymorphiDemo3 {
    public static void main(String[] args) {
        Animal2 a = new Dog();//向上转型
        a.eat();

        Dog d = (Dog)a;//向下转型
        d.swim();
    }
}
