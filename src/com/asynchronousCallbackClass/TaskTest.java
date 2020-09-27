package com.asynchronousCallbackClass;

public class TaskTest {
    public static void main(String[] args) {
        Boss boss = new Boss("大鲍斯");
        Employee employee = new Employee("王二",boss);
        boss.setEmployee(employee);
        boss.assignTask();
        //employee.doTask();
    }
}
