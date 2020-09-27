package com.girlFriend;

public class text {
    public static void main(String[] args) {
        GirlFriend girl = new ChinaGirlFriend(); //这里girl是上转型对象
        Boy boy = new Boy();
        boy.setGirlFriend(girl);
        boy.showGirlFriend();
        girl = new AmericanGirlFriend(); //girl是上转型对象
        boy.setGirlFriend(girl);
        boy.showGirlFriend();

    }
}
