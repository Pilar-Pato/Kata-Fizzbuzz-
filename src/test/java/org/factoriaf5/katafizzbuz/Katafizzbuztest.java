package org.factoriaf5.katafizzbuz;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.factoriaf5.katafizzbuz.Katafizzbuz.KataFizzBuzzContiene;
import org.junit.jupiter.api.Test;


public class Katafizzbuztest {

    @Test
    public void testFizzBuzzPor3Y5() {
        String resultado = Katafizzbuz.fizzBuzz(15);
        assertEquals("FizzBuzz", resultado);
    }

    @Test
    public void testFizzBuzzPor3() {
        String resultado = Katafizzbuz.fizzBuzz(3);
        assertEquals("Fizz", resultado);  

    }
    @Test
    public void testFizzBuzzPor5() {
        String resultado = Katafizzbuz.fizzBuzz(5);
        assertEquals("Buzz", resultado);
    }
 

    @Test
    public void testFizzBuzzNo() {
        String resultado = Katafizzbuz.fizzBuzz(7);
        assertEquals("7", resultado);
    }

    @Test
    public void testFizzBuzzNegativo() {
    String resultado = Katafizzbuz.fizzBuzz(-3);
    assertEquals("Fizz", resultado);
}

   
    @Test
    public void TestFizzBuzzContieneY3() {
        String resultado = KataFizzBuzzContiene.fizzBuzzcontiene(533);
        assertEquals("FizzBuzz", resultado);
    }

    @Test
    public void testFizzBuzzContiene3() {
        String resultado = KataFizzBuzzContiene.fizzBuzzcontiene(53);
        assertEquals("FizzBuzz", resultado);
    }

    @Test
    public void testFizzBuzzContiene5() {
        String resultado = KataFizzBuzzContiene.fizzBuzzcontiene(5);
        assertEquals("Buzz", resultado);
    }

    @Test
    public void testFizzBuzzContiene5tb() {
        String resultado = KataFizzBuzzContiene.fizzBuzzcontiene(25);
        assertEquals("Buzz", resultado);
    }

    @Test
    public void testfFizzBuzzContieneo5() {
        String resultado = KataFizzBuzzContiene.fizzBuzzcontiene(15);
        assertEquals("FizzBuzz", resultado);
    }

    @Test
    public void testFizzBuzzContieneLos2() {
        String resultado = KataFizzBuzzContiene.fizzBuzzcontiene(35);
        assertEquals("FizzBuzz", resultado);
    }

    @Test
    public void testFizzBuzzContieneNo() {
        String resultado = KataFizzBuzzContiene.fizzBuzzcontiene(7);
        assertEquals("7", resultado);
    }
}



