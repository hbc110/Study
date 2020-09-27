package com.synchronousCall;

public class Student {
    private String name;
    private int id;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Student(){

    }

    public  Student(String name,int id){
        this.name = name;
        this.id = id;
    }

    public void doHomework() throws InterruptedException {
        System.out.println("我是" +this.getName()+ "，正在写我的家庭作业！");
        Thread.currentThread().sleep(5000);
        System.out.println("我写完了！");
    }
}
