package Controlador;

import Model.Fecha;
import java.io.BufferedReader;
import java.io.FileReader;
import Model.Jugadora;
import Model.Arbitro;
import java.io.File;
import java.io.IOException;
import Controlador.ControladorJugadoras;

public class ControladorArchivo {
    
    File aj = new File("\\PMI-Futbol\\PMI-FutbolJugadoras.txt");
    File aa = new File("\\PMI-Futbol\\PMI-FutbolArbitros.txt");

    public void setAj(File aj) {
        this.aj = aj;
    }

    public void setAa(File aa) {
        this.aa = aa;
    }

    public File getAj() {
        return aj;
    }

    public File getAa() {
        return aa;
    }
    

    public ControladorArchivo() {
    }

    
    

public void incioMemoriaJugadoras(){ //Metodo que inicializa la lista de Jugadoras
    try(BufferedReader br = new BufferedReader(new FileReader(aj))) { //creo un buffer para leer renglones
      if (aj.createNewFile()) {                                       
        System.out.println("creado.");// verifico que esté creado el archivo y si no, lo crea
      } else {
        System.out.println("existente.");
      }
      String reng; //string renglon axiliar 
      Jugadora jaux = new Jugadora();
      while((reng=br.readLine())!=null){
        String[] atr=reng.split(","); // atr: Atrivutos jejejejojojojujuju
        if(atr.length==10){
            jaux.setNombre(atr[0]);//nombre
            jaux.setApellido(atr[1]);//apellido
            //jaux.setNacimiento(atr[2]); ¿Como se vamos a guardar nacimiento? creo que deberiamos cambiar el toString para que guarde como dia,mes,año
            jaux.setNacionalidad(atr[3]);           /*hay que chusmear bien las posiciones*/
            jaux.setPosicion(atr[4]);
            jaux.setClub(atr[5]);
            jaux.setGoles(Integer.parseInt(atr[6]));
            jaux.setT_Amarillas(Integer.parseInt(atr[7]));//se explica solo
            jaux.setT_Rojas(Integer.parseInt(atr[8]));
            jaux.setCodigo(Integer.parseInt(atr[9]));  
        }
      }
    } catch (IOException e) {
      System.out.println("Error en archivo de Jugadora");
    }
}
public void inicioMemoriaArbitros(){
try(BufferedReader br = new BufferedReader(new FileReader(aa))){
    if(aa.createNewFile()){
        System.out.println("Creado");
    }
    else{
        System.out.println("Existente");
    }
    String reng;
    Arbitro Aaux=new Arbitro();
    while((reng=br.readLine())!=null){
        String[] atr=reng.split(","); // atr: Atrivutos jejejejojojojujuju
        if(atr.length==7){
            Aaux.setNombre(atr[0]);//nombre
            Aaux.setApellido(atr[1]);//apellido
            //Aaux.setNacimiento(atr[2]); ¿Como se vamos a guardar nacimiento? creo que deberiamos cambiar el toString para que guarde como dia,mes,año
            Aaux.setNacionalidad(atr[3]);
            Aaux.setCodigo(Integer.parseInt(atr[4]));  
            Aaux.setTarjetas(Integer.parseInt(atr[5]));
            Aaux.setInternacional(Integer.parseInt(atr[6]));
        }
    }
}
catch(IOException e){}
}

public void inicioDeMemoria(){}

}


    
    


    
    


