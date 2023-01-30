package com.sg.warmupexercises;

import static com.sg.warmupexercises.LoopExercises.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nkaur
 */
public class LoopExercisesTest {

    public LoopExercisesTest() {
    }

    @Test
    public void testStringTimes() {
        assertEquals("HiHi", stringTimes("Hi", 2), "stringTimes(\"Hi\", 2) -> \"HiHi\" fails");
        assertEquals("HiHiHi", stringTimes("Hi", 3), "stringTimes(\"Hi\", 3) -> \"HiHiHi\" fails");
        assertEquals("Hi", stringTimes("Hi", 1), "stringTimes(\"Hi\", 1) -> \"Hi\" fails");
    }

    @Test
    public void testFrontTimes() {
        assertEquals("ChoCho", frontTimes("Chocolate", 2), "frontTimes(\"Chocolate\", 2) -> \"ChoCho\" fails");
        assertEquals("ChoChoCho", frontTimes("Chocolate", 3), "frontTimes(\"Chocolate\", 3) -> \"ChoChoCho\" fails");
        assertEquals("AbcAbcAbc", frontTimes("Abc", 3), "frontTimes(\"Abc\", 3) -> \"AbcAbcAbc\" fails");
    }

    @Test
    public void testCountXX() {
        assertEquals(1, countXX("abcxx"), "countXX(\"abcxx\") -> 1 fails");
        assertEquals(2, countXX("xxx"), "countXX(\"xxx\") -> 2 fails");
        assertEquals(3, countXX("xxxx"), "countXX(\"xxxx\") -> 3 fails");
    }

    @Test
    public void testDoubleX() {
        assertEquals(true, doubleX("axxbb"), "doubleX(\"axxbb\") -> true fails");
        assertEquals(false, doubleX("axaxxax"), "doubleX(\"axaxxax\") -> false fails");
        assertEquals(true, doubleX("xxxxx"), "doubleX(\"xxxxx\") -> true fails");
        assertEquals(false, doubleX("dffa"), "doubleX(\"dffa\") -> false fails");
        assertEquals(false, doubleX("tx"), "doubleX(\"tx\") -> false fails");
        assertEquals(true, doubleX("txx"), "doubleX(\"txx\") -> true fails");
    }

    @Test
    public void testEveryOther() {
        assertEquals("Hlo", everyOther("Hello"), "everyOther(\"Hello\") -> \"Hlo\" fails");
        assertEquals("H", everyOther("Hi"), "everyOther(\"Hi\") -> \"H\" fails");
        assertEquals("Hello", everyOther("Heeololeo"), "everyOther(\"Heeololeo\") -> \"Hello\" fails");
    }

    @Test
    public void testStringSplosion() {
        assertEquals("CCoCodCode", stringSplosion("Code"), "stringSplosion(\"Code\") -> \"CCoCodCode\" fails");
        assertEquals("aababc", stringSplosion("abc"), "stringSplosion(\"abc\") -> \"aababc\" fails");
        assertEquals("aab", stringSplosion("ab"), "stringSplosion(\"ab\") -> \"aab\" fails");
    }

    @Test
    public void testCountLast2() {
        assertEquals(1, countLast2("hixxhi"), "countLast2(\"hixxhi\") -> 1 fails");
        assertEquals(1, countLast2("xaxxaxaxx"), "countLast2(\"xaxxaxaxx\") -> 1 fails");
        assertEquals(2, countLast2("axxxaaxx"), "countLast2(\"axxxaaxx\") -> 2 fails");
    }

    @Test
    public void testCount9() {
        assertEquals(1, count9(new int[]{1, 2, 9}), "count9({1, 2, 9}) -> 1 fails");
        assertEquals(2, count9(new int[]{1, 9, 9}), "count9({1, 9, 9}) -> 2 fails");
        assertEquals(3, count9(new int[]{1, 9, 9, 3, 9}), "count9({1, 9, 9, 3, 9}) -> 3 fails");
    }

    @Test
    public void testArrayFront9() {
        assertEquals(true, arrayFront9(new int[]{1, 2, 9, 3, 4}), "arrayFront9({1, 2, 9, 3, 4}) -> true fails");
        assertEquals(false, arrayFront9(new int[]{1, 2, 3, 4, 9}), "arrayFront9({1, 2, 3, 4, 9}) -> false fails");
        assertEquals(false, arrayFront9(new int[]{1, 2, 3, 4, 5}), "arrayFront9({1, 2, 3, 4, 5}) -> false fails");
    }

    @Test
    public void testArray123() {
        assertEquals(true, array123(new int[]{1, 1, 2, 3, 1}), "array123({1, 1, 2, 3, 1}) -> true fails");
        assertEquals(false, array123(new int[]{1, 1, 2, 4, 1}), "array123({1, 1, 2, 4, 1}) -> false fails");
        assertEquals(true, array123(new int[]{1, 1, 2, 1, 2, 3}), "array123({1, 1, 2, 1, 2, 3}) -> true fails");
        assertEquals(true, array123(new int[]{1, 2, 3}), "array123({1, 2, 3}) -> true fails");
        assertEquals(false, array123(new int[]{3}), "array123({3}) -> false fails");
        assertEquals(false, array123(new int[]{3, 2}), "array123({3, 2}) -> false fails");
    }

    @Test
    public void testSubStringMatch() {
        assertEquals(3, subStringMatch("xxcaazz", "xxbaaz"), "subStringMatch(\"xxcaazz\", \"xxbaaz\") -> 3 fails");
        assertEquals(2, subStringMatch("abc", "abc"), "subStringMatch(\"abc\", \"abc\") -> 2 fails");
        assertEquals(0, subStringMatch("abc", "axc"), "subStringMatch(\"abc\", \"axc\") -> 0 fails");
    }

    @Test
    public void testStringX() {
        assertEquals("xHix", stringX("xxHxix"), "stringX(\"xxHxix\") -> \"xHix\" fails");
        assertEquals("abcd", stringX("abxxxcd"), "stringX(\"abxxxcd\") -> \"abcd\" fails");
        assertEquals("xabcdx", stringX("xabxxxcdx"), "stringX(\"xabxxxcdx\") -> \"xabcdx\" fails");
    }

    @Test
    public void testAltPairs() {
        assertEquals("kien", altPairs("kitten"), "altPairs(\"kitten\") -> \"kien\" fails");
        assertEquals("Chole", altPairs("Chocolate"), "altPairs(\"Chocolate\") -> \"Chole\" fails");
        assertEquals("Congrr", altPairs("CodingHorror"), "altPairs(\"CodingHorror\") -> \"Congrr\" fails");
    }

    @Test
    public void testDoNotYak() {
        assertEquals("pak", doNotYak("yakpak"), "doNotYak(\"yakpak\") -> \"pak\" fails");
        assertEquals("pak", doNotYak("pakyak"), "doNotYak(\"pakyak\") -> \"pak\" fails");
        assertEquals("123ya", doNotYak("yak123ya"), "doNotYak(\"yak123ya\") -> \"123ya\" fails");
    }

    @Test
    public void testArray667() {
        assertEquals(1, array667(new int[]{6, 6, 2}), "array667({6, 6, 2}) -> 1 fails");
        assertEquals(1, array667(new int[]{6, 6, 2, 6}), "array667({6, 6, 2, 6}) -> 1 fails");
        assertEquals(1, array667(new int[]{6, 7, 2, 6}), "array667({6, 7, 2, 6}) ->1  fails");
        assertEquals(2, array667(new int[]{6, 7, 6, 6}), "array667({6, 7, 6, 6}) ->2  fails");
        assertEquals(0, array667(new int[]{1, 2, 6}), "array667({1, 2, 6}) ->0  fails");
    }

    @Test
    public void testNoTriples() {
        assertEquals(true, noTriples(new int[]{1, 1, 2, 2, 1}), "noTriples({1, 1, 2, 2, 1}) -> true fails");
        assertEquals(false, noTriples(new int[]{1, 1, 2, 2, 2, 1}), "noTriples({1, 1, 2, 2, 2, 1}) -> false fails");
        assertEquals(false, noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}), "noTriples({1, 1, 1, 2, 2, 2, 1}) -> false  fails");
        assertEquals(true, noTriples(new int[]{3, 1, 1}), "noTriples({ 3, 1, 1 }) -> true  fails");
        assertEquals(true, noTriples(new int[]{2, 1}), "noTriples({2, 1}) -> true  fails");
    }

    @Test
    public void testPattern51() {
        assertEquals(true, pattern51(new int[]{1, 2, 7, 1}), "pattern51({1, 2, 7, 1}) -> true fails");
        assertEquals(false, pattern51(new int[]{1, 2, 8, 1}), "pattern51({1, 2, 8, 1}) -> false fails");
        assertEquals(true, pattern51(new int[]{2, 7, 1}), "pattern51({2, 7, 1}) -> true  fails");
        assertEquals(true, pattern51(new int[]{6, 4, 9, 3, 2}), "pattern51({6, 4, 9, 3, 2}) -> true fails");
        assertEquals(false, pattern51(new int[]{2, 7}), "pattern51({2, 7}) -> false fails");
    }

}
