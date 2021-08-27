package com.workshops.javasamples.javacodechallenges;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class LinkedinCourseExercises {

    public static int startPoints = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int currentPoint = startPoints;
    private boolean isStillPlaying = true;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Must be more than 6 characters
     * Must have one uppercase character
     * Must have one lowercase character
     * Must have one number
     *
     * @param password
     * @return true - false
     */
    public static boolean isPasswordComplex(String password) {

        if (password.length() < 6) {
            return false;
        }

        boolean hasUppercaseChar = false;
        boolean hasLowercaseChar = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length() || (!hasUppercaseChar && !hasLowercaseChar && !hasNumber); i++) {

            char current = password.charAt(i);

            if (Character.isDigit(current)) {
                hasNumber = true;
            } else if (Character.isUpperCase(current)) {
                hasUppercaseChar = true;
            } else if (Character.isLowerCase(current)) {
                hasLowercaseChar = true;
            }
        }

        return hasNumber && hasLowercaseChar && hasUppercaseChar;

    }

    /**
     * Must be more than 6 characters
     * Must have one uppercase character
     * Must have one lowercase character
     * Must have one number
     *
     * @param password
     * @return true - false
     */
    public static boolean isPasswordComplexRegex(String password) {

        return password.length() >= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");


    }

    /**
     * Double or Nothing
     * User starts with 10 points
     * User can take a chance to Double their points
     * if user takes the chance , randomness decides if they recieve double or loses all
     * @return
     */
    public void playGame() {
        printWelcome();
        askUserToContinue();

        while (this.isStillPlaying) {
            printTryToDouble();

            if(shouldDouble()) {
                doubleCurrent();
                printCongrats();
                askUserToContinue();

            } else {
                printLost();
                return;
            }

            pritnWalkawayMessage();
        }
    }

    public void doubleCurrent() {
        this.currentPoint = this.currentPoint * 2;
    }

    public boolean shouldDouble() {
        return this.random.nextInt(2) == 0;
    }

    public void printLost() {
        System.out.println("You have lost. No points for you");
    }

    public void pritnWalkawayMessage() {
        System.out.println("Congrats! You finish with " + this.currentPoint + " points. \n");
    }

    public void printCongrats() {
        System.out.println("Congrats! You now have " + this.currentPoint + " points. \n");
    }

    public void printTryToDouble() {
        System.out.println("Let's try to double it");
    }

    protected void askUserToContinue() {
        System.out.println("Would you like to continue " +
                "and try to double your winnings? " +
                "Enter YES to continue");
        this.isStillPlaying = this.scanner.nextLine()
                .toUpperCase().equals("YES");
    }

    public void printWelcome() {
        System.out.println("Welcome to the Double or not Game. Your start point is : " + startPoints);
    }

    protected boolean getIsStillPlaying() {
        return this.isStillPlaying;
    }

    public static void main(String[] args) {
        boolean isEven = isEven(13);
        System.out.println(isEven);
    }
}
