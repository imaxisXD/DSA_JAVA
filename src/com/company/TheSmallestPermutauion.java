package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TheSmallestPermutauion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Number of testcase
        int t = sc.nextInt();
        while(t>0) {
            //Number of elements
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if(arr[i] != i+1){
                    flag = true;
                    int pointer = 0;
                    for (int j = i; j < n; j++) {
                        if(arr[j]==i+1){
                            int temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                            break ;
                        }
                    }
                    break;
                }
            }
            if(!flag){
                int temp = arr[n-1];
                arr[n-1] = arr[n-2];
                arr[n-2] = temp;
            }
            for (int ele:arr) {
                System.out.print(ele+" ");
            }
            System.out.println();
            t--;

        }

    }
}
