package edu.fiuba.algo3.entrega_1;
import edu.fiuba.algo3.TorreBlanca;
import edu.fiuba.algo3.TorrePlateada;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefensaTest {

    @Test
    public void TorreBlancaSeConstruyeYAtacaEnElTiempoDebido(){
        // DefensaEnConstruccion defensa = new DefensaEnConstruccion();
        TorreBlanca torreBlanca = new TorreBlanca();
        int turnosEnConstruccion = 0;

        while ( ! torreBlanca.atacar() ) {
            turnosEnConstruccion++ ;
        }

        /*
        DefensaConstruida defensaConstruida = null;
        while (defensaConstruida != null) {
            defensa_ = defensa.construir();
        }*/

        assertEquals(1, turnosEnConstruccion);
    }

    @Test
    public void TorrePlateadaSeConstruyeYAtacaEnElTiempoDebido(){
        // DefensaEnConstruccion defensa = new DefensaEnConstruccion();

        TorrePlateada torrePlateada = new TorrePlateada();
        int turnosEnConstruccion = 0;

        // torrePlateada.atacar() devuelve false mientras no pueda atacar (está en construcción)

        while ( ! torrePlateada.atacar() ) {
            turnosEnConstruccion++ ;
        }

        /*
        DefensaConstruida defensaConstruida = null;
        while (!defensaConstruida) {
            defensa_ = defensa.construir();
        }*/


        assertEquals(2, turnosEnConstruccion);
    }
}
