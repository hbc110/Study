package com.thisAndSuper;

import org.omg.CORBA.Object;

public class Test2 {
    private int i=0;

    // 第一个构造器:有一个int型形参
    Test2(int i){
        System.out.println("i:"+this.i);
        this.i=i+1; //此时this表示引用成员变量ｉ;而非函数参数ｉ

        // 下面的i表示形参i,this.i表示数据成员
        System.out.println("Int constructor i--this.i: "+i+" -- " + this.i);
        System.out.println("i:"+this.i);
        System.out.println("i-1:"+(i-1)+" this.i+1:" + (this.i+1));
        // 从两个输出结果充分证明了i和this.i是不一样的!
    }

    // 第二个构造器:有一个String型形参
    Test2(String s){
        // 重新调用新的构造器之后,数据成员的值不再受到上一个的影响
        // java每个构造器都有自己独立内存空间吗？
        System.out.println("2i:"+this.i);
        System.out.println("String constructor:" + s);
    }

    // 第三个构造器:有一个int型形参和一个String型形参
    Test2(int i,String s){
        this(s); // this调用第二个构造器
        // 就算是构造方法调用构造器,也必须为于其第一行,构造方法也只能调用一个且仅一次构造器!
        //this(i);
        System.out.println("3i:"+this.i);
        this.i=i++; // this引用该类的成员变量
        System.out.println("Int constructor: "+i+"\n"+"String constructor:"+s);
    }

    Test2(int i,String s, double a){
        this(i);
        System.out.println("5i:"+this.i);
    }

    public Test2 increment(){
        System.out.println("4i:"+this.i);
        this.i++;
        return this; //返回的是当前的对象，该对象属于Test2
    }

    public static void main(String[] args) {
        Test2 tt0 = new Test2(10);
        Test2 tt1 = new Test2("ok");
        Test2 tt2 = new Test2(20,"ok again!");
        Test2 tt3 = new Test2(15, "okhushid", 0.12345);
        // 由于increment()通过this关键字返回了当前对象的引用,所以很容易在一条语句里面对同一个对象执行多次操作
        System.out.println(tt0.increment().increment().increment().i);
        // 输出的是this.i,就相当于输出其数据成员
        System.out.println(tt0.increment().increment().increment());
        // 该对象实现类的"类名+@+hashCode"值
    }

}
