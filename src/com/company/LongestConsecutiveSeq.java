package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSeq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hm = new HashSet<>();
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            hm.add(arr[i]);
        }
        int longestStreak = 1;
        int max =0;
        for(int key:arr)
        {
            if(!hm.contains(key-1))
            {
                int currStreak = 1;
                while(hm.contains(key+currStreak))
                {
                    currStreak++;
                }
                if(currStreak>longestStreak)
                {
                    max = key;
                    longestStreak = currStreak;
                }
            }
        }
        for(int i=0;i<longestStreak;i++){
            System.out.print(max+i+" ");
        }
        System.out.print("\nLength: ");
        System.out.print(longestStreak);
    }
}
