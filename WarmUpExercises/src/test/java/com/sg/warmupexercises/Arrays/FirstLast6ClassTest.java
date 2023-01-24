package com.sg.warmupexercises.Arrays;

import static com.sg.warmupexercises.Arrays.FirstLast6Class.firstLast6;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author nkaur
 */
public class FirstLast6ClassTest {
    
    public FirstLast6ClassTest() {
    }
       
    /**
     * Test of FirstLast6 method, of class FirstLast6Class.
     */
    @Test
    public void testtLast6() {
        //FirstLast6({1, 2, 6}) -> true
        int[] numbers={1, 2, 6};
        assertTrue(firstLast6(numbers),"The result should be true as last digit is 6");
    }
    
    @Test
    public void testFirst6() {
        //FirstLast6({6, 1, 2, 3}) -> true
        int[] numbers={6, 1, 2, 3};
        assertTrue(firstLast6(numbers),"The result should be true as first digit is 6");
    }
    
    @Test
    public void testNot6FirstLast() {
        //FirstLast6({13, 6, 1, 2, 3}) -> false
        int[] numbers={13, 6, 1, 2, 3};
        assertFalse(firstLast6(numbers),"The result should be false as none of the first and last digit is 6");
    }
}