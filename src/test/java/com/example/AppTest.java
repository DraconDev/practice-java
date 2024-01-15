package com.example;

import java.util.List;

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

    @Test
    void testFindWinners() {
        assert leetcode.FindWinners.findWinners(new int[][] { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 },
                { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 }, { 10, 9 } })
                .equals(List.of(List.of(1, 2, 10), List.of(4, 5, 7, 8)));
    }

}
