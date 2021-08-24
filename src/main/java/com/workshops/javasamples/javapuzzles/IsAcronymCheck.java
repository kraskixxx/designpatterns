package com.workshops.javasamples.javapuzzles;

import java.util.Arrays;
import java.util.HashMap;

public class IsAcronymCheck {

    public static boolean isAcronym(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character,Integer> charCounts = new HashMap<>();

        //Calculate char counts

        for (int i=0; i< s1.length(); i++) {
            if(charCounts.containsKey(s1.charAt(i))) {
                charCounts.put(s1.charAt(i), charCounts.get(s1.charAt(i) + 1));
            } else {
                charCounts.put(s1.charAt(i),1);
            }
        }

        //compare counts with characters in s2

        for(int i=0;i<s2.length(); i++) {
            if(charCounts.containsKey(s2.charAt(i))) {
                charCounts.put(s2.charAt(i), charCounts.get(s2.charAt(i) -1));
            } else {
                charCounts.put(s2.charAt(i), 1);
            }
        }

        for (int count : charCounts.values()) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * we are sorting char arrays first and then comparing equality
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAcronymEffectiveSolution(String s1, String s2) {
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();
        Arrays.sort(s1Char);
        Arrays.sort(s2Char);

        return Arrays.equals(s1Char, s2Char);

    }
}
