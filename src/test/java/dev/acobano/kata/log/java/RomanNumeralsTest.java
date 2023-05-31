package dev.acobano.kata.log.java;

import dev.acobano.kata.log.java.romannumerals.*;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de testing de la kata 'Roman Numerals'.
 * @author Álvaro Cobano
 */
public class RomanNumeralsTest 
{
    @Test
    public void romanNumeralsOutputTest()
    {
        assertAll(
            () -> assertEquals("I", RomanNumerals.convert(1)),
            () -> assertEquals("II", RomanNumerals.convert(2)),
            () -> assertEquals("III", RomanNumerals.convert(3)),
            () -> assertEquals("IV", RomanNumerals.convert(4)),
            () -> assertEquals("V", RomanNumerals.convert(5)),
            () -> assertEquals("VI", RomanNumerals.convert(6)),
            () -> assertEquals("VII", RomanNumerals.convert(7)),
            () -> assertEquals("VIII", RomanNumerals.convert(8)),
            () -> assertEquals("IX", RomanNumerals.convert(9)),
            () -> assertEquals("X", RomanNumerals.convert(10)),
            () -> assertEquals("XI", RomanNumerals.convert(11)),
            () -> assertEquals("XII", RomanNumerals.convert(12)),
            () -> assertEquals("XIII", RomanNumerals.convert(13)),
            () -> assertEquals("XIV", RomanNumerals.convert(14)),
            () -> assertEquals("XV", RomanNumerals.convert(15)),
            () -> assertEquals("XVI", RomanNumerals.convert(16)),
            () -> assertEquals("XVII", RomanNumerals.convert(17)),
            () -> assertEquals("XVIII", RomanNumerals.convert(18)),
            () -> assertEquals("XIX", RomanNumerals.convert(19)),
            () -> assertEquals("XX", RomanNumerals.convert(20)),
            () -> assertEquals("XXX", RomanNumerals.convert(30)),
            () -> assertEquals("XL", RomanNumerals.convert(40)),
            () -> assertEquals("L", RomanNumerals.convert(50)),
            () -> assertEquals("LX", RomanNumerals.convert(60)),
            () -> assertEquals("LXX", RomanNumerals.convert(70)),
            () -> assertEquals("LXXX", RomanNumerals.convert(80)),
            () -> assertEquals("XC", RomanNumerals.convert(90)),
            () -> assertEquals("C", RomanNumerals.convert(100)),
            () -> assertEquals("CC", RomanNumerals.convert(200)),
            () -> assertEquals("CCC", RomanNumerals.convert(300)),
            () -> assertEquals("CD", RomanNumerals.convert(400)),
            () -> assertEquals("D", RomanNumerals.convert(500)),
            () -> assertEquals("DC", RomanNumerals.convert(600)),
            () -> assertEquals("DCLXVI", RomanNumerals.convert(666)),
            () -> assertEquals("M", RomanNumerals.convert(1000)),
            () -> assertEquals("MMMCMXCIX", RomanNumerals.convert(3999))
        );
    }
    
    @Test
    public void inputExceptionTest()
    {
        Throwable ioe1 = assertThrows(IOException.class, () -> RomanNumerals.convert(0));
        assertEquals("Solamente se acepta un entero entre 1 y 3999 como parámetro de entrada.", ioe1.getMessage());
        
        Throwable ioe2 = assertThrows(IOException.class, () -> RomanNumerals.convert(4000));
        assertEquals("Solamente se acepta un entero entre 1 y 3999 como parámetro de entrada.", ioe2.getMessage());
    }
}
