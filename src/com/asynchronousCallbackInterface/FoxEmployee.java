package com.asynchronousCallbackInterface;

public class FoxEmployee {
    private String name;
    private BossCallback bossCallback;

    public FoxEmployee() {

    }

    public FoxEmployee(String name, BossCallback bossCallback) {
        this.name = name;
        this.bossCallback = bossCallback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BossCallback getBossCallback() {
        return bossCallback;
    }

    public void setBossCallback(BossCallback bossCallback) {
        this.bossCallback = bossCallback;
    }

    //异步调用
    public void doTask(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                //做具体的业务
                long startTime = System.currentTimeMillis();
                try{
                    System.out.println("我是" + getName() + "，老板啊!我在玩命干活中!!!");
                    Thread.currentThread().sleep(8000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                long endTime = System.currentTimeMillis();
                long costTime = endTime - startTime;
                System.out.println("这个结果是我自己知道的, 但是我不会给老板说! 实际上我花了" + costTime / 1000 + "s");

                //回调，由此可以给出结果！
                bossCallback.doEvent();
            }
        };
        new Thread(r).start();
    }
}
