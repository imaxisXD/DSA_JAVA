package com.company;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1#

public class CyclicRotateBy1Elemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[n-1];
        for (int i = n-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for (int ele: arr) {
            System.out.print(ele+" ");
        }
    }
}
// 1 2 3 4 5
// 2 3 4 5