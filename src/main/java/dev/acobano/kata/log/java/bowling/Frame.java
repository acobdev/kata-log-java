package dev.acobano.kata.log.java.bowling;

/**
 * Clase Java que implementa cada uno de los 10 turnos de los que está compuesta
 * la partida de bolos, en el que se guardará el número de bolos derribado en cada
 * uno de los tiros usados en ésta.
 * @author Álvaro Cobano
 */
public class Frame implements BowlingInterface
{
    //ATRIBUTOS:
    private int[] rolls;
    
    //CONSTRUCTOR:
    public Frame (boolean isLastFrame)
    {
        if (isLastFrame)
            this.rolls = new int[ROLL_NUMBER + 1];
        else
            this.rolls = new int[ROLL_NUMBER];
        
        for (int i=0; i<=this.rolls.length; i++)
            this.rolls[i] = 0;
    }
    
    //MÉTODOS:
    public void roll(int roll, int pinsDown)
    {
        this.rolls[roll] = pinsDown;
    }
    
    public int getRoll(int roll)
    {
        return this.rolls[roll];
    }
    
    public boolean isStrike()
    {
        return this.rolls[0] == TOTAL_PINS;
    }
    
    public boolean isSpare()
    {
        return this.rolls[0] + this.rolls[1] == TOTAL_PINS;
    }
}