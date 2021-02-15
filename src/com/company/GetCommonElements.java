package com.company;
import java.util.*;

public class GetCommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        //System.out.println("arr1");
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
            hm.put(arr1[i], 1);
        }
        //System.out.println("arr2");
        int m = sc.nextInt();
        int [] arr2 = new int[m];

        for(int i=0;i<m;i++){
            arr2[i]= sc.nextInt();
        }

        for(int key:arr2){
            if(hm.containsKey(key)){
                System.out.println(key);
                hm.remove(key);
            }
        }
    }
}
