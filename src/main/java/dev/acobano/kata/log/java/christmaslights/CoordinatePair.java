package dev.acobano.kata.log.java.christmaslights;

/**
 * Clase que representa el par coordinado conformado en la matriz de luces.
 * @author Álvaro Cobano
 */
public class CoordinatePair 
{
    
    //ATRIBUTOS:
    private int x;
    private int y;
    
    
    //CONSTRUCTOR:
    public CoordinatePair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    
    //MÉTODOS 'GETTERS':
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    //MÉTODOS 'SETTERS':
    public void setX(int nuevoX)
    {
        this.x = nuevoX;
    }
    
    public void setY(int nuevoY)
    {
        this.y = nuevoY;
    }
}