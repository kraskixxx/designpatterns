package com.workshops.javasamples.realworldcoding;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringsNumbersAndMath {

    /**
     * Counting duplicate characters
     */

    public static Map<Character, Integer> countDuplicateCharacters(String str){

        Map<Character, Integer> result = new HashMap<>();

        for (char ch : str.toCharArray()) {
            result.compute(ch, (k,v) -> (v==null) ? 1 : ++v);
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




    public static void main(String[] args) {
        String example = "aabbbccccdess";
        Map<Character, Integer> result = countDuplicateCharacters(example);

        Map<String, Long> duplicateCountJava8 = countDuplicateCharactersJava8(example);
        System.out.println(result.toString());

        System.out.println(duplicateCountJava8.toString());
    }
}
