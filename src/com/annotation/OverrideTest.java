package com.annotation;

public class OverrideTest {
    /**
     * toString() 在java.Lang.Object中定义：
     * 因此，这里用@override标注是对的。
     */
    @Override
    public  String toString(){
        return "Override toString";
    }

    /**
     * getString() 没有在OverrideTest的任何父类中定义；
     * 但是，这里却用 @Override标注，因此会产生编译错误！
     */
    //@Override
    public String getString(){
        return "get toString";
    }

    public static void main(String[] args) {

    }
}
