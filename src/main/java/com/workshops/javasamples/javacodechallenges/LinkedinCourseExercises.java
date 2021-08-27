package com.workshops.javasamples.javacodechallenges;

public class LinkedinCourseExercises {

    public static boolean isEven(int number){
        if(number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isEven = isEven(13);
        System.out.println(isEven);
    }
}
