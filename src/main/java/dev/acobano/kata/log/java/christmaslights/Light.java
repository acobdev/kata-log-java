package dev.acobano.kata.log.java.christmaslights;

/**
 * Clase Java que representa las luces que podremos en la parrilla.
 * @author Álvaro Cobano
 */
public class Light 
{
    
    //ATRIBUTOS:
    private CoordinatePair pair;
    private boolean status;
    
    
    //CONSTRUCTOR:
    public Light(int x, int y)
    {
        this.pair = new CoordinatePair(x, y);
        this.status = false;
    }
    
    
    //MÉTODOS 'GETTERS':
    public int getX()
    {
        return this.pair.getX();
    }
    
    public int getY()
    {
        return this.pair.getY();
    }
    
    public boolean isOn()
    {
        return this.status;
    }
    
    
    //MÉTODOS 'SETTERS':
    public void turnOn()
    {
        this.status = true;
    }
    
    public void turnOff()
    {
        this.status = false;
    }
    
    public void toggle()
    {
        this.status = !this.status;
    }
}