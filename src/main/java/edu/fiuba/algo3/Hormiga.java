package edu.fiuba.algo3;

public class Hormiga extends Enemigo{

    //private Pasarela posicionActual;
    private int velocidad;
    private int danioBase;
    private int energia;
    public Hormiga(){
        this.velocidad = 1;
        this.danioBase = 1;
        this.energia = 1;
    }
    public int otorgarCredito() {
        return 1;
    }//Ver quien otorga los creditos

    public void atacarA(Jugador jugador){
        jugador.recibirDanio(this.danioBase);
    }

    public void recibirDanio( int danioRecibido ){
        this.energia -= danioRecibido;
    }

    public void avanzar(){
        //this.posicionActual = this.posicionActual.avanzar(this.velocidad);
    }
}
