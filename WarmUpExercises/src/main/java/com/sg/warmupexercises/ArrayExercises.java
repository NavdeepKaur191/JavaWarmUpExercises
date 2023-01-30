package com.sg.warmupexercises;

/**
 *
 * @author nkaur
 */
public class ArrayExercises {

    /**
     * Please replace the code in following method according to following
     * details.
     *
     * 1.Given an array of int, return true if 6 appears as either the first or
     * last element in the array. The array will be length 1 or more.
     *
     * Example Results: 
     * firstLast6({1, 2, 6}) -> true
     * firstLast6({6, 1, 2, 3}) -> true
     * firstLast6({13, 6, 1, 2, 3}) -> false
     *
     * @param numbers array of integers
     * @return true/false depending upon if first and last number is 6
     */
    public static boolean firstLast6(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following
     * details.
     *
     * 2.Given an array of int, return true if the array is length 1 or more, and
     * the first element and the last element are equal.
     *
     * Example Results:
     * sameFirstLast({1, 2, 3}) -> false
     * sameFirstLast({1, 2, 3, 1}) -> true
     * sameFirstLast({1, 2, 1}) -> true
     *
     * @param numbers
     * @return true if last and first element is equal
     */
    public static boolean sameFirstLast(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following
     * details.
     *
     * 3.Return an int array length n containing the first n digits of pi.
     *
     * Expected Results:
     * makePi(3) -> {3, 1, 4}
     * makePi(1) -> {3}
     * makePi(5) -> {3, 1, 4,1,5}
     *
     * @param n number of digits
     * @return int array n containing the first n digits of pi
     */
    public static int[] makePi(int n) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following
     * details.
     *
     * 4.Given 2 arrays of int values, a and b, return true if they have the same first
     * element or they have the same last element. Both arrays will be length 1
     * or more.
     *
     * Expected Results:
     * commonEnd({1, 2, 3}, {7, 3}) -> true
     * commonEnd({1, 2, 3}, {7, 3, 2}) ->false
     * commonEnd({1, 2, 3}, {1, 3}) -> true
     *
     * @param a array of int
     * @param b array of int
     * @return true if ending of arrays is same
     */
    public static boolean commonEnd(int[] a, int[] b) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following
     * details.
     *
     * 5.Given an array of int values, return the sum of all the elements.
     *
     * Example Results:
     * sum({1, 2, 3}) -> 6
     * sum({5, 11, 2}) -> 18
     * sum({7, 0, 0}) -> 7
     *
     * @param numbers int array
     * @return sun of all elements of array
     */
    public static int sum(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following
     * details.
     *
     * 6.Given an array of int values, return an array with the elements
     * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     *
     * Example Results:
     * rotateLeft({1, 2, 3}) -> {2, 3, 1}
     * rotateLeft({5, 11,9}) -> {11, 9, 5}
     * rotateLeft({7, 0, 0}) -> {0, 0, 7}
     *
     * @param numbers int array
     * @return rotated int array
     */
    public static int[] rotateLeft(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 7.Given an array of int values, return a new array with the elements in reverse order.
     *
     * Example Results:
     * reverse({1, 2, 3}) -> {3, 2, 1}
     * reverse({ 5, 9, 11, 1 }) -> { 1, 11, 9, 5 }
     * reverse({ 7, 0, 0 }) -> { 0, 0, 7 }
     * reverse({7}) -> {7}
     *
     * @param numbers int array
     * @return reversed int array
     */
    public static int[] reverse(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 8.Given an array of int values, figure out which is larger between the first and last elements
     * in the array, and set all the other elements to be that value. Return the changed array.
     *
     * Example Results:
     * higherWins({1, 2, 3}) -> {3, 3, 3}
     * higherWins({11, 5, 9}) -> {11, 11, 11}
     * higherWins({2, 11, 3}) -> {3, 3, 3}
     *
     * @param numbers int array
     * @return int array replacing all elements with highest number
     */
    public static int[] higherWins(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 9.Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
     *
     * Example Results:
     * getMiddle({1, 2, 3}, {4, 5, 6}) -> {2, 5}
     * getMiddle({7, 7, 7}, {3, 8, 0}) -> {7, 8}
     * getMiddle({5, 2, 9}, {1, 4, 5}) -> {2, 4}
     *
     * @param a int array
     * @param b int array
     * @return int array containing middle element of array a and b
     */
    public static int[] getMiddle(int[] a, int[] b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 10.Given an int array , return true if it contains an even number (HINT: Use Mod (%)).
     * Example Results:
     *
     * hasEven({2, 5}) -> true
     * hasEven({4, 3}) -> true
     * hasEven({7, 5}) -> false
     *
     * @param numbers int array
     * @return true if it contains even number else false
     */
    public static boolean hasEven(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 11.Given an int array, return a new array with double the length where its last element is the same
     * as the original array, and all the other elements are 0.
     * The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
     *
     * Example Results:
     * keepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6}
     * keepLast({1, 2}) -> {0, 0, 0, 2}
     * keepLast({3}) -> {0, 3}
     *
     * @param numbers int array
     * @return a new int array according to statement above
     */
    public static int[] keepLast(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 12.Given an int array, return true if the array contains 2 twice, or 3 twice.
     *
     * Example Results:
     * double23({2, 2, 3}) -> true
     * double23({3, 4, 5, 3}) -> true
     * double23({2, 3, 2, 2}) -> false
     *
     * @param numbers int array
     * @return true if the array contains 2 twice, or 3 twice else false
     */
    public static boolean double23(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 13.Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
     * set the 3 element to 0. Return the changed array.
     *
     * Example Results:
     * fix23({1, 2, 3}) ->{1, 2, 0}
     * fix23({2, 3, 5}) -> {2, 0, 5}
     * fix23({1, 2, 1}) -> {1, 2, 1}
     *
     * @param numbers int array
     * @return int array according to above statement
     */
    public static int[] fix23(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 14.We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
     * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
     *
     * Example Results:
     * unlucky1({1, 3, 4, 5}) -> true
     * unlucky1({2, 1, 3, 4, 5}) -> true
     * unlucky1({1, 1, 1}) -> false
     *
     * @param numbers int array
     * @return true/false according to above statement
     */
    public static boolean unlucky1(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 15.Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
     * the elements from a followed by the elements from b. The arrays may be any length, including 0,
     * but there will be 2 or more elements available between the 2 arrays. 
     * 
     * Example Results:
     * make2({4, 5}, {1, 2, 3}) -> {4, 5}
     * make2({4}, {1, 2, 3}) -> {4, 1}
     * make2({}, {1, 2}) -> {1, 2}
     * 
     * @param a int array
     * @param b int array
     * @return int array according to above statement
     */
    public static int[] make2(int[] a, int[] b) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

}
