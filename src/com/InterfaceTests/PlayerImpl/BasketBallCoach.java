package com.InterfaceTests.PlayerImpl;

//篮球教练
class BasketBallCoach extends Coach implements SpeakEnglish{
    @Override
    public void teach() {
        System.out.println("教扣篮");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
