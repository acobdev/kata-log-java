package dev.acobano.kata.log.java.christmaslights;

/**
 * Clase Java que representa la parrilla de luces de Navidad.
 * @author Álvaro Cobano
 */
public class Grid 
{
    //CONSTANTES:
    private static final int GRID_SIZE = 1000;  
    
    //ATRIBUTOS:
    private Light[][] grid;
    
    
    //CONSTRUCTOR:
    public Grid()
    {
        this.grid = new Light [GRID_SIZE][GRID_SIZE];
        
        for(int i=0; i<GRID_SIZE; i++)
            for (int j=0; j<GRID_SIZE; j++)
                this.grid[i][j] = new Light(i, j);
    }
    
    
    //MÉTODOS 'GETTERS':
    public Light getLight(int x, int y)
    {
        return this.grid[x][y];
    }
    
    public int getNumberLightsAreOn()
    {
        int contador = 0;
        
        for(int i=0; i<GRID_SIZE; i++)
            for (int j=0; j<GRID_SIZE; j++)
                if (this.getLight(i, j).isOn())
                    contador++;
        
        return contador;
    }
    
    
    //MÉTODOS DE USO:
    public void turnOn(CoordinatePair input, CoordinatePair output)
    {
        if (input.getX() < output.getX())
            if (input.getY() < output.getY())
                for (int i=input.getX(); i<=output.getX(); i++)
                    for (int j=input.getY(); j<=output.getY(); j++)
                        this.getLight(i, j).turnOn();
            else
                for (int i=input.getX(); i<=output.getX(); i++)
                    for (int j=input.getY(); j>=output.getY(); j--)
                        this.getLight(i, j).turnOn();
        else
            if (input.getY() < output.getY())
                for (int i=input.getX(); i>=output.getX(); i--)
                    for (int j=input.getY(); j<=output.getY(); j++)
                        this.getLight(i, j).turnOn();
            else
                for (int i=input.getX(); i>=output.getX(); i--)
                    for (int j=input.getY(); j>=output.getY(); j--)
                        this.getLight(i, j).turnOn();
    }
    
    public void turnOff(CoordinatePair input, CoordinatePair output)
    {
        if (input.getX() < output.getX())
            if (input.getY() < output.getY())
                for (int i=input.getX(); i<=output.getX(); i++)
                    for (int j=input.getY(); j<=output.getY(); j++)
                        this.getLight(i, j).turnOff();
            else
                for (int i=input.getX(); i<=output.getX(); i++)
                    for (int j=input.getY(); j>=output.getY(); j--)
                        this.getLight(i, j).turnOff();
        else
            if (input.getY() < output.getY())
                for (int i=input.getX(); i>=output.getX(); i--)
                    for (int j=input.getY(); j<=output.getY(); j++)
                        this.getLight(i, j).turnOff();
            else
                for (int i=input.getX(); i>=output.getX(); i--)
                    for (int j=input.getY(); j>=output.getY(); j--)
                        this.getLight(i, j).turnOff();
    }
    
    public void toggle(CoordinatePair input, CoordinatePair output)
    {
        if (input.getX() < output.getX())
            if (input.getY() < output.getY())
                for (int i=input.getX(); i<=output.getX(); i++)
                    for (int j=input.getY(); j<=output.getY(); j++)
                        this.getLight(i, j).toggle();
            else
                for (int i=input.getX(); i<=output.getX(); i++)
                    for (int j=input.getY(); j>=output.getY(); j--)
                        this.getLight(i, j).toggle();
        else
            if (input.getY() < output.getY())
                for (int i=input.getX(); i>=output.getX(); i--)
                    for (int j=input.getY(); j<=output.getY(); j++)
                        this.getLight(i, j).toggle();
            else
                for (int i=input.getX(); i>=output.getX(); i--)
                    for (int j=input.getY(); j>=output.getY(); j--)
                        this.getLight(i, j).toggle();
    }
}