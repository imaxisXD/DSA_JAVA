package com.company;
import java.util.*;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {

        //HashMap declaration
        HashMap<Character, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // To read string input we use nextLine
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            //We incremented the value if the char is present
            hm.computeIfPresent(str.charAt(i),
                    (key, val) -> val + 1);

            //We put the value and char in HashMap, if char is not present
            if (!hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), 1);
            }

        }
        //Initialise max with first char
        char max = str.charAt(0);

        for(char key : hm.keySet()){
            //compare the val of each char with max and if any val is larger then max, then make that value max
            if (hm.get(key)> hm.get(max)){
                max = key;
            }
        }
        System.out.println(max);
    }
}
