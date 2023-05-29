package dev.acobano.kata.log.java.bowling;

/**
 * Clase Java que simula una partida al juego de bolos, donde hay 10 turnos con
 * 2 tiros por cada para intentar tirar los 10 bolos dispuestos en el suelo.
 * @author Álvaro Cobano
 */
public class Game implements BowlingInterface
{
    //ATRIBUTOS:
    private Frame[] frames;
    private int frameCount;
    private int rollCount;
    
    //CONSTRUCTOR:
    public Game()
    {
        this.frames = new Frame[FRAME_NUMBER];
        this.frameCount = 0;
        this.rollCount = 0;
        
        for (int i=0; i<=FRAME_NUMBER; i++)
            if (i == FRAME_NUMBER - 1)
                this.frames[i] = new Frame(true);
            else
                this.frames[i] = new Frame(false);
    }
    
    //MÉTODOS:
    public void roll(int pinsDown)
    {
        //CONTROL DE USUARIO PARA INDICAR EL FINAL DEL JUEGO:
        if (this.frameCount == FRAME_NUMBER) {
            System.err.println("No se pueden introducir más datos, el juego ha terminado.");
        } else {
            
            //CONTROL DE ENTRADA DE DATOS:
            if (this.rollCount == 0 || this.rollCount == 2 || this.frames[FRAME_NUMBER].isStrike())
                if (pinsDown >= 0 && pinsDown <= TOTAL_PINS)
                    this.frames[this.frameCount].roll(rollCount, pinsDown);
                else
                    System.err.println("Debe insertar un valor numérico comprendido entre 0 y " + TOTAL_PINS);
            
            else
                if (pinsDown >= 0 && pinsDown <= TOTAL_PINS - this.frames[frameCount].getRoll(0))
                    this.frames[this.frameCount].roll(rollCount, pinsDown);
                else
                    System.err.println("Debe insertar un valor numérico comprendido entre 0 y " + 
                                       (TOTAL_PINS - this.frames[frameCount].getRoll(0)));
            
            //EJECUCIÓN DE LA ACCIÓN DEL JUEGO:
            //Actualizamos el contador de tiros:
            this.rollCount++;
                
            //DEPENDIENDO DE LO AVANZADO QUE ESTÉ EL JUEGO SE DARÁN LOS SIGUIENTES CASOS:
            //CASO 1: Nos encontramos en el décimo turno:
            if (this.frameCount == FRAME_NUMBER - 1)
                //CASO 1.1: Hemos consumido el total de turnos. El juego se ha acabado.
                if (this.rollCount > 2)
                    this.frameCount = FRAME_NUMBER;
                    
                //CASO 1.2: Todavía nos quedan tiros:
                //El tercer tiro depende si en este turno ha hecho strike o spare.
                else if (this.rollCount == 2)
                    if (!(this.frames[FRAME_NUMBER - 1].isStrike() ||
                        this.frames[FRAME_NUMBER - 1].isSpare())) 
                        this.frameCount = FRAME_NUMBER;
                
            //CASO 2: Nos encontramos en cualquier anterior turno:
            else
                //CASO 2.1: En caso de haber llegado al límite de tiros,
                //se pasa al siguiente turno:
                //CASO 2.2: Se ha hecho un strike. Se pasa al siguiente turno:
                if (this.rollCount > 1 || this.frames[this.frameCount].isStrike())
                {
                    this.frameCount++;
                    this.rollCount = 0;
                }
        }       
    }
    
    public int score()
    {
        int puntuacion = 0;
        /*
        for (int i=0; i<=FRAME_NUMBER; i++)
            if (i != FRAME_NUMBER -1)
                if (this.frames[i].isStrike())
                    puntuacion += STRIKE_POINTS;
                else if (this.frames[i].isSpare())
                    puntuacion += SPARE_POINTS;
                else
                    puntuacion += this.frames[i].getRoll(0) + this.frames[i].getRoll(1);
            else
                if (this.frames[i].isStrike())
                    if (this.frames[i].getRoll(1) == 10)
                        if(this.frames[i].getRoll(2) == 10)
                            puntuacion += (STRIKE_POINTS * 3);
                        else
                            puntuacion += (STRIKE_POINTS * 2) +
                                           this.frames[i].getRoll(2);
                    else
                        if(this.frames[i].getRoll(1) +
                           this.frames[i].getRoll(2) == 10)
                            puntuacion += STRIKE_POINTS + SPARE_POINTS;
                        else
                            puntuacion += STRIKE_POINTS + 
                                          this.frames[i].getRoll(1) +
                                          this.frames[i].getRoll(2);
                else
                    if (this.frames[i].isSpare())
                        puntuacion += SPARE_POINTS +
                                      this.frames[i].getRoll(2);
                    else
                        puntuacion += this.frames[i].getRoll(0) + 
                                      this.frames[i].getRoll(1);*/
            
        return puntuacion;
    }
}