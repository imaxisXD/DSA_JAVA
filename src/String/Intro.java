package String;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        char[] s = str.toCharArray();
        Arrays.sort(s);
        for(char i: s){
            System.out.print(i+" ");
        }
    }
}
