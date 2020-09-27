package com.callBackTest;

public class Boss implements CallBackInterface {

    @Override
    public void execute() {
        System.out.println("收到了！！！"+System.currentTimeMillis());
    }
}
