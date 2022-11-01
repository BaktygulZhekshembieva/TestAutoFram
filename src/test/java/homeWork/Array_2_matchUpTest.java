package homeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Array_2_matchUpTest {

    Array_2_matchUp matchUp = new Array_2_matchUp();

    int[] a1 = {1, 2, 3};
    int[] a2 = {2, 3, 10};
    int expecteda = 2;

    int[] b1 = {1, 2, 3};
    int[] b2 = {2, 3, 5};
    int expectedb = 3;


    @Test
    public void matchUpTest1(){
        Assertions.assertEquals(expecteda,matchUp.matchUp(a1,a2));
    }

    @Test
    public void matchUpTest2(){
        Assertions.assertEquals(expectedb,matchUp.matchUp(b1,b2));
    }
}
