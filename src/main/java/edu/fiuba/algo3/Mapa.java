package edu.fiuba.algo3;
import edu.fiuba.algo3.Parcela;

import java.util.ArrayList;
import java.util.List;


public class Mapa {
    //private List<List<Parcela>> parcelas = new ArrayList<>();
    private Parcela parcelas[][];

    public Mapa(int ancho, int alto) {
        this.crearMapaConTierra(ancho, alto);
    }
/*    private void crearMapa(int ancho, int alto) {
        for ( int i=0; i<ancho; i++ ) {
            for ( int j=0; j<alto; j++ ) {
                this.parcelas[i][j] = new Parcela();
            }
        }
    }*/
    private void crearMapaConTierra(int ancho, int alto) {
        for ( int i=0; i<ancho; i++ ) {
            for ( int j=0; j<alto; j++ ) {
                this.parcelas[i][j] = new Tierra();
            }
        }
    }

    private boolean parcelaConstruible(int x, int y) {
        return parcelas[x][y].seleccionarParcela();
    }
}
