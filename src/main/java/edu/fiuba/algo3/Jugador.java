package edu.fiuba.algo3;

import java.util.HashMap;
import edu.fiuba.algo3.TorrePlateada;
import edu.fiuba.algo3.TorreBlanca;


public class Jugador {

    private int creditos;
    private int vida;
    private String nombre;

    private HashMap <String, Defensa> defensas;
/*
    defensas = {
            'torreBlanca' : TorreBlanca,
            'torreBlanca' : TorreBlanca
    }
    new  defensas['torreBlanca'] ();
*/

    public Jugador(String nombre){
        this.nombre = nombre;
        this.creditos = 100;
        this.vida = 20;
    }

    public int vida() {
        return this.vida;
    }

    public int creditos() {
        return this.creditos;
    }

/*
    public void construir( Defensa defensa ){
        this.creditos -= defensa.costo();
    }
*/

    public void recibirDanio( int danio ){//Si vida es 0 crear finalizarJuego()
        this.vida -= danio;
    }

    public Defensa construirTorreBlanca() {
        TorreBlanca nuevaTorre = new TorreBlanca();
        if (nuevaTorre.puedoComprar(this.creditos)) {
            return nuevaTorre;
        }
        return null;
    }
/*
    private Defensa construirDefensa( String defensa ) {
        HashMap<String, Defensa> defensas;
        defensas = new HashMap<String, Defensa>();
        defensas.put("torreBlanca", TorreBlanca);
        defensas.put("torrePlateada", TorrePlateada);

        Defensa nuevaDefensa = new defensas.get(defensa);

        if ( defensas.get(defensa)() )

        return defensas.get(defensa)( this.creditos );
    }
*/

}
