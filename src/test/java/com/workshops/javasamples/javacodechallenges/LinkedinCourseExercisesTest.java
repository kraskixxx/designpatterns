package com.workshops.javasamples.javacodechallenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LinkedinCourseExercisesTest {

    private final ByteArrayOutputStream gamePrintOut = new ByteArrayOutputStream();

    @Test
    void isEven_true() {
        assertTrue(LinkedinCourseExercises.isEven(2));
        assertTrue(LinkedinCourseExercises.isEven(-20));
        assertTrue(LinkedinCourseExercises.isEven(44));
    }

    @Test
    void isEven_false() {
        assertFalse(LinkedinCourseExercises.isEven(3));
        assertFalse(LinkedinCourseExercises.isEven(-21));
        assertFalse(LinkedinCourseExercises.isEven(43));
    }

    @Test
    void isPasswordComplex_true(){
        assertTrue(LinkedinCourseExercises.isPasswordComplex("Complex1"));
    }

    @Test
    void isPasswordComplex_false(){
        assertFalse(LinkedinCourseExercises.isPasswordComplex("123asd"));
    }

    @Test
    void isPasswordComplexRegex_true(){
        assertTrue(LinkedinCourseExercises.isPasswordComplexRegex("Complex1"));
    }

    @Test
    void isPasswordComplexRegex_false(){
        assertFalse(LinkedinCourseExercises.isPasswordComplexRegex("123asd"));
    }

    @BeforeEach
    public void setupStreams() {
        System.setOut(new PrintStream(gamePrintOut));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void askUserToContinue_Yes() {
        String input = "yes";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        LinkedinCourseExercises exercises = new LinkedinCourseExercises();
        assertTrue(exercises.getIsStillPlaying());

        exercises.askUserToContinue();
        assertTrue(exercises.getIsStillPlaying());
        assertEquals("Would you like to continue " +
                "and try to double your winnings? " +
                "Enter YES to continue\n", gamePrintOut.toString());
    }

    @Test
    public void askUserToContinue_No() {
        String input = "no";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        LinkedinCourseExercises exercises = new LinkedinCourseExercises();
        assertTrue(exercises.getIsStillPlaying());

        exercises.askUserToContinue();
        assertFalse(exercises.getIsStillPlaying());
        assertEquals("Would you like to continue " +
                "and try to double your winnings? " +
                "Enter YES to continue\n", gamePrintOut.toString());
    }
}