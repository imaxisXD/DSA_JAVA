package com.company;

import java.util.Scanner;

public class KadanesAlgo_LargestSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The Value Of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Val Of Elmnts:");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSofar = arr[0];
        int maxEnd  =  arr[0] ;
        for (int i = 1; i < n; i++) {
            maxSofar = Math.max(arr[i], maxSofar+arr[i]);
            maxEnd = Math.max(maxEnd,maxSofar);
        }
        System.out.println("Sum Is :"+maxEnd);
    }
}
