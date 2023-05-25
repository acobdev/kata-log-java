package dev.acobano.kata.log.java;

import dev.acobano.kata.log.java.christmaslights.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de testing de la kata 'Christmas Lights'.
 * @author Álvaro Cobano
 */
public class ChristmasLightsTest 
{
    
    //MÉTODOS DE TESTEO:
    @Test
    public void inicializarGridTest()
    {
        Grid g = new Grid();
        
        assertAll(
            () -> assertFalse(g.getLight(0, 0).isOn()),
            () -> assertFalse(g.getLight(999, 0).isOn()),
            () -> assertFalse(g.getLight(0, 999).isOn()),
            () -> assertFalse(g.getLight(999, 999).isOn())
        );
    }
    
    @Test
    public void turnOnEveryLightTest()
    {
        Grid g = new Grid();
        g.turnOn(new CoordinatePair(0, 0), new CoordinatePair(999, 999));
        
        assertAll(
            () -> assertTrue(g.getLight(0, 0).isOn()),
            () -> assertTrue(g.getLight(999, 0).isOn()),
            () -> assertTrue(g.getLight(0, 999).isOn()),
            () -> assertTrue(g.getLight(999, 999).isOn())
        );
    }
    
    @Test
    public void toggleFirstLineTest()
    {
        Grid g = new Grid();
        g.toggle(new CoordinatePair(0, 0), new CoordinatePair(999, 0));
        
        assertAll(
            () -> assertTrue(g.getLight(0,  0).isOn()),
            () -> assertTrue(g.getLight(1,  0).isOn()),
            () -> assertTrue(g.getLight(999,  0).isOn()),
            () -> assertFalse(g.getLight(0,  1).isOn()),
            () -> assertFalse(g.getLight(999,  1).isOn()),
            () -> assertEquals(1000, g.getNumberLightsAreOn())
        );
    }
    
    @Test
    public void turnOffMiddleFourLightsTest()
    {
        Grid g = new Grid();
        g.turnOn(new CoordinatePair(0, 0), new CoordinatePair(999, 999));
        g.turnOff(new CoordinatePair(499, 499), new CoordinatePair(500, 500));
        
        assertAll(
            () -> assertFalse(g.getLight(499,  499).isOn()),
            () -> assertFalse(g.getLight(499,  500).isOn()),
            () -> assertFalse(g.getLight(500,  499).isOn()),
            () -> assertFalse(g.getLight(500,  500).isOn()),
            () -> assertTrue(g.getLight(498,  499).isOn()),
            () -> assertTrue(g.getLight(498,  500).isOn()),
            () -> assertTrue(g.getLight(499,  501).isOn()),
            () -> assertTrue(g.getLight(500,  501).isOn()),
            () -> assertTrue(g.getLight(501,  500).isOn()),
            () -> assertTrue(g.getLight(501,  499).isOn()),
            () -> assertTrue(g.getLight(500, 498).isOn()),
            () -> assertTrue(g.getLight(499, 498).isOn()),
            () -> assertEquals(999996, g.getNumberLightsAreOn())
        );
    }
    
    @Test
    public void instructionsTest()
    {
        Grid g = new Grid();
        g.turnOn(new CoordinatePair(887, 9), new CoordinatePair(959, 629));
        g.turnOn(new CoordinatePair(454,  398), new CoordinatePair(844,  448));
        g.turnOff(new CoordinatePair(539,  243), new CoordinatePair(559,  965));
        g.turnOff(new CoordinatePair(370,  819), new CoordinatePair(676,  868));
        g.turnOff(new CoordinatePair(145,  40), new CoordinatePair(370,  997));
        g.turnOff(new CoordinatePair(301,  3), new CoordinatePair(808,  453));
        g.turnOn(new CoordinatePair(351,  678), new CoordinatePair(951,  908));
        g.toggle(new CoordinatePair(720,  196), new CoordinatePair(897,  994));
        g.toggle(new CoordinatePair(831, 394), new CoordinatePair(904, 860));
        
        assertEquals(230022, g.getNumberLightsAreOn());
    }
}