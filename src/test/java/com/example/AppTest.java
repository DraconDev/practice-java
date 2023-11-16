package com.example;

import org.junit.jupiter.api.Test;

import java_course.ReverseString;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    void testReverseString() {

        assert ReverseString.reverse("Hello World").equals("dlroW olleH");
    }
}
