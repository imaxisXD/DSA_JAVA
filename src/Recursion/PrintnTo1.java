package Recursion;

import java.util.Scanner;

public class PrintnTo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int numToPrinted = sc.nextInt();
        nto1(numToPrinted);
    }

    private static void nto1(int x) {
        if(x == 1){
            System.out.print(x+" ");
            return;
        }
        System.out.print(x+" ");
        nto1(x-1);
    }
}
