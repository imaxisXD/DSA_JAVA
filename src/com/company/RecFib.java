package com.company;

import java.util.Scanner;

public class RecFib {
    public static  int fib(int num){
        if (num<=1)
            return num;
        int fib=fib(num-1)+fib(num-2);
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        for (int i =0;i<nums;i++)
            System.out.print(fib(i)+" ");
    }
}
