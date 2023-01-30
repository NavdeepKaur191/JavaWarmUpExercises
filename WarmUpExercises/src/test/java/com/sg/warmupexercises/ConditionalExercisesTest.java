package com.sg.warmupexercises;

import static com.sg.warmupexercises.ConditionalExercises.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nkaur
 */
public class ConditionalExercisesTest {

    public ConditionalExercisesTest() {
    }

    @Test
    public void testAreWeInTrouble() {
        assertEquals(true, areWeInTrouble(true, true), "areWeInTrouble(true, true) -> true fails");
        assertEquals(true, areWeInTrouble(false, false), "areWeInTrouble(false, false) -> true fails");
        assertEquals(false, areWeInTrouble(true, false), " areWeInTrouble(true, false) -> false fails");
        assertEquals(false, areWeInTrouble(false, true), " areWeInTrouble(false,true) -> false fails");
    }

    @Test
    public void testCanSleepIn() {
        assertEquals(true, canSleepIn(false, false), "canSleepIn(false, false) -> true fails");
        assertEquals(false, canSleepIn(true, false), " canSleepIn(true, false) -> false fails");
        assertEquals(true, canSleepIn(false, true), "canSleepIn(false, true) -> true fails");
    }

    @Test
    public void testsumDouble() {
        assertEquals(3, sumDouble(1, 2), "sumDouble(1, 2) -> 3 fails");
        assertEquals(5, sumDouble(3, 2), "sumDouble(3, 2) -> 5 fails");
        assertEquals(8, sumDouble(2, 2), "sumDouble(2, 2) -> 8  fails");
    }

    @Test
    public void testDiff21() {
        assertEquals(4, diff21(23), "diff21(23) -> 4 fails");
        assertEquals(11, diff21(10), "diff21(10) -> 11 fails");
        assertEquals(0, diff21(21), "diff21(21) -> 0 fails");
    }

    @Test
    public void testParrotTrouble() {
        assertEquals(true, parrotTrouble(true, 6), "parrotTrouble(true, 6) -> true fails");
        assertEquals(false, parrotTrouble(true, 7), "parrotTrouble(true, 7) -> false fails");
        assertEquals(false, parrotTrouble(false, 6), "parrotTrouble(false, 6) -> false fails");
    }

    @Test
    public void testMakes10() {
        assertEquals(true, makes10(9, 10), "makes10(9, 10) -> true fails");
        assertEquals(false, makes10(9, 9), "makes10(9, 9) -> false fails");
        assertEquals(true, makes10(1, 9), "makes10(1, 9) -> true fails");
    }

    @Test
    public void testNearHundred() {
        assertEquals(true, nearHundred(103), "nearHundred(103) -> true fails");
        assertEquals(true, nearHundred(90), "nearHundred(90) -> true fails");
        assertEquals(false, nearHundred(89), "nearHundred(89) -> false fails");
    }

    @Test
    public void testPosNeg() {
        assertEquals(true, posNeg(1, -1, false), "posNeg(1, -1, false) -> true fails");
        assertEquals(true, posNeg(-1, 1, false), "posNeg(-1, 1, false) -> true fails");
        assertEquals(true, posNeg(-4, -5, true), "posNeg(-4, -5, true) -> true fails");
    }

    @Test
    public void testNotString() {
        assertEquals("not candy", notString("candy"), "notString(\"candy\") -> \"not candy\" fails");
        assertEquals("not x", notString("x"), "notString(\"x\") -> \"not x\" fails");
        assertEquals("not bad", notString("not bad"), "notString(\"not bad\") -> \"not bad\" fails");
    }

    @Test
    public void testMissingChar() {
        assertEquals("ktten", missingChar("kitten", 1), "missingChar(\"kitten\", 1) -> \"ktten\" fails");
        assertEquals("itten", missingChar("kitten", 0), "missingChar(\"kitten\", 0) -> \"itten\" fails");
        assertEquals("kittn", missingChar("kitten", 4), "missingChar(\"kitten\", 4) -> \"kittn\" fails");
    }

    @Test
    public void testFrontBack() {
        assertEquals("eodc", frontBack("code"), "frontBack(\"code\") -> \"eodc\" fails");
        assertEquals("a", frontBack("a"), "frontBack(\"a\") -> \"a\" fails");
        assertEquals("ba", frontBack("ab"), "frontBack(\"ab\") -> \"ba\" fails");
    }

    @Test
    public void testFront3() {
        assertEquals("MicMicMic", front3("Microsoft"), "front3(\"Microsoft\") -> \"MicMicMic\" fails");
        assertEquals("ChoChoCho", front3("Chocolate"), "front3(\"Chocolate\") -> \"ChoChoCho\" fails");
        assertEquals("atatat", front3("at"), "front3(\"at\") -> \"atatat\" fails");
    }

    @Test
    public void testBackAround() {
        assertEquals("tcatt", backAround("cat"), "backAround(\"cat\") -> \"tcatt\" fails");
        assertEquals("oHelloo", backAround("Hello"), "backAround(\"Hello\") -> \"oHelloo\" fails");
        assertEquals("aaa", backAround("a"), "backAround(\"a\") -> \"aaa\" fails");
    }

    @Test
    public void testMultiple3or5() {
        assertEquals(true, multiple3or5(3), " multiple3or5(3) -> true fails");
        assertEquals(true, multiple3or5(10), "multiple3or5(10) -> true fails");
        assertEquals(false, multiple3or5(8), "multiple3or5(8) -> false fails");
    }

    @Test
    public void testStartHi() {
        assertEquals(true, startHi("hi there"), "startHi(\"hi there\") -> true fails");
        assertEquals(true, startHi("hi"), "startHi(\"hi\") -> true fails");
        assertEquals(false, startHi("high up"), "startHi(\"high up\") -> false fails");
        assertEquals(false, startHi("g"), "startHi(\"g\") -> false fails");
        assertEquals(false, startHi("hip"), "startHi(\"hip\") -> false fails");
        assertEquals(true, startHi("hi, how are you?"), "startHi(\"hi, how are you?\") -> true fails");
    }

    @Test
    public void testIcyHot() {
        assertEquals(true, icyHot(120, -1), " icyHot(120, -1) -> true fails");
        assertEquals(true, icyHot(-1, 120), "icyHot(-1, 120) -> true fails");
        assertEquals(false, icyHot(2, 120), "icyHot(2, 120) -> false fails");
    }

    @Test
    public void testBetween10and20() {
        assertEquals(true, between10and20(12, 99), " between10and20(12, 99) -> true fails");
        assertEquals(true, between10and20(21, 12), "between10and20(21, 12) -> true fails");
        assertEquals(false, between10and20(8, 99), "between10and20(8, 99) -> false fails");
    }

    @Test
    public void testHasTeen() {
        assertEquals(true, hasTeen(13, 20, 10), " hasTeen(13, 20, 10) -> true fails");
        assertEquals(true, hasTeen(20, 19, 10), "hasTeen(20, 19, 10) -> true fails");
        assertEquals(false, hasTeen(20, 10, 12), "hasTeen(20, 10, 12) -> false fails");
    }

    @Test
    public void testSoAlone() {
        assertEquals(true, soAlone(13, 99), " soAlone(13, 99) -> true fails");
        assertEquals(true, soAlone(21, 19), "soAlone(21, 19) -> true fails");
        assertEquals(false, soAlone(13, 13), "soAlone(13,13) -> false fails");        
        assertEquals(false, soAlone(44, 5), "soAlone(44,5) -> false fails");               
    }

    @Test
    public void testRemoveDel() {
        assertEquals("abc", removeDel("adelbc"), "removeDel(\"adelbc\") -> \"abc\" fails");
        assertEquals("aHello", removeDel("adelHello"), "removeDel(\"adelHello\") -> \"aHello\" fails");
        assertEquals("adedbc", removeDel("adedbc"), "removeDel(\"adedbc\") -> \"adedbc\" fails");
    }

    @Test
    public void testIxStart() {
        assertEquals(true, ixStart("mix snacks"), "ixStart(\"mix snacks\") -> true fails");
        assertEquals(true, ixStart("pix snacks"), "ixStart(\"pix snacks\") -> true fails");
        assertEquals(false, ixStart("piz snacks"), "removeDel(ixStart(\"piz snacks\") -> false fails");
    }

    @Test
    public void testStartOz() {
        assertEquals("oz", startOz("ozymandias"), "startOz(\"ozymandias\") -> \"oz\" fails");
        assertEquals("z", startOz("bzoo"), "ixStart(startOz(\"bzoo\") -> \"z\" fails");
        assertEquals("o", startOz("oxx"), "removeDel(startOz(\"oxx\") -> \"o\" fails");
        assertEquals("", startOz("w"), "removeDel(startOz(\"w\") -> \"\" fails");        
    }

    @Test
    public void testMax() {
        assertEquals(3, max(1, 2, 3), "max(1, 2, 3) -> 3 fails");
        assertEquals(3, max(1, 3, 2), "max(1, 3, 2) -> 3 fails");
        assertEquals(3, max(3, 2, 1), "max(3, 2, 1) -> 3 fails");
    }

    @Test
    public void testCloser() {
        assertEquals(8, closer(8, 13), "closer(8, 13) -> 8 fails");
        assertEquals(8, closer(13, 8), "closer(13, 8) -> 8 fails");
        assertEquals(0, closer(13, 7), "closer(13, 7) -> 0 fails");
    }

    @Test
    public void testGotE() {
        assertEquals(true, gotE("Hello"), "gotE(\"Hello\") -> true fails");
        assertEquals(true, gotE("Heelle"), "gotE(\"Heelle\") -> true fails");
        assertEquals(false, gotE("Heelele"), "gotE(\"Heelele\") -> false fails");         
        assertEquals(false, gotE("344"), "gotE(\"344\") -> false fails");       
    }

    @Test
    public void testEndUp() {
        assertEquals("HeLLO", endUp("Hello"), " endUp(\"Hello\") -> \"HeLLO\" fails");
        assertEquals("hi thERE", endUp("hi there"), "endUp(\"hi there\") -> \"hi thERE\" fails");
        assertEquals("HI", endUp("hi"), "endUp(\"hi\") -> \"HI\" fails");
    }

    @Test
    public void testEveryNth() {
        assertEquals("Mrce", everyNth("Miracle", 2), "everyNth(\"Miracle\", 2) -> \"Mrce\" fails");
        assertEquals("aceg", everyNth("abcdefg", 2), "everyNth(\"abcdefg\", 2) -> \"aceg\" fails");
        assertEquals("adg", everyNth("abcdefg", 3), "everyNth(\"abcdefg\", 3) -> \"adg\" fails");
    }
}
