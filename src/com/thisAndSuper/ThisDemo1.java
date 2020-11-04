package com.thisAndSuper;

public class ThisDemo1 {
    String name;
    int age;
    public ThisDemo1(){
        this.age=21;
    }
    public ThisDemo1(String name,int age){
        this();
        this.name="Nick";
    }
    private void print(){
        System.out.println("最终名字="+this.name);
        System.out.println("最终的年龄="+this.age);
    }

    public static void main(String[] args) {
        ThisDemo1 tt = new ThisDemo1("", 0);  // 随便传进去的参数
        tt.print();
    }
}
