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

    @Test
    public void testFirstLast6() {
        assertTrue(firstLast6(new int[]{1, 2, 6}), "firstLast6({1, 2, 6}) -> true fails");
        assertTrue(firstLast6(new int[]{6, 1, 2, 3}), "firstLast6({6, 1, 2, 3}) -> true fails");
        assertFalse(firstLast6(new int[]{13, 6, 1, 2, 3}), "firstLast6({13, 6, 1, 2, 3}) -> false fails");
    }

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

    @Test
    public void testCommonEnd() {
        assertTrue(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}), "commonEnd({1, 2, 3}, {7, 3}) -> true fails");
        assertTrue(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}), "commonEnd({1, 2, 3}, {1, 3}) -> true fails");
        assertFalse(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}), "commonEnd({1, 2, 3}, {7, 3, 2}) -> false fails");
    }

    @Test
    public void testSum() {
        assertEquals(6, sum(new int[]{1, 2, 3}), "sum({1, 2, 3}) -> 6 fails");
        assertEquals(18, sum(new int[]{5, 11, 2}), "sum({5, 11, 2}) -> 18 fails");
        assertEquals(7, sum(new int[]{7, 0, 0}), "sum({7, 0, 0}) -> 7 fails");
    }

    @Test
    public void testRotateLeft() {
        assertEquals(new int[]{2, 3, 1}, rotateLeft(new int[]{1, 2, 3}), "rotateLeft({1, 2, 3}) -> {2, 3, 1} fails");
        assertEquals(new int[]{11, 9, 5}, rotateLeft(new int[]{5, 11, 9}), "rotateLeft({5, 11, 9}) -> {11, 9, 5} fails");
        assertEquals(new int[]{0, 0, 7}, rotateLeft(new int[]{7, 0, 0}), "rotateLeft({7, 0, 0}) -> {0, 0, 7} fails");
    }

    @Test
    public void testReverse() {
        assertEquals(new int[]{3, 2, 1}, reverse(new int[]{1, 2, 3}), "reverse({1, 2, 3}) ->  {3, 2, 1} fails");
        assertEquals(new int[]{1, 11, 9, 5}, reverse(new int[]{5, 9, 11, 1}), "reverse({5, 9, 11, 1}) ->  {1, 11, 9, 5} fails");
        assertEquals(new int[]{0, 0, 7}, reverse(new int[]{7, 0, 0}), "reverse({7, 0, 0}) ->  {0, 0, 7} fails");
        assertEquals(new int[]{7}, reverse(new int[]{7}), "reverse({7}) ->  {7} fails");
    }

    @Test
    public void testHigherWins() {
        assertEquals(new int[]{3, 3, 3}, higherWins(new int[]{1, 2, 3}), "higherWins({1, 2, 3}) -> {3, 3, 3} fails");
        assertEquals(new int[]{11, 11, 11}, higherWins(new int[]{11, 5, 9}), "higherWins({11, 5, 9}) -> {11, 11, 11} fails");
    }

    @Test
    public void testGetMiddle() {
        assertEquals(new int[]{2, 5}, getMiddle(new int[]{1, 2, 3}, new int[]{4, 5, 6}), "getMiddle({1, 2, 3}, {4, 5, 6}) -> {2, 5} fails");
        assertEquals(new int[]{7, 8}, getMiddle(new int[]{7, 7, 7}, new int[]{3, 8, 0}), " getMiddle({7, 7, 7}, {3, 8, 0}) -> {7, 8} fails");
        assertEquals(new int[]{2, 4}, getMiddle(new int[]{5, 2, 9}, new int[]{1, 4, 5}), "getMiddle({5, 2, 9}, {1, 4, 5}) -> {2, 4} fails");
    }

    @Test
    public void testHasEven() {
        assertEquals(true, hasEven(new int[]{2, 5}), "hasEven({2, 5}) -> true fails");
        assertEquals(true, hasEven(new int[]{4, 3}), "hasEven({4, 3}) -> true fails");
        assertEquals(false, hasEven(new int[]{7, 5}), "hasEven({7, 5}) -> false fails");
    }

    @Test
    public void testKeepLast() {
        assertEquals(new int[]{0, 0, 0, 0, 0, 6}, keepLast(new int[]{4, 5, 6}), "keepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6} fails");
        assertEquals(new int[]{0, 0, 0, 2}, keepLast(new int[]{1, 2}), "keepLast({1, 2}) -> {0, 0, 0, 2} fails");
        assertEquals(new int[]{0, 3}, keepLast(new int[]{3}), "keepLast({3}) -> {0, 3} fails");
    }

    @Test
    public void testDouble23() {
        assertEquals(true, double23(new int[]{2, 2, 3}), "double23({2, 2, 3}) -> true fails");
        assertEquals(true, double23(new int[]{3, 4, 5, 3}), "double23({3, 4, 5, 3}) -> true fails");
        assertEquals(false, double23(new int[]{2, 3, 2, 2}), "double23({2, 3, 2, 2}) -> false fails");
    }

    @Test
    public void testFix23() {
        assertEquals(new int[]{1, 2, 0}, fix23(new int[]{1, 2, 3}), "fix23({1, 2, 3}) ->{1, 2, 0} fails");
        assertEquals(new int[]{2, 0, 5}, fix23(new int[]{2, 3, 5}), "fix23({2, 3, 5}) -> {2, 0, 5} fails");
        assertEquals(new int[]{1, 2, 1}, fix23(new int[]{1, 2, 1}), "fix23({1, 2, 1}) -> {1, 2, 1} fails");
    }

    @Test
    public void testUnlucky1() {
        assertEquals(true, unlucky1(new int[]{1, 3, 4, 5}), "unlucky1({1, 3, 4, 5}) -> true fails");
        assertEquals(true, unlucky1(new int[]{2, 1, 3, 4, 5}), "unlucky1({2, 1, 3, 4, 5}) -> true fails");
        assertEquals(false, unlucky1(new int[]{1, 1, 1}), "unlucky1({1, 1, 1}) -> false fails");
    }

    @Test
    public void testMake2() {
        assertEquals(new int[]{4, 5}, make2(new int[]{4, 5}, new int[]{1, 2, 3}), "make2({4, 5}, {1, 2, 3}) -> {4, 5} fails");
        assertEquals(new int[]{4, 1}, make2(new int[]{4}, new int[]{1, 2, 3}), "make2({4}, {1, 2, 3}) -> {4, 1} fails");
        assertEquals(new int[]{1, 2}, make2(new int[]{}, new int[]{1, 2}), "make2({}, {1, 2}) -> {1, 2} fails");
    }

}
