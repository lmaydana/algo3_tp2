package edu.fiuba.algo3.entrega_1;
import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.Jugador;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JugadorTest {

    @Test
    public void JuadorEmpiezaConLaVidaYCreditosCorrespondientes() {

        Jugador jugador = new Jugador("Juan");

        assertEquals(20, jugador.vida());
        assertEquals(100, jugador.creditos());
    }

    /*
    @Test
    public void JuadorEmpiezaConLaVidaYCreditosCorrespondientes() {

        Jugador jugador = new Jugador("Juan");

        assertEquals(20, jugador.vida());
        assertEquals(100, jugador.creditos());
    }
    */
}
