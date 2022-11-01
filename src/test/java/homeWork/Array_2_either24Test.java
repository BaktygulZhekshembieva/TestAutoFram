package homeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Array_2_either24Test {

    Array_2_either24 chek = new Array_2_either24();

    int[] arr1 = {1,2,2}; //true
    int[] arr2 = {4,4,1}; //true
    int[] arr3 = {4,4,1,2,2}; //false
    int[] arr4 = {1,2,3,4,}; // false
    int[] arr5 = {3,5,6}; //false

    @Test
    void testTwoOrFourCase1(){
        Assertions.assertTrue(chek.either24(arr1));
    }

    @Test
    void testTwoOrFourCase2(){
        Assertions.assertTrue(chek.either24(arr2));
    }

    @Test
    void testTwoOrFourCase3(){
        Assertions.assertFalse(chek.either24(arr3));
    }

    @Test
    void testTwoOrFourCase4(){
        Assertions.assertFalse(chek.either24(arr4));
    }

    @Test
    void testTwoOrFourCase5(){
        Assertions.assertFalse(chek.either24(arr5));
    }


}
