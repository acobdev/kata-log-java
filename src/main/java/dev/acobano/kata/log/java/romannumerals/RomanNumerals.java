package dev.acobano.kata.log.java.romannumerals;

import java.io.IOException;

/**
 * Clase Java con un método estático que convierte en numerales romanos el entero
 * entre 1 y 3999 que reciba como parámetro de entrada.
 * @author Álvaro Cobano
 */
public class RomanNumerals 
{
    public static String convert(int number) throws IOException
    {
        if (number <= 0 || number > 3999)
            throw new IOException("Solamente se acepta un entero entre 1 y 3999 como parámetro de entrada.");
        else
        {
            //Declaración de las variables que representan cada cifra del número:
            int udMillar = number / 1000;
            int centenas = number / 100 % 10;
            int decenas = number / 10 % 10;
            int unidades = number % 10;
            String romano = "";
            
            //Unidades de millar:
            for (int i=1; i<=udMillar; i++)
                romano += "M";
            
            //Centenas:
            if (centenas == 9)
                romano += "CM";
            else if (centenas >= 5)
            {
                romano += "D";
                
                for (int i=6; i<=centenas; i++)
                    romano += "C";
            }
            else if (centenas == 4)
                romano += "CD";
            else
                for (int i=1; i<=centenas; i++)
                    romano += "C";
            
            //Decenas:
            if (decenas == 9)
                romano += "XC";
            else if (decenas >= 5)
            {
                romano += "L";
                
                for (int i=6; i<=decenas; i++)
                    romano += "X";
            }
            else if (decenas == 4)
                romano += "XL";
            else
                for (int i=1; i<=decenas; i++)
                    romano += "X";
            
            //Unidades:
            if (unidades == 9)
                romano += "IX";
            else if (unidades >= 5)
            {
                romano += "V";
                
                for (int i=6; i<=unidades; i++)
                    romano += "I";
            }
            else if (unidades == 4)
                romano += "IV";
            else
                for (int i=1; i<=unidades; i++)
                    romano += "I";
            
            return romano;
        }
    }
}