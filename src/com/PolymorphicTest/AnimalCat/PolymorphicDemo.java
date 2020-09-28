package com.PolymorphicTest.AnimalCat;

public class PolymorphicDemo {
    public static void main(String[] args) {

        //父类引用 Animal a
        //指向 =
        //子类对象 new Cat()
        Animal a = new Cat();
        a.eat();

        Animal animal = new Animal();
        animal.eat();

        Cat cat = new Cat();
        cat.eat();
    }
}
