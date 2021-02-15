package com.company;

import java.util.*;


public class Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        n=n%4;
        if(n==2||n==1)
            System.out.println(1);
        else
            System.out.println(0);

    }
}

