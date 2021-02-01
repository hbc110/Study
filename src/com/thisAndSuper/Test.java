package com.thisAndSuper;

/**
 * VM args: -XX:+UnlockCommercialFeatures
 */
public class Test {
    int petalCount = 0;
    String s = "initial value";
    Test(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }
    Test(String ss){
        //s = ss;
        System.out.println("Constructor w/ String arg only, s = " + s);
        // 如果将上面的语句放到下面,这输出s的值就是initial value;
        s = ss;
    }
    Test(String s,int petals){
        // Can't call two!
        this(petals);
        //this(s);
        // 上面语句是调用另外一个构造器,下面是将由于参数s的名称和数据成员s的名字相同,所以会产生歧义
        // 因此使用this.s来代表数据成员就能解决这个问题
        this.s = s; // Another use of "this"
        System.out.println("String & int args");

    }
    Test(){
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount(){
        // this(11); // error! Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + " s = "+s);
    }

    public static void main(String[] args) {
        Test x = new Test();
        x.printPetalCount();
    }
}
