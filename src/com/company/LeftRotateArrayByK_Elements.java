package com.company;

import java.util.Scanner;

public class LeftRotateArrayByK_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the val of n:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        reverse(arr, 0, k-1);
        reverse(arr,k,n-1);
        reverse(arr, 0, n-1);
        for (int ele:
            arr ) {
            System.out.print(ele+" ");
        }
    }

    private static void reverse(int[] arr, int left, int right) {
        int temp = 0;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
    }
}
