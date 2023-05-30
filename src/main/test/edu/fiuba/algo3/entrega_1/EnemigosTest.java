package edu.fiuba.algo3.entrega_1;


import edu.fiuba.algo3.Arania;
import edu.fiuba.algo3.Hormiga;
import edu.fiuba.algo3.TorreBlanca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EnemigosTest {


    @Test
    public void LasUnidadesDaniadasRecibenElAtaqueIndicado(){

        Hormiga hormiga = new Hormiga();
        Arania arania = new Arania();

        hormiga.recibirDanio(1);
        arania.recibirDanio(1);

        assertEquals(hormiga.verEnergia(), 0);
        assertEquals(arania.verEnergia(), 1);
    }

    @Test
    public void AlMatarUnEnemigoElJugadorRecibeLosCreditosIndicados(){

        Hormiga hormiga = new Hormiga();
        Arania arania = new Arania();


        //seguir

    }






}
