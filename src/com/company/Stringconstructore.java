package com.company;

import java.util.Scanner;

public class Stringconstructore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i++] = (char)i+98;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
