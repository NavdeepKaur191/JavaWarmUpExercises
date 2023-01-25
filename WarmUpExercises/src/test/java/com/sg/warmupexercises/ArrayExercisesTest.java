package com.sg.warmupexercises;

import static com.sg.warmupexercises.ArrayExercises.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author nkaur
 */
public class ArrayExercisesTest {

    public ArrayExercisesTest() {
    }

    /**
     * Test of FirstLast6 method.
     */
    @Test
    public void testFirstLast6() {
        assertTrue(firstLast6(new int[]{1, 2, 6}), "firstLast6({1, 2, 6}) -> true fails");
        assertTrue(firstLast6(new int[]{6, 1, 2, 3}), "firstLast6({6, 1, 2, 3}) -> true fails");
        assertFalse(firstLast6(new int[]{13, 6, 1, 2, 3}), "firstLast6({13, 6, 1, 2, 3}) -> false fails");
    }

    /**
     * Test of SameFirstLast method
     */
    @Test
    public void testSameFirstLast() {
        assertFalse(sameFirstLast(new int[]{1, 2, 3}), "sameFirstLast({1, 2, 3}) -> false fails");
        assertTrue(sameFirstLast(new int[]{1, 2, 3, 1}), "sameFirstLast({1, 2, 3, 1}) -> true fails");
        assertTrue(sameFirstLast(new int[]{1, 2, 1}), "sameFirstLast({1, 2, 1}) -> true fails");
    }

    @Test
    public void testMakePi() {
        assertEquals(new int[]{3, 1, 4}, makePi(3), "makePi(3) -> {3, 1, 4} fails");
        assertEquals(new int[]{3}, makePi(1), "makePi(1) -> {3} fails");
        assertEquals(new int[]{3, 1, 4, 1, 5}, makePi(5), "makePi(5) -> {3, 1, 4,1,5} fails");
    }

    /**
     * Test of commonEnd method
     */
    @Test
    public void testCommonEnd() {
        assertTrue(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}), "commonEnd({1, 2, 3}, {7, 3}) -> true fails");
        assertTrue(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}), "commonEnd({1, 2, 3}, {1, 3}) -> true fails");
        assertFalse(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}), "commonEnd({1, 2, 3}, {7, 3, 2}) -> false fails");
    }

    /**
     * Test of sum method
     */
    @Test
    public void testSum() {
        assertEquals(6, sum(new int[]{1, 2, 3}), "sum({1, 2, 3}) -> 6 fails");
        assertEquals(18, sum(new int[]{5, 11, 2}), "{5, 11, 2}) -> 18 fails");
        assertEquals(7, sum(new int[]{7, 0, 0}), "sum({7, 0, 0}) -> 7 fails");
    }

    /**
     * Test of rotateLeft method
     */
    @Test
    public void testRotateLeft() {
        assertEquals(new int[]{2, 3, 1}, rotateLeft(new int[]{1, 2, 3}), "rotateLeft({1, 2, 3}) -> {2, 3, 1} fails");
        assertEquals(new int[]{11, 9, 5}, rotateLeft(new int[]{5, 11, 9}), "rotateLeft({5, 11, 9}) -> {11, 9, 5} fails");
        assertEquals(new int[]{0, 0, 7}, rotateLeft(new int[]{7, 0, 0}), "rotateLeft({7, 0, 0}) -> {0, 0, 7} fails");
    }

    /**
     * Test of reverse method
     */
    @Test
    public void testReverse() {
        assertEquals(new int[]{3, 2, 1}, reverse(new int[]{1, 2, 3}), "reverse({1, 2, 3}) ->  {3, 2, 1} fails");
        assertEquals(new int[]{1, 11, 9, 5}, reverse(new int[]{5, 9, 11, 1}), "reverse({5, 9, 11, 1}) ->  {1, 11, 9, 5} fails");
        assertEquals(new int[]{0, 0, 7}, reverse(new int[]{7, 0, 0}), "reverse({7, 0, 0}) ->  {0, 0, 7} fails");
        assertEquals(new int[]{7}, reverse(new int[]{7}), "reverse({7}) ->  {7} fails");
    }
  
}
