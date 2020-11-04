package com.thisAndSuper;

public class Test1 {
    String name="Mick";
    public void print(String name){
        System.out.println("类中的属性 name="+this.name);
        System.out.println("局部传参的属性="+name);
    }
    public static void main(String[] args) {
        Test1 tt=new Test1();
        tt.print("Orson");
    }
}
