package com.prep.romanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

class SolutionTest {

    @Test
    void romanToInt() {
        Solution solution = new Solution();

        String s = "III";
        int resultado = solution.romanToInt(s);
        assertEquals(3, resultado);
    }

    @Test
    void romanToInt2() {
        Solution solution = new Solution();

        String s = "LVIII";
        int resultado = solution.romanToInt(s);
        assertEquals(58, resultado);
    }

    @Test
    void romanToInt3() {
        Solution solution = new Solution();

        String s = "MCMXCIV";
        int resultado = solution.romanToInt(s);
        assertEquals(1994, resultado);
    }
}