package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import Model.Jugadora;
import Model.Arbitro;
import java.io.File;
import java.io.IOException;

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
        if(atr.length==11){
            jaux.setNombre(atr[0]);
            jaux.setApellido(atr[1]);
            jaux.setNacimiento(Integer.parseInt(atr[2]),Integer.parseInt(atr[3]),Integer.parseInt(atr[4]));
            //jaux.setDni(atr[5]);
            jaux.setNacionalidad(atr[6]);           /*hasta acá, el set de Persona*/
            jaux.setPosicion(atr[7]);
            jaux.setClub(atr[8]);
            jaux.setGoles(Integer.parseInt(atr[9]));
            jaux.setT_Amarillas(Integer.parseInt(atr[10]));
            jaux.setT_Rojas(Integer.parseInt(atr[11]));  
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
        if(atr.length==8){
            Aaux.setNombre(atr[0]);//nombre
            Aaux.setApellido(atr[1]);//apellido
            Aaux.setNacimiento(Integer.parseInt(atr[2]),Integer.parseInt(atr[3]),Integer.parseInt(atr[4])); //¿Como se vamos a guardar nacimiento? creo que deberiamos cambiar el toString para que guarde como dia,mes,año
            //ACA VA SETDNI                              /*hasta acá lo de persona*/
            Aaux.setNacionalidad(atr[6]);
            Aaux.setTarjetas(Integer.parseInt(atr[7]));
            if(atr[8].equals("true")){
                Aaux.setInternacional(true);
            }
            else if(atr[8].equals("false")){
                Aaux.setInternacional(false);
            }
        }
    }
}
catch(IOException e){}
}

public void inicioDeMemoria(){}

}


    
    


    
    


