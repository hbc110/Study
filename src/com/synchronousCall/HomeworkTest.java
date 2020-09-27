package com.synchronousCall;

public class HomeworkTest {
    public static void main(String[] args) throws InterruptedException{
        Student student = new Student("张三",1);
        Teacher teacher = new Teacher("小小仙女");
        teacher.setStudent(student);
        teacher.assignHomework();
    }
}
