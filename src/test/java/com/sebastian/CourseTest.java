package com.sebastian;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CourseTest {


    @Test
    public void shoudHasStartDateBefore() {

        String anyName = "sfdf";
        LocalDate anyDate = LocalDate.now();

        Course course = new Course(anyName, anyDate);

        boolean result = course.wasStartedBefore(anyDate.plusDays(1));

        assertTrue(result);

    }

    @Test
    public void shoudHasStartDateNotBefore() {

        String anyName = "sfdf";
        LocalDate anyDate = LocalDate.now();

        Course course = new Course(anyName, anyDate);

        boolean result = course.wasStartedBefore(anyDate.minusDays(1));

        assertFalse(result);

    }



    @Test
    public void shoudHasNametheSameName() {

        String someName = "rterte";

        Course course = new Course(someName, LocalDate.of(1,1,1));

        String result = course.name();

        assertEquals(someName, result);
    }
}