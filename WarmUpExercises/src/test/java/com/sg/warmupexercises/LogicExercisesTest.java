package com.sg.warmupexercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.sg.warmupexercises.LogicExercises.*;

/**
 *
 * @author nkaur
 */
public class LogicExercisesTest {

    public LogicExercisesTest() {
    }

    @Test
    public void testGreatParty() {
        assertEquals(false, greatParty(30, false), "greatParty(30, false) → false fails");
        assertEquals(true, greatParty(50, false), "greatParty(50, false) → true fails");
        assertEquals(true, greatParty(70, true), "greatParty(70, true) → true  fails");
    }

    @Test
    public void testCanHazTable() {
        assertEquals(2, canHazTable(5, 10), "canHazTable(5, 10) → 2 fails");
        assertEquals(0, canHazTable(5, 2), "canHazTable(5, 2) → 0 fails");
        assertEquals(1, canHazTable(5, 5), "canHazTable(5, 5) → 1  fails");
    }

    @Test
    public void testPlayOutside() {
        assertEquals(true, playOutside(70, false), "playOutside(70, false) → true fails");
        assertEquals(false, playOutside(95, false), "playOutside(95, false) → false fails");
        assertEquals(true, playOutside(95, true), "playOutside(95, true) → true  fails");
    }

    @Test
    public void testCaughtSpeeding() {
        assertEquals(0, caughtSpeeding(60, false), "caughtSpeeding(60, false) → 0 fails");
        assertEquals(1, caughtSpeeding(65, false), "caughtSpeeding(65, false) → 1 fails");
        assertEquals(0, caughtSpeeding(65, true), "caughtSpeeding(65, true) →0  fails");
    }

    @Test
    public void testSkipSum() {
        assertEquals(7, skipSum(3, 4), "skipSum(3, 4) →7 fails");
        assertEquals(20, skipSum(9, 4), "skipSum(9, 4) → 20 fails");
        assertEquals(21, skipSum(10, 11), "skipSum(10, 11) → 21  fails");
    }

    @Test
    public void testAlarmClock() {
        assertEquals("7:00", alarmClock(1, false), "alarmClock(1, false) → \"7:00\" fails");
        assertEquals("7:00", alarmClock(5, false), "alarmClock(5, false) → \"7:00\" fails");
        assertEquals("10:00", alarmClock(0, false), "alarmClock(0, false) → \"10:00\"  fails");
    }

    @Test
    public void testLoveSix() {
        assertEquals(true, loveSix(6, 4), "loveSix(6, 4) → true fails");
        assertEquals(false, loveSix(4, 5), "loveSix(4, 5) → false fails");
        assertEquals(true, loveSix(1, 5), "loveSix(1, 5) → true fails");
    }

    @Test
    public void testInRange() {
        assertEquals(true, inRange(5, false), "inRange(5, false) → true fails");
        assertEquals(false, inRange(11, false), "inRange(11, false) → false fails");
        assertEquals(true, inRange(11, true), "inRange(11, true) → true fails");
    }

    @Test
    public void testSpecialEleven() {
        assertEquals(true, specialEleven(22), "specialEleven(22) → true fails");
        assertEquals(true, specialEleven(23), "specialEleven(23) → true fails");
        assertEquals(false, specialEleven(24), "specialEleven(24) → false fails");
    }

    @Test
    public void testmod20() {
        assertEquals(false, mod20(20), "mod20(20) → false fails");
        assertEquals(true, mod20(21), "mod20(21) → true fails");
        assertEquals(true, mod20(22), "mod20(22) → true fails");
    }

    @Test
    public void testMod35() {
        assertEquals(true,mod35(3), "mod35(3) → true fails");
        assertEquals(true, mod35(10), "mod35(10) → true fails");
        assertEquals(false, mod35(15), "mod35(15) → false fails");
    }
    
    @Test
    public void testAnswerCell() {
        assertEquals(true,answerCell(false, false, false), "answerCell(false, false, false) → true fails");
        assertEquals(false, answerCell(false, false, true), "answerCell(false, false, true) → false fails");
        assertEquals(false, answerCell(true, false, false), "answerCell(true, false, false) → false fails");
    }
    
    @Test
    public void testTwoIsOne() {
        assertEquals(true,twoIsOne(1,2,3), "twoIsOne(1, 2, 3) → true fails");
        assertEquals(true, twoIsOne(3,1,2), "twoIsOne(3, 1, 2) → true fails");
        assertEquals(false, twoIsOne(3,2,2), "twoIsOne(3, 2, 2) → false fails");
    }
    
    @Test
    public void testAreInOrder() {
        assertEquals(true,areInOrder(1,2,4,false), "areInOrder(1, 2, 4, false) → true fails");
        assertEquals(false, areInOrder(1,2,1,false), "areInOrder(1, 2, 1, false) → false fails");
        assertEquals(true, areInOrder(1,1,2,true), "areInOrder(1, 1, 2, true) → true fails");
    }
    
    @Test
    public void testInOrderEqual() {
        assertEquals(true,inOrderEqual(2,5,11,false), "inOrderEqual(2, 5, 11, false) → true fails");
        assertEquals(false, inOrderEqual(5,7,6,false), "inOrderEqual(5, 7, 6, false) → false fails");
        assertEquals(true, inOrderEqual(5,5,7,true), "inOrderEqual(5, 5, 7, true) → true fails");
    }
    
    @Test
    public void testLastDigit() {
        assertEquals(true,lastDigit(23, 19, 13), "lastDigit(23, 19, 13) → true fails");
        assertEquals(false, lastDigit(23, 19, 12), "lastDigit(23, 19, 12) → false fails");
        assertEquals(true, lastDigit(23, 19, 3), "lastDigit(23, 19, 3) → true fails");
    }
    
    @Test
    public void testRollDice() {
        assertEquals(5,rollDice(2, 3, true), "rollDice(2, 3, true) → 5 fails");
        assertEquals(7, rollDice(3, 3, true), "rollDice(3, 3, true) → 7 fails");
        assertEquals(6, rollDice(3, 3, false), "rollDice(3, 3, false) → 6 fails");
    }
}
