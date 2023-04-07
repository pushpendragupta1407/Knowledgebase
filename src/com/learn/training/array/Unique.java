package com.learn.training.array;

public class Unique {

    public static boolean isUniqueChar(String s){
        if(s.length() > 128) return false;
        boolean[] charStatus = new boolean[128];
        for (int i = 0; i<128; i++){
            if(charStatus[s.charAt(i)]){
                return false;
            }
            charStatus[s.charAt(i)] = true;
        }
        return true;
    }
    //without using any data structure
    public static boolean isUniqueChar2(String s){
        int checker = 0;
        for(int i = 0; i < 128; i++){
            int val = s.charAt(i) - 'a';
            System.out.println("val " +val + " "+Integer.toBinaryString(1 << val));
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);
            System.out.println("checker " +checker +"  "+ Integer.toBinaryString(checker));

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChar2("pqrsp"));
    }
}
