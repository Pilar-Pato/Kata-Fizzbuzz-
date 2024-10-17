package org.factoriaf5.katafizzbuz;

public class Katafizzbuz {

    public static String fizzBuzz(int number) {
    
    String resultado;      

     if (number % 3 == 0 && number % 5 == 0) {
    
    resultado = "FizzBuzz";
    
    } else if (number % 3 == 0) {
    
    resultado = "Fizz";
    
    } else if (number % 5 == 0) {
    
    resultado = "Buzz";

    } else {
    
    resultado = String.valueOf(number);
    
    }
    
    return resultado; 
    
 }

 public class KataFizzBuzzContiene {

    public static String fizzBuzzcontiene(int number) {
        boolean divisiblePor3 = number % 3 == 0;
        boolean contiene3 = String.valueOf(number).contains("3");
        boolean divisiblePor5 = number % 5 == 0;
        boolean contiene5 = String.valueOf(number).contains("5");

        if (divisiblePor3 || contiene3) {
            if (divisiblePor5 || contiene5) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (divisiblePor5 || contiene5) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
 }