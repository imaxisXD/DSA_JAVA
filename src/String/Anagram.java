package String;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String st1 = sc.nextLine();
        System.out.print("Enter a string:");
        String st2 = sc.nextLine();
        char[] s1 = st1.toCharArray();
        char[] s2 = st2.toCharArray();

        anagram(s1, s2);
    }

    private static void anagram(char[] s1, char[] s2) {
        if (s1.length != s2.length) {
            System.out.println("Not anagram");
        }
        int[] no_cf_char = new int[256];
        for (int i = 0; i < s1.length; i++) {
            no_cf_char[s1[i] - 'a']++;
            no_cf_char[s2[i] - 'a']--;
        }
        for (int i : no_cf_char) {
            if (i != 0) {
                System.out.println("Not anagram");
                return;
            }
        }

        System.out.println("It is anagram");
    }
}