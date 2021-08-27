package com.workshops.javasamples.javacodechallenges;

public class LinkedinCourseExercises {

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    /**
     * Must be more than 6 characters
     * Must have one uppercase character
     * Must have one lowercase character
     * Must have one number
     * @param password
     * @return true - false
     */
    public static boolean isPasswordComplex(String password){

        if(password.length() < 6) {
            return false;
        }

        boolean hasUppercaseChar = false;
        boolean hasLowercaseChar = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length() || (!hasUppercaseChar && !hasLowercaseChar && !hasNumber); i++) {

            char current = password.charAt(i);

            if(Character.isDigit(current)) {
                hasNumber = true;
            } else if(Character.isUpperCase(current)){
                hasUppercaseChar = true;
            } else if(Character.isLowerCase(current)) {
                hasLowercaseChar = true;
            }
        }

        return hasNumber && hasLowercaseChar && hasUppercaseChar;

    }

    public static void main(String[] args) {
        boolean isEven = isEven(13);
        System.out.println(isEven);
    }
}
