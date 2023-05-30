package edu.fiuba.algo3.entrega_1;
import edu.fiuba.algo3.TorreBlanca;
import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.Jugador;
import edu.fiuba.algo3.Defensa;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;

public class JugadorTest {

    @Test
    public void JugadorEmpiezaConLaVidaYCreditosCorrespondientes() {

        Jugador jugador = new Jugador("Juan");

        assertEquals(20, jugador.vida());
        assertEquals(100, jugador.creditos());
    }

    @Test
    public void JugadorTieneCreditosParaConstruirUnaDefensa() {

        Jugador jugador = new Jugador("Juan");

        Defensa torreBlanca = jugador.construirTorreBlanca();

        assertNotEquals(null, torreBlanca);
    }
}
