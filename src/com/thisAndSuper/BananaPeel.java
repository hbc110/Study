package com.thisAndSuper;

class Banana{
    void peel(int i){
        System.out.println(i);
    }

}
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana();
        Banana b = new Banana();

        a.peel(1);
        b.peel(2);
    }
}

class Apricot {
    void pick() {
    }

    void pit() {
        pick();
    }

}
class Leaf{
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}

class Person2{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

class PassingThis{
    public static void main(String[] args) {
        new Person2().eat(new Apple());
    }
}


