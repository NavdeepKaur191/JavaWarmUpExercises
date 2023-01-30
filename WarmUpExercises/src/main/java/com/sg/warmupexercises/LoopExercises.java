package com.sg.warmupexercises;

/**
 *
 * @author nkaur
 */
public class LoopExercises {

    /**
     * Please replace the code in following method according to following details.
     *
     * 1.Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     *
     * Example Results:
     * stringTimes("Hi", 2) -> "HiHi"
     * stringTimes("Hi", 3) -> "HiHiHi"
     * stringTimes("Hi", 1) -> "Hi"
     *
     * @param str
     * @param n
     * @return
     */
    public static String stringTimes(String str, int n) {
        throw new UnsupportedOperationException("Code not yet written...!");

    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 2.Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3. Return n copies of the front;
     *
     * Example Results:
     * frontTimes("Chocolate", 2) -> "ChoCho"
     * frontTimes("Chocolate", 3) -> "ChoChoCho"
     * frontTimes("Abc", 3) -> "AbcAbcAbc"
     *
     * @param str
     * @param n
     * @return
     */
    public static String frontTimes(String str, int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 3.Count the number of "xx" in the given string. We'll say that overlapping is allowed,
     * so "xxx" contains 2 "xx".
     *
     * Example Results:
     * countXX("abcxx") -> 1
     * countXX("xxx") -> 2
     * countXX("xxxx") -> 3
     *
     * @param str
     * @return
     */
    public static int countXX(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 4. Given a string, return true if the first instance of "x" in the string is immediately followed
     * by another "x".
     *
     * Example Results:
     * doubleX("axxbb") -> true
     * doubleX("axaxxax") -> false
     * doubleX("xxxxx") -> true
     * doubleX("dffa") -> false
     * doubleX("tx") -> false
     * doubleX("txx") -> true
     *
     * @param str
     * @return
     */
    public static boolean doubleX(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 5. Given a string, return a new string made of every other char starting with the first,
     * so "Hello" yields "Hlo".
     *
     * Example Results:
     * everyOther("Hello") -> "Hlo"
     * everyOther("Hi") -> "H"
     * everyOther("Heeololeo") -> "Hello"
     *
     * @param str
     * @return
     */
    public static String everyOther(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 6. Given a non-empty string like "Code" return a string like "CCoCodCode".
     * (first char, first two, first 3, etc)
     *
     * Example Results:
     * stringSplosion("Code") -> "CCoCodCode"
     * stringSplosion("abc") -> "aababc"
     * stringSplosion("ab") -> "aab"
     *
     * @param str
     * @return
     */
    public static String stringSplosion(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 7. Given a string, return the count of the number of times that a substring length 2
     * appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
     * (we won't count the end substring).
     *
     * Example Results:
     * countLast2("hixxhi") -> 1
     * countLast2("xaxxaxaxx") -> 1
     * countLast2("axxxaaxx") -> 2
     *
     * @param str
     * @return
     */
    public static int countLast2(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 8. Given an array of int values, return the number of 9's in the array.
     *
     * Example Results:
     * count9({1, 2, 9}) -> 1
     * count9({1, 9, 9}) -> 2
     * count9({1, 9, 9, 3, 9}) -> 3
     *
     * @param numbers
     * @return
     */
    public static int count9(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 9. Given an array of int values, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     *
     * Example Results:
     * arrayFront9({1, 2, 9, 3, 4}) -> true
     * arrayFront9({1, 2, 3, 4, 9}) -> false
     * arrayFront9({1, 2, 3, 4, 5}) -> false
     *
     * @param numbers
     * @return
     */
    public static boolean arrayFront9(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 10. Given an array of int values, return true if .. 1, 2, 3, .. appears in the array somewhere.
     *
     * Example Results:
     * array123({1, 1, 2, 3, 1}) -> true
     * array123({1, 1, 2, 4, 1}) -> false
     * array123({1, 1, 2, 1, 2, 3}) -> true
     * array123({ 1, 2, 3 }) -> true
     * array123({3}) -> false
     * array123({3,2}) -> false
     *
     * @param numbers
     * @return
     */
    public static boolean array123(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 11. Given 2 strings, a and b, return the number of the positions where they contain the same length
     * 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in
     * the same place in both strings.
     *
     * Example Results:
     * subStringMatch("xxcaazz", "xxbaaz") -> 3
     * subStringMatch("abc", "abc") -> 2
     * subStringMatch("abc", "axc") -> 0
     *
     * @param a
     * @param b
     * @return
     */
    public static int subStringMatch(String a, String b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 12. Given a string, return a version where all the "x" have been removed.
     * Except an "x" at the very start or end should not be removed.
     *
     * Example Results:
     * stringX("xxHxix") -> "xHix"
     * stringX("abxxxcd") -> "abcd"
     * stringX("xabxxxcdx") -> "xabcdx"
     *
     * @param str
     * @return
     */
    public static String stringX(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 13. Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     *
     * Example Results:
     * altPairs("kitten") -> "kien"
     * altPairs("Chocolate") -> "Chole"
     * altPairs("CodingHorror") -> "Congrr"
     *
     * @param str
     * @return
     */
    public static String altPairs(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 14. Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
     * but the "a" can be any char. The "yak" strings will not overlap.
     *
     * Example Results:
     * doNotYak("yakpak") -> "pak"
     * doNotYak("pakyak") -> "pak"
     * doNotYak("yak123ya") -> "123ya"
     *
     * @param str
     * @return
     */
    public static String doNotYak(String str) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 15. Given an array of int values, return the number of times that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.
     *
     * Example Results:
     * array667({6, 6, 2}) -> 1
     * array667({6, 6, 2, 6}) -> 1
     * array667({6, 7, 2, 6}) -> 1
     * array667({6, 7, 6, 6}) -> 2
     * array667({1, 2, 6}) -> 0
     *
     * @param numbers
     * @return
     */
    public static int array667(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 16. Given an array of int values, we'll say that a triple is a value appearing 3 times in a row in the array.
     * Return true if the array does not contain any triples.
     *
     * Example Results:
     * noTriples({1, 1, 2, 2, 1}) -> true
     * noTriples({1, 1, 2, 2, 2, 1}) -> false
     * noTriples({1, 1, 1, 2, 2, 2, 1}) -> false   
     * noTriples({ 3, 1, 1 }) -> true
     * noTriples({2, 1}) -> true
     *
     * @param numbers
     * @return
     */
    public static boolean noTriples(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 17. Given an array of int values, return true if it contains a 2, 7, 1 pattern -- a value,
     * followed by the value plus 5, followed by the value minus 1.
     *
     * Example Results:
     * pattern51({1, 2, 7, 1}) -> true
     * pattern51({1, 2, 8, 1}) -> false
     * pattern51({2, 7, 1}) -> true
     * pattern51({6, 4, 9, 3, 2}) -> true
     * pattern51({2, 7}) -> false
     * 
     * @param numbers
     * @return
     */
    public static boolean pattern51(int[] numbers) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

}
