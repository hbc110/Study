package com.algorithm;

public class T_0001_BigO {
    public static void main(String[] args) {

        int[] a = new int[10_000_000];
        for (int m = 0; m < a.length; m++) {
            a[m] = m;
        }
        //算法开始时间
        long before = System.currentTimeMillis();

        for (long i = 0; i < 100000L; i++){
            a[1_000_000] = 8;
            avg(a);
        }

        long after = System.currentTimeMillis();

        System.out.println(after - before);
        System.out.println(avg(a));


    }

    static int avg(int[] arr){
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return arr[1_000_000];
    }




}
