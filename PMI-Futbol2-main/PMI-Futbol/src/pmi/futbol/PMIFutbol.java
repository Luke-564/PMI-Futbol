
package pmi.futbol;

import Controlador.ControladorArbitros;
import Controlador.ControladorArchivo;
import java.util.ArrayList; 
import Model.Jugadora;
import Model.Arbitro;
import java.util.HashMap;
import Controlador.ControladorJugadoras;
import Vista.VentanaPrincipal;

public class PMIFutbol {
    public static void main(String[] args) {
        ArrayList <Jugadora> listaJu = new ArrayList<>();
        ArrayList <Arbitro> listaAr = new ArrayList <>();
        ControladorArbitros contrlArb = new ControladorArbitros(listaAr);
        ControladorArchivo contArc = new ControladorArchivo();
        listaJu = contArc.incioMemoriaJugadoras();
        System.out.println(listaJu);
        listaAr=contArc.inicioMemoriaArbitros();
        System.out.println(listaAr);
        contArc.guardarJuEnArchivo(listaJu);
        System.out.println(listaJu);
        HashMap<String, Integer> equipos = new HashMap<>();
        equipos.put("Boca",0);
        equipos.put("River",0);
        equipos.put("Racing",0);
        equipos.put("Independiente",0);
        equipos.put("Tigre",0);
        equipos.put("Juventud",0);
        equipos.put("Estudiantes",0);
        equipos.put("Platense",0);
        equipos.put("Banfield",0);
        equipos.put("Lanus",0);
        ControladorJugadoras controladorJu = new ControladorJugadoras(equipos, listaJu);
        controladorJu.setEquipos();
        VentanaPrincipal vista = new VentanaPrincipal();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        System.out.println(listaJu);
    }
    
}