
package Controller;

import Model.Jugadora;
import java.util.HashMap;

public class ControladorJugadoras {
    
    //Variables de instancia
    
    private Jugadora jugadora = new Jugadora ();
    private Jugadora [] listaJu; 
    private HashMap<String, Integer> equipos;
    
    //Constructores
    
    //Vacio
    public ControladorJugadoras() {
        this.equipos = new HashMap<>();
        this.listaJu = new Jugadora [70];
    }
    //solo guarda una jugadora, no se si este lo lleguemos a usar
    public ControladorJugadoras(Jugadora juga) {
        this.equipos = new HashMap<>();
        this.listaJu = new Jugadora [70];
        this.jugadora = juga;
    }
    /*Construye la lista y los equipos, muy importante para pasar la informacion
    del main al constructor*/
    public ControladorJugadoras(HashMap mapa, Jugadora[] lista) {
        this.equipos = mapa;
        this.listaJu = lista;
    }
    
    //Getters
    public Jugadora getJuga() {
        return jugadora;
    }
    public Jugadora[] getListaJu() {
        return listaJu;
    }
    public HashMap<String, Integer> getEquipos() {
        return equipos;
    }
    
    //Setters
    //No me construye los setters automaticamente :C
    //fue, los hago solita
    public void setJugadora(Jugadora jugadora) {
        this.jugadora = jugadora;
    }
    public void setListaJu(Jugadora[] lista) {
        this.listaJu = lista;
    }
    public void setEquipos(HashMap<String, Integer> equipos) {
        this.equipos = equipos;
    }
    
    //Metodos 
    
    //devuelve una jugadora de la lista de jugadoras, la busca por el nombre
    public Jugadora getJugadoraDeLaLista(String nombre) {
        for(int i = 0; i < listaJu.length; i++) {
            Jugadora ju = listaJu[i];
            String nombreJu = ju.getNombre();
            if (nombre.equalsIgnoreCase(nombreJu)){
                return listaJu[i];
            }
        }//Poner un try catch en caso de no encontrar a la jugadora
    } 
    
    //Agrega una jugadora a la lista 
    public void setListaJu(Jugadora ju) {
        int i = this.listaJu.length;
        this.listaJu[i + 1] = ju;
    }
    
    //Aumenta el numero de jugadoras de un equipo
    public void setEquipos(Jugadora ju) {
        String equipo = ju.getClub();
        if(this.equipos.containsKey(equipo)){
            this.equipos.put(equipo, this.equipos.get(equipo) + 1);
        }//poner un try catch para verificar cantidad de jugadoras en equipo
    }

    //Elimina una jugadora de la lista, por nombre de jugadora
    public void eliminarJugadora(String nombre) {
        for(int i = 0; i < listaJu.length; i++) {
            Jugadora ju = listaJu[i];
            String nombreJu = ju.getNombre();
            if (nombre.equalsIgnoreCase(nombreJu)){
                this.listaJu[i] = null;
            }
        }
    }
    
    //metodo para el arreglo de Jugadoras
    public void moverLista(int i) {
        for (i < listaJu.length; i++) {
            
        }
    }   
    
    public int cantidadJugadoras() {
        
        
        return 0;
    }
}
