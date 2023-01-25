package com.sg.warmupexercises;

import static com.sg.warmupexercises.ArrayExercises.commonEnd;
import static com.sg.warmupexercises.ArrayExercises.firstLast6;
import static com.sg.warmupexercises.ArrayExercises.makePi;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author nkaur
 */
public class ArrayExercisesTest {
    
    public ArrayExercisesTest() {
    }
    /**
     * Test of FirstLast6 method.
     */
    
    @Test
    public void testFirstLast6() {
        //firstLast6({1, 2, 6}) -> true
        int[] array1={1, 2, 6};
        assertTrue(firstLast6(array1),"The result should be true when last digit is 6");
        
        //firstLast6({6, 1, 2, 3}) -> true
        int[] array2={6, 1, 2, 3};
        assertTrue(firstLast6(array2),"The result should be true when first digit is 6");
        
        //firstLast6({13, 6, 1, 2, 3}) -> false
        int[] array3={13, 6, 1, 2, 3};
        assertFalse(firstLast6(array3),"The result should be false when none of the  first and last digit is 6");
    }  
    
    /**
     * Test of SameFirstLast method
     */
    @Test
    public void testSameFirstLast() {
        //sameFirstLast({1, 2, 3}) -> false
        int[] array1 = {1, 2, 3};
        assertFalse(sameFirstLast(array1), "It should return false when the first and last number is not equal in array");
        
        //sameFirstLast({1, 2, 3, 1}) -> true
        int[] array2 = {1, 2, 3, 1};
        assertTrue(sameFirstLast(array2), "It should return true when the first and last number is equal in array");

        //sameFirstLast({1, 2, 1}) -> true
        int[] array3 = {1, 2, 1};
        assertTrue(sameFirstLast(array3), "It should return true when the first and last number is equal in array");
    }
    
    @Test
    public void testMakePi()
    {
     //makePi(3) -> {3, 1, 4}
     int[] expectedResult1={3, 1, 4};
     assertEquals(expectedResult1, makePi(3),"passing 3 should return {3,1,4}");
     
     //makePi(1) -> {3}
     int[] expectedResult2={3};
     assertEquals(expectedResult2, makePi(1),"passing 1 should return {3}");
     
     //makePi(5) -> {3, 1, 4,1,5}
     int[] expectedResult3={3, 1, 4,1,5};
     assertEquals(expectedResult3, makePi(5),"passing 5 should return {3, 1, 4,1,5}");
    }
    
     /**
     * Test of commonEnd method
     */
    @Test
    public void testCommonEnd() {
      //commonEnd({1, 2, 3}, {7, 3}) -> true
      int[] array1={1, 2, 3};
      int[] array2={7, 3};      
      assertTrue(commonEnd(array1,array2),"Both arrays have common ending");
      
      //commonEnd({1, 2, 3}, {1, 3}) -> true
      int[] array3={1, 2, 3};
      int[] array4={1, 3};      
      assertTrue(commonEnd(array3,array4),"Both arrays have common ending");
      
      //commonEnd({1, 2, 3}, {7, 3, 2}) -> false  
      int[] array5={1, 2, 3};
      int[] array6={7, 3, 2};      
      assertFalse(commonEnd(array5,array6),"Both arrays does not have common ending");        
    }

    private boolean sameFirstLast(int[] array1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
