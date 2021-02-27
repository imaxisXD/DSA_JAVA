package com.company;

import java.util.Scanner;

public class Reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int new_num = revDigit(num);
        System.out.println("New number:"+new_num);
    }

    private static int revDigit(int x) {
        int num = 0;
        while(x>0){
            num = (x%10)+10*num;
            x = x/10;
        }
        return  num;
    }
}
