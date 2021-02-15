package com.company;

//import java.util.Scanner;
import java.util.*;

public class Gcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int flag=0;
        for(int tc=0;tc<t;t++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] sarr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sarr[i] = arr[i];

            }
            Arrays.sort(sarr);
            int min = sarr[0];
            for (int i = 0; i < n; i++)
                if (arr[i] != sarr[i] && arr[i] % min != 0) {
                    flag = 1;
                    break;
                }
            if(flag==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}



