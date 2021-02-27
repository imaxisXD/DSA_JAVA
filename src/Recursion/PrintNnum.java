package Recursion;

import java.util.*;

public class PrintNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int numToPrinted = sc.nextInt();
        printtill(numToPrinted);
    }

    private static void printtill(int x) {
        if(x==1){
            System.out.print(x+" ");
            return;
        }
        printtill(x-1);
        System.out.print(x+" ");
    }
}
