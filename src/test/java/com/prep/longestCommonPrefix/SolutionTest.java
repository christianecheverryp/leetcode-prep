package com.prep.longestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        Solution solution = new Solution();

        String [] strs = {"flower","flow","flight"};

        String result = solution.longestCommonPrefix(strs);

        assertEquals("fl", result);
    }

    @Test
    void longestCommonPrefix2() {
        Solution solution = new Solution();

        String [] strs = {"dog","racecar","car"};
        String result = solution.longestCommonPrefix(strs);

        assertEquals("", result);
    }

    @Test
    void longestCommonPrefix3(){
        Solution solution = new Solution();

        String [] strs = {"dog", "doggy", "dogodoggy"};
        String result = solution.longestCommonPrefix(strs);

        assertEquals("dog", result);
    }
}
