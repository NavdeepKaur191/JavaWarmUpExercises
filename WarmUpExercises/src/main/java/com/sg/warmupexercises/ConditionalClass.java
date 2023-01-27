package com.sg.warmupexercises;

/**
 *
 * @author nkaur
 */
public class ConditionalClass {

    /**
     * Please replace the code in following method according to following details.
     *
     * 1.We have two children, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     *
     * Example Results:
     * areWeInTrouble(true, true) -> true
     * areWeInTrouble(false, false) -> true
     * areWeInTrouble(true, false) -> false
     *
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static boolean areWeInTrouble(boolean aSmile, boolean bSmile) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 2.The parameter weekday is true if it is a weekday, and the parameter vacation is true
     * if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     *
     * Example Results:
     * canSleepIn(false, false) -> true
     * canSleepIn(true, false) -> false
     * canSleepIn(false, true) -> true
     *
     * @param isWeekday
     * @param isVacation
     * @return
     */
    public static boolean canSleepIn(boolean isWeekday, boolean isVacation) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     * 3.Given two int values, return their sum. However, if the two values are the same,
     * then return double their sum.
     *
     * Example Results:
     * sumDouble(1, 2) -> 3
     * sumDouble(3, 2) -> 5
     * sumDouble(2, 2) -> 8
     *
     * @param a
     * @param b
     * @return
     */
    public static int sumDouble(int a, int b) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     *
     * Please replace the code in following method according to following details.
     *
     * 4.Given an int n, return the absolute value of the difference between n and 21,
     * except return double the absolute value of the difference if n is over 21.
     *
     * Example Results:
     * diff21(23) -> 4
     * diff21(10) -> 11
     * diff21(21) -> 0
     *
     * @param n
     * @return
     */
    public static int diff21(int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 5.We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
     *
     * Example Results:
     * parrotTrouble(true, 6) -> true
     * parrotTrouble(true, 7) -> false
     * parrotTrouble(false, 6) -> false
     *
     * @param isTalking
     * @param hour
     * @return
     */
    public static boolean parrotTrouble(boolean isTalking, int hour) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 6.Given two int values, a and b, return true if one if them is 10 or if their sum is 10.
     *
     * Example Results:
     * makes10(9, 10) -> true
     * makes10(9, 9) -> false
     * makes10(1, 9) -> true
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean makes10(int a, int b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     *
     * 7.Given an int n, return true if it is within 10 of 100 or 200.
     * Hint: Check out the C# Math class for absolute value
     *
     * Example Results:
     * nearHundred(103) -> true
     * nearHundred(90) -> true
     * nearHundred(89) -> false
     *
     * @param n
     * @return
     */
    public static boolean nearHundred(int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     *
     * 8.Given two int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are negative.
     *
     * Example Results:
     * posNeg(1, -1, false) -> true
     * posNeg(-1, 1, false) -> true
     * posNeg(-4, -5, true) -> true
     *
     * @param a
     * @param b
     * @param negative
     * @return
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     *
     * 9.Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     *
     * Example Results:
     * notString("candy") -> "not candy"
     * notString("x") -> "not x"
     * notString("not bad") -> "not bad"
     *
     * @param s
     * @return
     */
    public static String notString(String s) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 10.Given a non-empty string and an int n, return a new string where the char at index n has been removed.
     * The value of n will be a valid index of a char in the original string (Don't check for bad index).
     *
     * Example Results:
     * missingChar("kitten", 1) -> "ktten"
     * missingChar("kitten", 0) -> "itten"
     * missingChar("kitten", 4) -> "kittn"
     *
     * @param str
     * @param n
     * @return
     */
    public static String missingChar(String str, int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 11.Given a string, return a new string where the first and last chars have been exchanged.
     *
     * Example Results:
     * frontBack("code") -> "eodc"
     * frontBack("a") -> "a"
     * frontBack("ab") -> "ba"
     *
     * @param str
     * @return
     */
    public static String frontBack(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     *
     * 12.Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there.
     * Return a new string which is 3 copies of the front.
     *
     * Example Results:
     * front3("Microsoft") -> "MicMicMic"
     * front3("Chocolate") -> "ChoChoCho"
     * front3("at") -> "atatat"
     *
     *
     * @param str
     * @return
     */
    public static String front3(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     *
     * 13.Given a string, take the last char and return a new string with the last char added at the front and back,
     * so "cat" yields "tcatt". The original string will be length 1 or more.
     *
     * Example Results:
     * backAround("cat") -> "tcatt"
     * backAround("Hello") -> "oHelloo"
     * backAround("a") -> "aaa"
     *
     * @param str
     * @return
     */
    public static String backAround(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 14.Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
     *
     * Example Results:
     * multiple3or5(3) -> true
     * multiple3or5(10) -> true
     * multiple3or5(8) -> false
     *
     * @param number
     * @return
     */
    public static boolean multiple3or5(int number) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 15.Given a string, return true if the string starts with "hi" and false otherwise.
     *
     * Example Results:
     * startHi("hi there") -> true
     * startHi("hi") -> true
     * startHi("high up") -> false
     *
     * @param str
     * @return
     */
    public static boolean startHi(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 16.Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     *
     * Example Results:
     * icyHot(120, -1) -> true
     * icyHot(-1, 120) -> true
     * icyHot(2, 120) -> false
     *
     * @param temp1
     * @param temp2
     * @return
     */
    public static boolean icyHot(int temp1, int temp2) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     * 17.Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     *
     * Example Results:
     * between10and20(12, 99) -> true
     * between10and20(21, 12) -> true
     * between10and20(8, 99) -> false
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean between10and20(int a, int b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

}
