package com.sg.warmupexercises;

/**
 *
 * @author nkaur
 */
public class StringExercises {

    /**
     * Please replace the code in following method according to following details.
     * 
     * 1.Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *
     * Example Results:
     * sayHi("Bob") -> "Hello Bob!"
     * sayHi("Alice") -> "Hello Alice!"
     * sayHi("X") -> "Hello X!"
     *
     * @param name
     * @return
     */
    public static String sayHi(String name) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 2. Given two strings, a and b, return the result of putting them together in the order abba,
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     *
     * Example Results:
     * abba("Hi", "Bye") -> "HiByeByeHi"
     * abba("Yo", "Alice") -> "YoAliceAliceYo"
     * abba("What", "Up") -> "WhatUpUpWhat"
     *
     * @param a
     * @param b
     * @return
     */
    public static String abba(String a, String b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 3.The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     *
     * Example Results:
     * makeTags("i", "Yay") -> "<i>Yay</i>"
     * makeTags("i", "Hello") -> "<i>Hello</i>"
     * makeTags("cite", "Yay") -> "<cite>Yay</cite>"
     *
     * @param tag
     * @param content
     * @return
     */
    public static String makeTags(String tag, String content) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 4. Given an "out" string length 4, such as "<<>>", and a word, return a new string
     * where the word is in the middle of the out string, e.g. "<<word>>".
     * Hint: Substrings are your friend here
     *
     * Example Results:
     * insertWord("<<>>", "Yay") -> "<<Yay>>"
     * insertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
     * insertWord("[[]]", "word") -> "[[word]]"
     *
     * @param container
     * @param word
     * @return
     */
    public static String insertWord(String container, String word) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 5. Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
     * The string length will be at least 2.
     *
     * Example Results:
     * multipleEndings("Hello") -> "lololo"
     * multipleEndings("ab") -> "ababab"
     * multipleEndings("Hi") -> "HiHiHi"
     *
     * @param str
     * @return
     */
    public static String multipleEndings(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 6. Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     *
     * Example Results:
     * firstHalf("WooHoo") -> "Woo"
     * firstHalf("HelloThere") -> "Hello"
     * firstHalf("abcdef") -> "abc"
     *
     * @param str
     * @return
     */
    public static String firstHalf(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 7. Given a string, return a version without the first and last char, so "Hello" yields "ell".
     * The string length will be at least 2.
     *
     * Example Results:
     * trimOne("Hello") -> "ell"
     * trimOne("java") -> "av"
     * trimOne("coding") -> "odin"
     *
     * @param str
     * @return
     */
    public static String trimOne(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 8. Given 2 strings, a and b, return a string of the form short+long+short,
     * with the shorter string on the outside and the longer string on the inside.
     * The strings will not be the same length, but they may be empty (length 0).
     *
     * Example Results:
     * longInMiddle("Hello", "hi") -> "hiHellohi"
     * longInMiddle("hi", "Hello") -> "hiHellohi"
     * longInMiddle("aaa", "b") -> "baaab"
     *
     * @param a
     * @param b
     * @return
     */
    public static String longInMiddle(String a, String b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 9. Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     * The string length will be at least 2.
     *
     * Example Results:
     * rotateleft2("Hello") -> "lloHe"
     * rotateleft2("java") -> "vaja"
     * rotateleft2("Hi") -> "Hi"
     *
     * @param str
     * @return
     */
    public static String rotateleft2(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 10. Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.
     *
     * Example Results:
     * rotateRight2("Hello") -> "loHel"
     * rotateRight2("java") -> "vaja"
     * rotateRight2("Hi") -> "Hi"
     *
     * @param str
     * @return
     */
    public static String rotateRight2(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 11. Given a string, return a string length 1 from its front, unless front is false,
     * in which case return a string length 1 from its back. The string will be non-empty.
     *
     * Example Results:
     * takeOne("Hello", true) -> "H"
     * takeOne("Hello", false) -> "o"
     * takeOne("oh", true) -> "o"
     *
     * @param str
     * @param fromFront
     * @return
     */
    public static String takeOne(String str, boolean fromFront) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 12. Given a string of even length, return a string made of the middle two chars,
     * so the string "string" yields "ri". The string length will be at least 2.
     *
     * Example Results:
     * middleTwo("string") -> "ri"
     * middleTwo("code") -> "od"
     * middleTwo("Practice") -> "ct"
     *
     * @param str
     * @return
     */
    public static String middleTwo(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 13. Given a string, return true if it ends in "ly".
     *
     * Example Results:
     * endsWithLy("oddly") -> true
     * endsWithLy("y") -> false
     * endsWithLy("oddy") -> false
     *
     * @param str
     * @return
     */
    public static boolean endsWithLy(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 14. Given a string and an int n, return a string made of the first and last n chars from the string.
     * The string length will be at least n.
     *
     * Example Results:
     * frontAndBack("Hello", 2) -> "Helo"
     * frontAndBack("Chocolate", 3) -> "Choate"
     * frontAndBack("Chocolate", 1) -> "Ce"
     *
     * @param str
     * @param n
     * @return
     */
    public static String frontAndBack(String str, int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 15. Given a string and an index, return a string length 2 starting at the given index.
     * If the index is too big or too small to define a string length 2, use the first 2 chars.
     * The string length will be at least 2.
     *
     * Example Results:
     * takeTwoFromPosition("java", 0) -> "ja"
     * takeTwoFromPosition("java", 2) -> "va"
     * takeTwoFromPosition("java", 3) -> "ja"
     *
     * @param str
     * @param n
     * @return
     */
    public static String takeTwoFromPosition(String str, int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 16. Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
     *
     * Example Results:
     * hasBad("badxx") -> true
     * hasBad("xbadxx") -> true
     * hasBad("xxbadxx") -> false    
     * hasBad("") -> false
     * hasBad("cantaloupe") -> false
     * 
     * @param str
     * @return
     */
    public static boolean hasBad(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 17. Given a string, return a string length 2 made of its first 2 chars.
     * If the string length is less than 2, use '@' for the missing chars.
     *
     * Example Results:
     * atFirst("hello") -> "he"
     * atFirst("hi") -> "hi"
     * atFirst("h") -> "h@"
     * atFirst("") -> "@@"
     * 
     * @param str
     * @return
     */
    public static String atFirst(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 18. Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
     * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
     *
     * Example Results:
     * lastChars("last", "chars") -> "ls"
     * lastChars("yo", "mama") -> "ya"
     * lastChars("hi", "") -> "h@"
     * lastChars("", "") -> "@@"
     * lastChars("", "f") -> "@f"
     *
     * @param str1
     * @param str2
     * @return
     */
    public static String lastChars(String str1, String str2) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     *
     * 19. Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat"
     * yields "abcat".
     *
     * Example Results:
     * conCat("abc", "cat") -> "abcat"
     * conCat("dog", "cat") -> "dogcat"
     * conCat("abc", "") -> "abc"   
     * conCat("", "abc") -> "abc"
     * conCat("b", "boat") -> "boat"
     * conCat("boat", "t") -> "boat"
     * 
     * @param a
     * @param b
     * @return
     */
    public static String conCat(String a, String b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 20. Given a string of any length, return a new string where the last 2 chars, if present,
     * are swapped, so "coding" yields "codign".
     *
     * Example Results:
     * swapLast("coding") -> "codign"
     * swapLast("cat") -> "cta"
     * swapLast("ab") -> "ba"
     * swapLast("a") -> "a"
     *
     * @param str
     * @return
     */
    public static String swapLast(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 21. Given a string, return true if the first 2 chars in the string also appear at the end of the string,
     * such as with "edited".
     *
     * Example Results:
     * frontAgain("edited") -> true
     * frontAgain("edit") -> false
     * frontAgain("ed") -> true
     *
     * @param str
     * @return
     */
    public static boolean frontAgain(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 22. Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the strings are different lengths, omit chars from the longer string so it is the
     * same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
     *
     * Example Results:
     * minCat("Hello", "Hi") -> "loHi"
     * minCat("Hello", "java") -> "ellojava"
     * minCat("java", "Hello") -> "javaello"    
     * minCat("", "beep") -> ""
     * minCat("x", "yyyyy") -> "xy"
     * 
     * @param a
     * @param b
     * @return
     */
    public static String minCat(String a, String b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 23.Given a string, return a version without the first 2 chars. Except keep the first char if
     * it is 'a' and keep the second char if it is 'b'. The string may be any length.
     *
     * Example Results:
     * tweakFront("Hello") -> "llo"
     * tweakFront("away") -> "aay"
     * tweakFront("abed") -> "abed"  
     * tweakFront("oboe") -> "boe"
     * tweakFront("") -> ""
     * 
     * @param str
     * @return
     */
    public static String tweakFront(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 24. Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
     * and otherwise return the string unchanged.
     *
     * Example Results:
     * stripX("xHix") -> "Hi"
     * stripX("xHi") -> "Hi"
     * stripX("Hxix") -> "Hxi"     * 
     * stripX("x") -> ""
     * stripX("") -> ""
     * 
     * @param str
     * @return
     */
    public static String stripX(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

}
