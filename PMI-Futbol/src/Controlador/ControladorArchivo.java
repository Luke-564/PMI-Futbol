package Controlador;

import Controlador.ControladorJugadoras;
import Controlador.ControladorArbitros;
import java.io.File;
import java.io.IOException;

public class ControladorArchivo {
    File AJugadoras = new File ("\\PMI-Futbol\\PMI-FutbolJugadoras.txt");
    try{
    if(AJugadoras.createNewFile("\\PMI-Futbol\\PMI-FutbolJugadoras.txt")){
    System.out.println("creado");
}
    else{
    System.out.println("nooo la po");
}
    
    }
    catch(IOException e){
    System.out.println("nooo");
    e.printStackTrace();
    }
}
