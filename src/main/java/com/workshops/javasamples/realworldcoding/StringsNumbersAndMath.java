package com.workshops.javasamples.realworldcoding;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringsNumbersAndMath {

    private static final int EXTENDED_ASCII_CODES = 256;

    /**
     * Counting duplicate characters
     */

    public static Map<String, Integer> countDuplicateCharacters(String str) {

        Map<String, Integer> result = new HashMap<>();

        for (char ch : str.toCharArray()) {
            result.compute(String.valueOf(Character.toChars(ch)), (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

    /**
     * Counting duplicate characters V2
     */
    public static Map<String, Long> countDuplicateCharactersJava8(String str) {
        Map<String, Long> result = str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;
    }

    /**
     * Finding the first non-repeated character
     */
    public static char firstNonRepeatedChar(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }

        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);

    }


    public static void main(String[] args) {
        String example = "aabbbccccdess";
        Map<String, Integer> result = countDuplicateCharacters(example);

        Map<String, Long> duplicateCountJava8 = countDuplicateCharactersJava8(example);
        System.out.println(result.toString());

        System.out.println(duplicateCountJava8.toString());
    }
}
