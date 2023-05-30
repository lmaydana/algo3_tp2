package edu.fiuba.algo3;

public abstract class Enemigo {

    //private Pasarela posicionActual;
    private int velocidad;
    private int danioBase;
    private int energia;

    public abstract int otorgarCredito();

    public abstract void atacarA(Jugador jugador);

    public abstract void avanzar();

    public abstract void recibirDanio( int danioRecibido );

}
