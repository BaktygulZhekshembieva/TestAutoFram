package junit5;

import org.junit.jupiter.api.*;

public class JunitDemo_2 {

    @BeforeAll
    public static void beforeClass(){
        System.out.println("This is before all annotation");
    }

    @BeforeEach
    public void beforeEachAnnotation(){
        System.out.println("This is before each annotation");
    }

    @AfterEach
    public void afterEachAnnotation(){
        System.out.println("This is after each annotation");
    }

    @AfterAll
    public static void afterAllAnnotation(){
        System.out.println("This is after all annotation");
    }

    @Test
    public void test1(){
        Assertions.assertTrue(true);
        System.out.println("This is test 1");
    }

    @Test
    public void test2(){
        Assertions.assertTrue(true);
        System.out.println("This is test 2");
    }

    @Test
    public void test3(){
        Assertions.assertTrue(true);
        System.out.println("This is test 3");
    }

    @Test
    public void test4(){
        Assertions.assertTrue(true);
        System.out.println("This is test 4");
    }
}
