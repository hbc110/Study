package com.fibonacci;

public class FibonacciByConstructor {
    private long[] temp = new long[12000];

    public FibonacciByConstructor(){
        temp[0] = 0;
        temp[1] = 1;
        for (int i = 2; i < temp.length; i++){
            temp[i] = temp[i-1] + temp[i-2];
        }
    }

    public long Fibonacci(int n){
        return temp[n];
    }
    // TODO 测试类
    public static void main(String[] args) throws NumberFormatException{
        long startTime = System.nanoTime();
        FibonacciByConstructor fibonacciByConstructor = new FibonacciByConstructor();
        // bug 1. 运算结果速度比传统方法慢
        int [] inParam = {0,1,2,3,5,50,100};
        for (int i : inParam){
            try{
                long result = fibonacciByConstructor.Fibonacci(i);
                System.out.println(result);
            } catch (NumberFormatException e){
                System.err.println(e);
            } finally {
                System.out.println("access");
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Finish Time: "+ (endTime-startTime) + " nanosecond");
    }
}
