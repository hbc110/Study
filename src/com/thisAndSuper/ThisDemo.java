package com.thisAndSuper;

public class ThisDemo {
    int number;
    ThisDemo increment(){
        number++;
        return this;
    }
    private void print(){
        System.out.println("number="+number);
    }

    public static void main(String[] args) {
        ThisDemo tt = new ThisDemo();
        tt.increment().increment().increment().print();
    }
}
