package com.company;

public class RecursionIntro {
    public static  void numPrint(int val){
        if(val==1){
            System.out.println(1);
            return;
        }
        numPrint(val-1);
        System.out.println(val);

    }

    public static void main(String[] args) {
        numPrint(10);
    }
}
