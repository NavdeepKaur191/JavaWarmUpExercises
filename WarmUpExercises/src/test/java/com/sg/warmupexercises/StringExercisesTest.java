package com.sg.warmupexercises;

import static com.sg.warmupexercises.StringExercises.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nkaur
 */
public class StringExercisesTest {

    public StringExercisesTest() {
    }

    @Test
    public void testSayHi() {
        assertEquals("Hello Bob!", sayHi("Bob"), "sayHi(\"Bob\") -> \"Hello Bob!\" fails");
        assertEquals("Hello Alice!", sayHi("Alice"), "sayHi(\"Alice\") -> \"Hello Alice!\" fails");
        assertEquals("Hello X!", sayHi("X"), "sayHi(\"X\") -> \"Hello X!\" fails");
    }

    @Test
    public void testAbba() {
        assertEquals("HiByeByeHi", abba("Hi", "Bye"), "abba(\"Hi\", \"Bye\") -> \"HiByeByeHi\" fails");
        assertEquals("YoAliceAliceYo", abba("Yo", "Alice"), "abba(\"Yo\", \"Alice\") -> \"YoAliceAliceYo\" fails");
        assertEquals("WhatUpUpWhat", abba("What", "Up"), "abba(\"What\", \"Up\") -> \"WhatUpUpWhat\" fails");
    }

    @Test
    public void testMakeTags() {
        assertEquals("<i>Yay</i>", makeTags("i", "Yay"), "makeTags(\"i\", \"Yay\") -> \"<i>Yay</i>\" fails");
        assertEquals("<i>Hello</i>", makeTags("i", "Hello"), "makeTags(\"i\", \"Hello\") -> \"<i>Hello</i>\" fails");
        assertEquals("<cite>Yay</cite>", makeTags("cite", "Yay"), "makeTags(\"cite\", \"Yay\") -> \"<cite>Yay</cite>\" fails");
    }

    @Test
    public void testInsertWord() {
        assertEquals("<<Yay>>", insertWord("<<>>", "Yay"), "insertWord(\"<<>>\", \"Yay\") -> \"<<Yay>>\" fails");
        assertEquals("<<WooHoo>>", insertWord("<<>>", "WooHoo"), "insertWord(\"<<>>\", \"WooHoo\") -> \"<<WooHoo>>\" fails");
        assertEquals("[[word]]", insertWord("[[]]", "word"), "insertWord(\"[[]]\", \"word\") -> \"[[word]]\" fails");
    }

    @Test
    public void testMultipleEndings() {
        assertEquals("lololo", multipleEndings("Hello"), "multipleEndings(\"Hello\") -> \"lololo\" fails");
        assertEquals("ababab", multipleEndings("ab"), "multipleEndings(\"ab\") -> \"ababab\" fails");
        assertEquals("HiHiHi", multipleEndings("Hi"), "multipleEndings(\"Hi\") -> \"HiHiHi\" fails");
    }

    @Test
    public void testFirstHalf() {
        assertEquals("Woo", firstHalf("WooHoo"), "firstHalf(\"WooHoo\") -> \"Woo\" fails");
        assertEquals("Hello", firstHalf("HelloThere"), "firstHalf(\"HelloThere\") -> \"Hello\" fails");
        assertEquals("abc", firstHalf("abcdef"), "firstHalf(\"abcdef\") -> \"abc\" fails");
    }

    @Test
    public void testTrimOne() {
        assertEquals("ell", trimOne("Hello"), "trimOne(\"Hello\") -> \"ell\" fails");
        assertEquals("av", trimOne("java"), "trimOne(\"java\") -> \"av\" fails");
        assertEquals("odin", trimOne("coding"), "trimOne(\"coding\") -> \"odin\" fails");
    }

    @Test
    public void testLongInMiddle() {
        assertEquals("hiHellohi", longInMiddle("Hello", "hi"), "longInMiddle(\"Hello\", \"hi\") -> \"hiHellohi\" fails");
        assertEquals("hiHellohi", longInMiddle("hi", "Hello"), "longInMiddle(\"hi\", \"Hello\") -> \"hiHellohi\" fails");
        assertEquals("baaab", longInMiddle("aaa", "b"), "longInMiddle(\"aaa\", \"b\") -> \"baaab\" fails");
    }

    @Test
    public void testRotateleft2() {
        assertEquals("lloHe", rotateleft2("Hello"), "rotateleft2(\"Hello\") -> \"lloHe\" fails");
        assertEquals("vaja", rotateleft2("java"), "rotateleft2(\"java\") -> \"vaja\" fails");
        assertEquals("Hi", rotateleft2("Hi"), "rotateleft2(\"Hi\") -> \"Hi\" fails");
    }

    @Test
    public void testRotateRight2() {
        assertEquals("loHel", rotateRight2("Hello"), "rotateRight2(\"Hello\") -> \"loHel\" fails");
        assertEquals("vaja", rotateRight2("java"), "rotateRight2(\"java\") -> \"vaja\" fails");
        assertEquals("Hi", rotateRight2("Hi"), "rotateRight2(\"Hi\") -> \"Hi\" fails");
    }

    @Test
    public void testTakeOne() {
        assertEquals("H", takeOne("Hello", true), "takeOne(\"Hello\", true) -> \"H\" fails");
        assertEquals("o", takeOne("Hello", false), "takeOne(\"Hello\", false) -> \"o\" fails");
        assertEquals("o", takeOne("oh", true), "takeOne(\"oh\", true) -> \"o\" fails");
    }

    @Test
    public void testMiddleTwo() {
        assertEquals("ri", middleTwo("string"), "middleTwo(\"string\") -> \"ri\" fails");
        assertEquals("od", middleTwo("code"), "middleTwo(\"code\") -> \"od\" fails");
        assertEquals("ct", middleTwo("Practice"), "middleTwo(\"Practice\") -> \"ct\" fails");
    }

    @Test
    public void testEndsWithLy() {
        assertEquals(true, endsWithLy("oddly"), "endsWithLy(\"oddly\") -> true fails");
        assertEquals(false, endsWithLy("y"), "endsWithLy(\"y\") -> false fails");
        assertEquals(false, endsWithLy("oddy"), "endsWithLy(\"oddy\") -> false fails");
    }

    @Test
    public void testFrontAndBack() {
        assertEquals("Helo", frontAndBack("Hello", 2), "frontAndBack(\"Hello\", 2) -> \"Helo\" fails");
        assertEquals("Choate", frontAndBack("Chocolate", 3), "frontAndBack(\"Chocolate\", 3) -> \"Choate\" fails");
        assertEquals("Ce", frontAndBack("Chocolate", 1), "frontAndBack(\"Chocolate\", 1) -> \"Ce\" fails");
    }

    @Test
    public void testTakeTwoFromPosition() {
        assertEquals("ja", takeTwoFromPosition("java", 0), "takeTwoFromPosition(\"java\", 0) -> \"ja\" fails");
        assertEquals("va", takeTwoFromPosition("java", 2), "takeTwoFromPosition(\"java\", 2) -> \"va\" fails");
        assertEquals("ja", takeTwoFromPosition("java", 3), "takeTwoFromPosition(\"java\", 3) -> \"ja\" fails");
    }

    @Test
    public void testHasBad() {
        assertEquals(true, hasBad("badxx"), "hasBad(\"badxx\") -> true fails");
        assertEquals(true, hasBad("xbadxx"), "hasBad(\"xbadxx\") -> true fails");
        assertEquals(false, hasBad("xxbadxx"), "hasBad(\"xxbadxx\") -> false fails");
        assertEquals(false, hasBad(""), "hasBad(\"\") -> false fails");
        assertEquals(false, hasBad("cantaloupe"), "hasBad(\"cantaloupe\") -> false fails");
    }

    @Test
    public void testAtFirst() {
        assertEquals("he", atFirst("hello"), " atFirst(\"hello\") -> \"he\" fails");
        assertEquals("hi", atFirst("hi"), "atFirst(\"hi\") -> \"hi\" fails");
        assertEquals("h@", atFirst("h"), "atFirst(\"h\") -> \"h@\" fails");
        assertEquals("@@", atFirst(""), "atFirst(\"\") -> \"@@\" fails");
    }

    @Test
    public void testLastChars() {
        assertEquals("ls", lastChars("last", "chars"), "lastChars(\"last\", \"chars\") -> \"ls\" fails");
        assertEquals("ya", lastChars("yo", "mama"), "lastChars(\"yo\", \"mama\") -> \"ya\" fails");
        assertEquals("h@", lastChars("hi", ""), "lastChars(\"hi\", \"\") -> \"h@\" fails");
        assertEquals("@@", lastChars("", ""), "lastChars(\"\", \"\") -> \"@@\" fails");
        assertEquals("@f", lastChars("", "f"), "lastChars(\"\", \"f\") -> \"@f\" fails");
    }

    @Test
    public void testConCat() {
        assertEquals("abcat", conCat("abc", "cat"), "conCat(\"abc\", \"cat\") -> \"abcat\" fails");
        assertEquals("dogcat", conCat("dog", "cat"), "conCat(\"dog\", \"cat\") -> \"dogcat\" fails");
        assertEquals("abc", conCat("abc", ""), "conCat(\"abc\", \"\") -> \"abc\" fails");
        assertEquals("abc", conCat("", "abc"), "conCat(\"\", \"abc\") -> \"abc\" fails");
        assertEquals("boat", conCat("b", "boat"), " conCat(\"b\", \"boat\") -> \"boat\" fails");
        assertEquals("boat", conCat("boat", "t"), "conCat(\"boat\", \"t\") -> \"boat\" fails");
    }

    @Test
    public void testSwapLast() {
        assertEquals("codign", swapLast("coding"), "swapLast(\"coding\") -> \"codign\" fails");
        assertEquals("cta", swapLast("cat"), "swapLast(\"cat\") -> \"cta\" fails");
        assertEquals("ba", swapLast("ab"), "swapLast(\"ab\") -> \"ba\" fails");
        assertEquals("a", swapLast("a"), "swapLast(\"a\") -> \"a\" fails");
    }

    @Test
    public void testFrontAgain() {
        assertEquals(true, frontAgain("edited"), "frontAgain(\"edited\") -> true fails");
        assertEquals(false, frontAgain("edit"), "frontAgain(\"edit\") -> false fails");
        assertEquals(true, frontAgain("ed"), "frontAgain(\"ed\") -> true fails");
    }

    @Test
    public void testMinCat() {
        assertEquals("loHi", minCat("Hello", "Hi"), "minCat(\"Hello\", \"Hi\") -> \"loHi\" fails");
        assertEquals("ellojava", minCat("Hello", "java"), "minCat(\"Hello\", \"java\") -> \"ellojava\" fails");
        assertEquals("javaello", minCat("java", "Hello"), "minCat(\"java\", \"Hello\") -> \"javaello\" fails");
        assertEquals("", minCat("", "beep"), "minCat(\"\", \"beep\") -> \"\" fails");
        assertEquals("xy", minCat("x", "yyyyy"), "minCat(\"x\", \"yyyyy\") -> \"xy\" fails");
    }

    @Test
    public void testTweakFront() {
        assertEquals("llo", tweakFront("Hello"), "tweakFront(\"Hello\") -> \"llo\" fails");
        assertEquals("aay", tweakFront("away"), "tweakFront(\"away\") -> \"aay\" fails");
        assertEquals("abed", tweakFront("abed"), "tweakFront(\"abed\") -> \"abed\" fails");
        assertEquals("boe", tweakFront("oboe"), "tweakFront(\"oboe\") -> \"boe\" fails");
        assertEquals("", tweakFront(""), "tweakFront(\"\") -> \"\" fails");
    }

    @Test
    public void testStripX() {
        assertEquals("Hi", stripX("xHix"), "stripX(\"xHix\") -> \"Hi\" fails");
        assertEquals("Hi", stripX("xHi"), "stripX(\"xHi\") -> \"Hi\" fails");
        assertEquals("Hxi", stripX("Hxix"), "stripX(\"Hxix\") -> \"Hxi\" fails");
        assertEquals("", stripX("x"), "stripX(\"x\") -> \"\" fails");
        assertEquals("", stripX(""), "stripX(\"\") -> \"\" fails");
    }

}
