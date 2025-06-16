package Controlador;

// Paquetes necesarios
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import Model.Jugadora;
import Model.Arbitro;

public class ControladorArchivo {
    
    File aj = new File("PMI-FutbolJugadoras.txt");
    File aa = new File("PMI-FutbolArbitros.txt");
    
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
    
public ArrayList<Jugadora> incioMemoriaJugadoras(){ //Metodo que inicializa la lista de Jugadoras
      ArrayList<Jugadora> lista = new ArrayList<>();//Variables auxiliares
      String reng; //string renglon axiliar
      try {
        if (aj.createNewFile()) { //varifia que exista el archivo, y si no, lo crea
            System.out.println("Archivo creado.");
        } else {
            System.out.println("Archivo existente.");
        }
      }
      catch(IOException e){
          e.printStackTrace();
      }
    
    try(BufferedReader br = new BufferedReader(new FileReader(aj))) { //creo un buffer para leer renglones
      while((reng=br.readLine())!=null){//mientras renglon sea distinto de nulo
        String[] atr=reng.split(","); // atr: Atrivutos jejejejojojojujuju
        if(atr.length==12){ 
            Jugadora jaux = new Jugadora();
            jaux.setNombre(atr[0]);
            jaux.setApellido(atr[1]);
            jaux.setNacimiento(Integer.parseInt(atr[2].trim()),Integer.parseInt(atr[3].trim()),Integer.parseInt(atr[4].trim()));
            jaux.setDni(atr[5]);
            jaux.setNacionalidad(atr[6]);           /*hasta acá, el set de Persona*/
            jaux.setPosicion(atr[7]);
            jaux.setClub(atr[8]);
            jaux.setGoles(Integer.parseInt(atr[9].trim()));
            jaux.setT_Amarillas(Integer.parseInt(atr[10].trim()));
            jaux.setT_Rojas(Integer.parseInt(atr[11].trim()));
            lista.add(jaux);
        }
      }
      br.close(); //Cuando el bloque de Try termina, el archivo se cierra solo, pero creo que no está de más
    } catch (IOException e) {
        e.printStackTrace();
    }
    return lista;
}

public ArrayList<Arbitro> inicioMemoriaArbitros(){
    ArrayList<Arbitro> lista = new ArrayList<>(); // variables aux
    String reng;
    try {
        if (aa.createNewFile()) {
            System.out.println("Archivo creado.");
        } else {
            System.out.println("Archivo existente.");
        }
      }
      catch(IOException e){
          e.printStackTrace();
      }
    
    try(BufferedReader br = new BufferedReader(new FileReader(aa))){
    while((reng=br.readLine())!=null){
        String[] atr=reng.split(","); // atr: Atrivutos jejejejojojojujuju
        if(atr.length==9){
            Arbitro Aaux=new Arbitro();
            Aaux.setNombre(atr[0]);//nombre
            Aaux.setApellido(atr[1]);//apellido
            Aaux.setNacimiento(Integer.parseInt(atr[2].trim()),Integer.parseInt(atr[3].trim()),Integer.parseInt(atr[4].trim())); //¿Como se vamos a guardar nacimiento? creo que deberiamos cambiar el toString para que guarde como dia,mes,año
            Aaux.setDni(atr[5]);                              /*hasta acá lo de persona*/
            Aaux.setNacionalidad(atr[6]);
            Aaux.setTarjetas(Integer.parseInt(atr[7].trim()));
            if(atr[8].equals("true")){
                Aaux.setInternacional(true);
            }
            else if(atr[8].equals("false")){
                Aaux.setInternacional(false);
            }
            lista.add(Aaux);
        }
    }
    br.close(); //Cuando el bloque de Try termina, el archivo se cierra solo, pero creo que no está de más
}
catch(IOException e){
    e.printStackTrace();
}
    return lista;
}

public void guardarJuEnArchivo(ArrayList<Jugadora> ju){ // metodo para guardar los datos. Borra el contenido del 
try (BufferedWriter bw = new BufferedWriter(new FileWriter(aj))){ //archivo existente y lo remplaza con la data
    for (Jugadora p : ju) {                             // del  Arreglo 
                bw.write(p.toString());
                bw.newLine(); // salto de línea
            }
}    
catch(IOException e){
    e.printStackTrace();
}
}

public void guardarArbEnArchivo(ArrayList<Arbitro> arr){// metodo para guardar los datos. Borra el contenido del
try (BufferedWriter bw = new BufferedWriter(new FileWriter(aa))){ //archivo existente y lo remplaza con la data
    for (Arbitro p : arr) {                             // del  Arreglo 
                bw.write(p.toString());
                bw.newLine(); // salto de línea
            }
}

catch(IOException e){
    e.printStackTrace();
}
}
}