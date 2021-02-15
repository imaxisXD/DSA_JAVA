package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer>hm = new HashMap<>();
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            if(hm.containsKey(arr1[i]))
                hm.computeIfPresent(arr1[i], (key, val) -> val + 1);
            else
                hm.put(arr1[i], 1);

        }
        //System.out.println("arr2");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int key : arr2) {
            if (hm.containsKey(key) && hm.get(key) > 0) {
                System.out.println(key);
                int new_val = hm.get(key);
                new_val--;
                hm.put(key, new_val);

            }
        }

    }
}

