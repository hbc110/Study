package com.fibonacci;

import com.sun.deploy.panel.DeleteFilesDialog;

public class FibonacciByRecursive {
    public long Fibonacci(long n){
        if (n ==0 || n == 1)
            return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    // TODO 测试类
    public static void main(String[] args) throws NumberFormatException{
        long startTime = System.currentTimeMillis();
        FibonacciByRecursive fibonacciByRecursive = new FibonacciByRecursive();
        // bug 1. 负数不能传入
        // bug 2. 数字太大运算速度太慢
        int[] inParam = {0,1,2,3,5,50};
        for (int i : inParam){
            try{
                long result = fibonacciByRecursive.Fibonacci(i);
                System.out.println(result);
            } catch (NumberFormatException e){
                System.err.println(e);
            } finally {
                System.out.println("access");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Finish Time: "+ (endTime-startTime) + " msec");
    }
}
