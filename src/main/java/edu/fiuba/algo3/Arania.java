package edu.fiuba.algo3;

public class Arania extends Enemigo{

    private Pasarela posicionActual;
    private int velocidad;
    private int danioBase;
    private int energia;
    public Arania(){
        this.velocidad = 2;
        this.danioBase = 2;
        this.energia = 2;
    }
    public int otorgarCredito() {
        return (int)Math.floor(Math.random()*11);
    }

    public void atacarA(Jugador jugador){
        jugador.recibirDanio(this.danioBase);
    }

    public void recibirDanio( int danioRecibido ){
        this.energia -= danioRecibido;
    }

    public void avanzar(){
        this.posicionActual = this.posicionActual.avanzar(this.velocidad);
    }
}