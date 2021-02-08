package com.company;
import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        //Learning hash map

        //Declaring hashmap
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        //put function to add value in hash map
        hm.put('a', 1);
        hm.put('b', 2);
        hm.put('c', 3);
        hm.put('d', 4);

        //Printing hash map
        System.out.println(hm);

        //get function to get the value of the key
        System.out.println("Value of key:a is "+hm.get('a'));
        System.out.println("Value of key:b is "+hm.get('b'));

        //containKey function to check if the key is present in hash map
        System.out.println("Does hash map contain 'c' or not :- "+hm.containsKey('c'));

        //computeIFPresent update the val if key is present in hash map
        hm.computeIfPresent('a',
                (key, val) -> val+100 );

        //computeIFAbsent update the val if key is not present in hash map
        hm.computeIfAbsent('z',
                k->200);

        //To print all the key sets we use keySet function
        System.out.println("Keys in hash map "+hm.keySet());

        //To print all the value we use values function
        System.out.println("Values in hash map "+hm.values());

    }

}
