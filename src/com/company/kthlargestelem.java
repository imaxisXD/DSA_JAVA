package com.company;
import java.util.*;
import java.io.*;

public class kthlargestelem {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        //Read ARRAY
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //Get k input
        System.out.println("Enter K:");
        int k = Integer.parseInt(br.readLine());
        //Intialize pq
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int val:arr){
            pq.add(val);
            //if heap size is greater than k then we dont need the top element
            if(pq.size()>k)
                pq.poll();

        }
        //Display element by removing from top
        while(pq.size()>0){
            System.out.println(pq.poll());
        }
    }

}