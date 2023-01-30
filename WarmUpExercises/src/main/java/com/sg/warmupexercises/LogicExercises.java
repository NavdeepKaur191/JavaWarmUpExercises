package com.sg.warmupexercises;

/**
 *
 * @author nkaur
 */
public class LogicExercises {

    /**
     * Please replace the code in following method according to following details.
     * 
     * 1.When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
     * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
     * Return true if the party with the given values is successful, or false otherwise.
     *
     * Example Results:
     * greatParty(30, false) → false
     * greatParty(50, false) → true
     * greatParty(70, true) → true
     *
     * @param cigars
     * @param isWeekend
     * @return
     */
    public static boolean greatParty(int cigars, boolean isWeekend) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 2.You and your date are trying to get a table at a restaurant.
     * The parameter "you" is the stylishness of your clothes, in the range 0..10,
     * and "date" is the stylishness of your date's clothes.
     * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
     * If either of you is very stylish, 8 or more, then the result is 2 (yes).
     * With the exception that if either of you has style of 2 or less,
     * then the result is 0 (no). Otherwise the result is 1 (maybe).
     *
     * Example Results:
     * canHazTable(5, 10) → 2
     * canHazTable(5, 2) → 0
     * canHazTable(5, 5) → 1
     *
     * @param yourStyle
     * @param dateStyle
     * @return
     */
    public static int canHazTable(int yourStyle, int dateStyle) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     * 
     * 3.The children in Cleveland spend most of the day playing outside. In particular,
     * they play if the temperature is between 60 and 90 (inclusive). Unless it is summer,
     * then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer,
     * return true if the children play and false otherwise.
     *
     * Example Results:
     * playOutside(70, false) → true
     * playOutside(95, false) → false
     * playOutside(95, true) → true
     *
     * @param temp
     * @param isSummer
     * @return
     */
    public static boolean playOutside(int temp, boolean isSummer) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 4.You are driving a little too fast, and a police officer stops you.
     * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
     * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
     * If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
     * your speed can be 5 higher in all cases.
     *
     * Example Results:
     * caughtSpeeding(60, false) → 0
     * caughtSpeeding(65, false) → 1
     * caughtSpeeding(65, true) → 0
     *
     * @param speed
     * @param isBirthday
     * @return
     */
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     * 
     * 5.Given 2 int values, a and b, return their sum. However, sums in the range 10..19 inclusive are forbidden,
     * so in that case just return 20.
     *
     * Example Results:
     * skipSum(3, 4) → 7
     * skipSum(9, 4) → 20
     * skipSum(10, 11) → 21
     *
     * @param a
     * @param b
     * @return
     */
    public static int skipSum(int a, int b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     * 
     * 6.Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
     * and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating
     * when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
     * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
     *
     * Example Results:
     * alarmClock(1, false) → "7:00"
     * alarmClock(5, false) → "7:00"
     * alarmClock(0, false) → "10:00"
     *
     * @param day
     * @param vacation
     * @return
     */
    public static String alarmClock(int day, boolean vacation) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 7.The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
     * Or if their sum or difference is 6.
     *
     * Example Results:
     * loveSix(6, 4) → true
     * loveSix(4, 5) → false
     * loveSix(1, 5) → true
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean loveSix(int a, int b) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 8.Given a number n, return true if n is in the range 1..10, inclusive.
     * Unless "outsideMode" is true, in which case return true if the number is less or equal to 1,
     * or greater or equal to 10.
     *
     * Example Results:
     * inRange(5, false) → true
     * inRange(11, false) → false
     * inRange(11, true) → true
     *
     * @param n
     * @param outsideMode
     * @return
     */
    public static boolean inRange(int n, boolean outsideMode) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     * 
     * 9.We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
     * Return true if the given non-negative number is special. Use the % "mod" operator
     *
     * Example Results:
     * specialEleven(22) → true
     * specialEleven(23) → true
     * specialEleven(24) → false
     *
     * @param n
     * @return
     */
    public static boolean specialEleven(int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 10.Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
     * See also: Introduction to Mod
     *
     * Example Results:
     * mod20(20) → false
     * mod20(21) → true
     * mod20(22) → true
     *
     * @param n
     * @return
     */
    public static boolean mod20(int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     *
     * Please replace the code in following method according to following details.
     * 
     * 11.Return true if the given non-negative number is a multiple of 3 or 5, but not both.
     * Use the % "mod" operator
     *
     * Example Results:
     * mod35(3) → true
     * mod35(10) → true
     * mod35(15) → false
     *
     * @param n
     * @return
     */
    public static boolean mod35(int n) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 12.Your cell phone rings. Return true if you should answer it.
     * Normally you answer, except in the morning you only answer if it is your mom calling.
     * In all cases, if you are asleep, you do not answer.
     *
     * Example Results:
     * answerCell(false, false, false) → true
     * answerCell(false, false, true) → false
     * answerCell(true, false, false) → false
     *
     * @param isMorning
     * @param isMom
     * @param isAsleep
     * @return
     */
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 13.Given three int values, a b c, return true if it is possible to add two of the int to get the third.
     *
     * Example Results:
     * twoIsOne(1, 2, 3) → true
     * twoIsOne(3, 1, 2) → true
     * twoIsOne(3, 2, 2) → false
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean twoIsOne(int a, int b, int c) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 14.Given three int values, a b c, return true if b is greater than a, and c is greater than b.
     * However, with the exception that if "bOk" is true, b does not need to be greater than a.
     *
     * Example Results:
     * areInOrder(1, 2, 4, false) → true
     * areInOrder(1, 2, 1, false) → false
     * areInOrder(1, 1, 2, true) → true
     *
     * @param a
     * @param b
     * @param c
     * @param bOk
     * @return
     */
    public static boolean areInOrder(int a, int b, int c, boolean bOk) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     *
     * 15.Given three int values, a b c, return true if they are in strict increasing order,
     * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true,
     * equality is allowed, such as 5 5 7 or 5 5 5.
     *
     * Example Results:
     * inOrderEqual(2, 5, 11, false) → true
     * inOrderEqual(5, 7, 6, false) → false
     * inOrderEqual(5, 5, 7, true) → true
     *
     * @param a
     * @param b
     * @param c
     * @param equalOk
     * @return
     */
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 16.Given three int values, a b c, return true if two or more of them have the same rightmost digit.
     * The int values are non-negative.
     *
     * Example Results:
     * lastDigit(23, 19, 13) → true
     * lastDigit(23, 19, 12) → false
     * lastDigit(23, 19, 3) → true
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean lastDigit(int a, int b, int c) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }

    /**
     * Please replace the code in following method according to following details.
     * 
     * 17.Return the sum of two 6-sided dice rolls, each in the range 1..6.
     * However, if noDoubles is true, if the two dice show the same value, increment one die to the next value,
     * wrapping around to 1 if its value was 6.
     *
     * Example Results:
     * rollDice(2, 3, true) → 5
     * rollDice(3, 3, true) → 7
     * rollDice(3, 3, false) → 6
     *
     * @param die1
     * @param die2
     * @param noDoubles
     * @return
     */
    public static int rollDice(int die1, int die2, boolean noDoubles) {
        throw new UnsupportedOperationException("Code not yet written...!");
    }
}
