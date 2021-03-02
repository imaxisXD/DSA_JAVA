package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaxDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter K:");
        int k = sc.nextInt();
        System.out.println("Enter n:");
        int n =sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = a[0]+k;
        int max = a[n-1]-k;
        int Diff = a[n-1] - a[0];

        for(int i =1;i<n;i++){
            if(a[i]>=k){
                int currMin = Math.min(min,a[i]-k);
                int currMax = Math.max(max,a[i-1]+k);
                int currDiff = currMax-currMin;
                Diff = Math.min(currDiff,Diff);
            }
        }
        System.out.println("The result:"+Diff);
    }
}
