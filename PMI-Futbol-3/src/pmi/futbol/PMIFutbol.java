
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
        ControladorArchivo contArc = new ControladorArchivo();
        listaJu = contArc.incioMemoriaJugadoras();
        System.out.println(listaJu);
        listaAr=contArc.inicioMemoriaArbitros();
        
        ControladorArbitros contrlArb = new ControladorArbitros(listaAr);
        System.out.println(listaAr);
        System.out.println(listaJu);
        HashMap<String, Integer> equipos = new HashMap<>();
        equipos.put("BOCA",0);
        equipos.put("RIVER",0);
        equipos.put("RACING",0);
        equipos.put("INDEPENDIENTE",0);
        equipos.put("TIGRE",0);
        equipos.put("JUVENTUD",0);
        equipos.put("ESTUDIANTES",0);
        equipos.put("PLATENSE",0);
        equipos.put("BANFIELD",0);
        equipos.put("LANUS",0);
        ControladorJugadoras controladorJu = new ControladorJugadoras(equipos, listaJu);
        controladorJu.setEquipos();
        VentanaPrincipal vista = new VentanaPrincipal();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        System.out.println(listaJu);
    }
    
}