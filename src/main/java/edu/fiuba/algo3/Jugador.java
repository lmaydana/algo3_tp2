package edu.fiuba.algo3;

public class Jugador {

    private int creditos;
    private int vida;
    private String nombre;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.creditos = 100;
        this.vida = 20;
    }

    public void construir( Defensa defensa ){
        this.creditos -= defensa.costo();
    }

    public void recibirDanio( int danio ){//Si vida es 0 crear finalizarJuego()
        this.vida -= danio;
    }

}
