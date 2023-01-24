/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.warmupexercises.Arrays;

import static com.sg.warmupexercises.Arrays.SameFirstLastClass.sameFirstLast;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author nkaur
 */
public class SameFirstLastClassTest {

    public SameFirstLastClassTest() {
    }

    /**
     * Test of SameFirstLast method, of class SameFirstLastClass.
     */
    @Test
    public void testNotSameFirstLast() {
        //SameFirstLast({1, 2, 3}) -> false
        int[] numbers = {1, 2, 3};
        assertFalse(sameFirstLast(numbers), "The first and last number is not equal in array");
    }

    @Test
    public void testSameFirstLast() {
        //SameFirstLast({1, 2, 3, 1}) -> true
        int[] numbers = {1, 2, 3, 1};
        assertTrue(sameFirstLast(numbers), "The first and last number is equal in array");

        //SameFirstLast({1, 2, 1}) -> true
        int[] anotherNumbersArray = {1, 2, 1};
        assertTrue(sameFirstLast(numbers), "The first and last number is equal in array");

    }
}
