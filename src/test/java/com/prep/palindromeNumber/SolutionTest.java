package com.prep.palindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrome() {
        Solution solution = new Solution();

        int x = 121;

        boolean result = solution.isPalindrome(x);
        assertEquals(true, result);
    }

    @Test
    void isPalindrome2() {
        Solution solution = new Solution();

        int x = -121;

        boolean result = solution.isPalindrome(x);
        assertEquals(false, result);
    }

    @Test
    void isPalindrome3() {
        Solution solution = new Solution();

        int x = 10;

        boolean result = solution.isPalindrome(x);
        assertEquals(false, result);
    }
}