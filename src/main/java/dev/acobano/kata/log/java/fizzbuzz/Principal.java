package dev.acobano.kata.log.java.fizzbuzz;

/**
 * Clase Java con el método 'main' para poder implementar el 'FizzBuzz'.
 * @author Álvaro Cobano
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        FizzBuzz fb = new FizzBuzz();
        
        for (int i=1; i<=100; i++)
            System.out.println(fb.fizzBuzz(i));
    }
}