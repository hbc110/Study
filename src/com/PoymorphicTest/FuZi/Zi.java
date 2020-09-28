package com.PoymorphicTest.FuZi;

class Zi extends Fu implements IFu{

    public void method(){
        System.out.println("重写父类抽象方法");
    }

    @Override
    public void Imethod() {
        System.out.println("重写接口抽象方法");
    }
}

