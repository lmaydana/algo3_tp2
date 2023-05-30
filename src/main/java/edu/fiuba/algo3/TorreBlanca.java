package edu.fiuba.algo3;

public class TorreBlanca {

    int costo = 10;
    int tiempoDeConstruccion = 1;

    public boolean atacar() {
        if (this.tiempoDeConstruccion > 0) {
            this.tiempoDeConstruccion--;
            return false;
        }
        return true;
    }
}
