package com.company;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Date data = Date.valueOf("1978-01-01");
        Person person =new Person();
        person.setBirthDate(data);
        boolean flag = person.isBornBoomer();
        System.out.println(flag);
    }
}
