package com.sg.warmupexercises.Arrays;

import static com.sg.warmupexercises.Arrays.FirstLast6Class.firstLast6;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals(true,firstLast6(numbers));
    }
    
    @Test
    public void testFirst6() {
        //FirstLast6({6, 1, 2, 3}) -> true
        int[] numbers={6, 1, 2, 3};
        assertEquals(true,firstLast6(numbers));
    }
    
    @Test
    public void testNot6FirstLast() {
        //FirstLast6({13, 6, 1, 2, 3}) -> false
        int[] numbers={13, 6, 1, 2, 3};
        assertEquals(true,firstLast6(numbers));
    }
}