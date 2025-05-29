
package pmi.futbol;

import java.util.ArrayList; 
import Model.Jugadora;
import Model.Arbitro;
import Controlador.ControladorArbitros;
import Controlador.ControladorJugadoras;
import Controlador.ControladorArchivo;

import java.util.HashMap;

public class PMIFutbol {
    public static void main(String[] args) {
        //Creacion de variables 
        Jugadora jugadora = new Jugadora();
        Arbitro arbitro = new Arbitro();
        ArrayList<Jugadora> listaJ = new ArrayList<>(); 
        ArrayList <Arbitro> listaAr = new ArrayList <>();
        ArrayList <Arbitro> listaTempAr = new ArrayList <>();
        HashMap<String, Integer> equipos = new HashMap<>();
        //Asignacion de variables a los controladores
        ControladorArbitros contListAr = new ControladorArbitros(arbitro, listaAr, listaTempAr); 
        ControladorJugadoras contListJu = new ControladorJugadoras(equipos, listaJ);
        
        
    }
    
}