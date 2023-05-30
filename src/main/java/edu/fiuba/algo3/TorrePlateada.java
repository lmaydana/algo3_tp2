package edu.fiuba.algo3;

public class TorrePlateada {

    int costo = 20;
    int tiempoDeConstruccion = 2;

    public boolean atacar() {
        if (this.tiempoDeConstruccion > 0) {
            this.tiempoDeConstruccion--;
            return false;
        }
        return true;
    }
}
