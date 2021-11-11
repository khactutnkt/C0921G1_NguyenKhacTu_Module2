package ss8_clean_code_and_refactoring.thuc_hanh.refactoring_tach_bien;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizz3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizz6() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testBuzz5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testBuzz10() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz30() {
        int number = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
//    @Test
//    void testFizz3(){
//        int number = 3;
//        String expected = "Fizz";
//
//        String result = FizzBuzz.fizzBuzz(number);
//        assert Equals(expected, result);
//    }
//    @Test
//    void testFizz6(){
//        int number = 6;
//        String expected = "Fizz";
//
//        String result = FizzBuzz.fizzBuzz(number);
//        assert Equals(expected, result);
//    }
//
//    @Test
//    void testFizz5(){
//        int number = 5;
//        String expected = "Fizz";
//
//        String result = FizzBuzz.fizzBuzz(number);
//        assert Equals(expected, result);
//    }
//    @Test
//    void testFizz10(){
//        int number = 10;
//        String expected = "Fizz";
//
//        String result = FizzBuzz.fizzBuzz(number);
//        assert Equals(expected, result);
//    }
//
//    @Test
//    void testFizz15(){
//        int number = 15;
//        String expected = "Fizz";
//
//        String result = FizzBuzz.fizzBuzz(number);
//        assert Equals(expected, result);
//    }
//    @Test
//    void testFizz30(){
//        int number = 30;
//        String expected = "Fizz";
//
//        String result = FizzBuzz.fizzBuzz(number);
//        assert Equals(expected, result);
//    }
}
