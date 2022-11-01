package junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest_1 {

    public  int expected = 10;

    public int sum(int a, int b){
        return a + b;
    }

    @Test
    public void testSum(){
        Assertions.assertEquals(expected, sum(5,5));
    }
}
