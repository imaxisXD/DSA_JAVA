package Recursion;

import java.util.Scanner;

public class Factr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int num_whose_fact = sc.nextInt();
        int total = recFact(num_whose_fact);
        System.out.println("\n"+total);
    }

    private static int recFact(int num) {
        int res =1;
        if(num<=1){
            System.out.print(num);
            return 1;
        }
        System.out.print(num+" x ");
        res =  num * recFact(num-1);
        return res;
    }
}
