package dev.acobano.kata.log.java.fizzbuzz;

/**
 * Clase Java con una función que devuelve una cadena de texto con los valores
 * 'Fizz', 'Buzz' y 'FizzBuzz' dependiendo si el número introducido como parámetro
 * de entrada es o no múltiplo de 3 y/o de 5. En caso contrario, devuelve el
 * número pasado como parámetro.
 * @author Álvaro Cobano
 */
public class FizzBuzz 
{
    //CONSTRUCTOR:
    public FizzBuzz() {}
    
    //MÉTODO DE USO:
    public String fizzBuzz(int number)
    {
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return String.valueOf(number);
    }
}