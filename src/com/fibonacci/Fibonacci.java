package com.fibonacci;

public class Fibonacci {
    public long Fibonacci(int n){
        if (n <= 1){
            return n;
        }
        long l = 0;
        long r = 1;
        long temp = 0;
        for (int count = 2; count <= n; count++){
            temp = l;
            l = r;
            r = temp + r;
        }
        return  r;
    }

    // TODO 测试类
    public static void main(String[] args) throws NumberFormatException{
        long startTime = System.nanoTime();
        Fibonacci fibonacci = new Fibonacci();
        // solution 1. 复数可以传入
        // solution 2. 大数快速计算
        int [] inParam = {0,1,2,3,5,100};
        for (int i : inParam){
            try{
                long result = fibonacci.Fibonacci(i);
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
