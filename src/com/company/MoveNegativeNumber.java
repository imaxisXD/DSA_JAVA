package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class MoveNegativeNumber {
        static void rearrange(int[] arr, int n){
//        {   int left =0,right=n-1;
//            int temp =0;
//            while(left<=right){
//                if(arr[left]>0 && arr[right]>0){
//                    right--;
//                }
//               else if(arr[left]<0 &&arr[right]<0){
//                   left++;
//                }
//                else if(arr[left]>0 && arr[right]<0){
//                    temp = arr[left];
//                    arr[left] = arr[right];
//                    arr[right] = temp;
//                    right--;
//                    left++;
//                }
//                else{
//                    left++;
//                    right--;
//                }
//            }
            int j =0;
            for (int i = 1; i <n ; i++) {
                if(arr[j]<0){
                    j++;
                    continue;
                }
                if(arr[i]<0&&arr[j]>0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j++;
                }
            }

        }

        // A utility function to print an array
        static void printArray(int[] arr, int n)
        {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }

        // Driver code
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            rearrange(arr, n);
            printArray(arr, n);
        }
    }

