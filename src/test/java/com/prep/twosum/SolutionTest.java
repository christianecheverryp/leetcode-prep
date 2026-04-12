package com.prep.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]


 */

class SolutionTest {

    @Test
    void testExample1() {
        // 1. Preparar los datos (Arrange)
        Solution solucion = new Solution();
        // Faltan las variables de entrada...
        int [] nums = {2, 7, 11, 15};
        int target = 9;

        // 2. Ejecutar el método (Act)
        int [] resultado = solucion.twoSum(nums, target);

        // 3. Comprobar el resultado (Assert)
        assertArrayEquals(new int []{0, 1}, resultado);
    }

    @Test
    void testExample2(){
        Solution solucion = new Solution();
        int [] nums = {3, 2, 4};
        int target = 6;

        int [] resultado = solucion.twoSum(nums, target);
        assertArrayEquals(new int []{1, 2}, resultado);
    }

    @Test
    void testExample3(){
        Solution solucion  = new Solution();
        int [] nums = {3, 3};
        int target = 6;

        int [] resultado = solucion.twoSum(nums, target);
        assertArrayEquals(new int []{0, 1}, resultado);
    }
}