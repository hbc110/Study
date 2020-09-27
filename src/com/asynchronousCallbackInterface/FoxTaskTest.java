package com.asynchronousCallbackInterface;

public class FoxTaskTest {
    public static void main(String[] args) {
        FoxBoss boss = new FoxBoss("大鲍斯");
        FoxEmployee employee = new FoxEmployee("王二",boss);
        boss.setFoxEmployee(employee);
        boss.assignTask();
    }
}
