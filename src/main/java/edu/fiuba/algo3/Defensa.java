package edu.fiuba.algo3;

public abstract class Defensa {
    int costo;

    public abstract boolean atacar();

    public boolean puedoComprar(int creditos) {
        return creditos >= this.costo;
    }
}
