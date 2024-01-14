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

    // test max profit leet
    @Test
    void testMaxProfit() {
        assert leetcode.Solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }) == 5;
    }

    // test closeStrings
    @Test
    void testCloseStrings() {
        // assert leetcode.CloseStrings.closeStrings("abc", "bca") == true;
        // cabbba aabbss
        assert leetcode.CloseStrings.closeStrings("cabbba", "aabbss") == false;

    }
}
