package com.workshops.javasamples.javacodechallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedinCourseExercisesTest {

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
}