package com.company;

import java.sql.Date;

public class Test {

    static int value = 11;

    public static void main(String[] args) {

        new Test().printValue();

    }

    private void printValue() {
        int value = 22;
        System.out.println(this.value);
    }


}

class Person {

    private Date birthDate;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Person() {

    }

    boolean isBornBoomer() {
        Date startDate = Date.valueOf("1946-01-01");
        Date endDate = Date.valueOf("1964-01-01");
        return birthDate.compareTo(startDate)>=0 && birthDate.compareTo(endDate) < 0;
    }

    public static void main(String[] args) {

    }
}


