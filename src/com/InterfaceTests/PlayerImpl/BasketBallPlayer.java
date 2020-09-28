package com.InterfaceTests.PlayerImpl;

class BasketBallPlayer extends Player implements SpeakEnglish{
    @Override
    public void study() {
        System.out.println("学扣篮");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
