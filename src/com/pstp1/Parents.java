package com.pstp1;

import com.pstp.Person;


public class Parents {
    public String uname = "haha";
    Person p = new Person();
    public void test2(){
        System.out.println(p.uname);
    }

    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.test2();

    }
}
