package Controlador;

import Model.Jugadora;
import java.util.HashMap;
import Model.Fecha; //este es solo necesario si mi duda es verdad

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
    
    /*Okey, estos setters son en caso de que mi duda sea cierta, mi duda es: la
    profe dijo en una clase que era medio al pedo ir mandando, desde la vista 
    hacia el controlador, string por string (los datos de la jugadora, uno por
    uno), que seria mas facil mandar directamente una jugadora ya cargada. Pero,
    en una clase tambien nos dijo que no habia que darle el acceso del modelo a
    la vista. Así que estos setters van a ser solo en caso que no haya que darle
    acceso del modelo a la vista
    */
                /*
    public void setDatosJugadora(String nombre, String apellido, Fecha nacimiento,
            String nacionalidad, String posicion, String club, int goles,
            int amarillas, int rojas) {
        this.jugadora.setNombre(nombre);
        this.jugadora.setApellido(apellido);
        this.jugadora.setNacimiento(nacimiento);
        this.jugadora.setNacionalidad(nacionalidad);
        this.jugadora.setPosicion(posicion);
        this.jugadora.setClub(club);
        this.jugadora.setGoles(goles);
        this.jugadora.setT_Amarillas(amarillas);
        this.jugadora.setT_Rojas(rojas);      
    }
                */
    
    //Metodos 
    
    //devuelve una jugadora de la lista de jugadoras, la busca por el nombre
    public Jugadora getJugadoraDeLaLista(String nombre) {
        for(int i = 0; i < listaJu.length; i++) {
            Jugadora ju = listaJu[i];
            String nombreJu = ju.getNombre();
            if (nombre.equalsIgnoreCase(nombreJu)){
                return listaJu[i];
            }
        }
        Jugadora jus = null; //Poner un try catch en caso de no encontrar a la jugadora
        return jus;
    } 
    
    //Agrega una jugadora a la lista 
    public void setListaJu(Jugadora ju) {
        int i = this.listaJu.length;
        this.listaJu[i + 1] = ju;
    }//poner un try catch en caso de que el arreglo este en 70
    
    //Aumenta el numero de jugadoras de un equipo
    public void setEquipos(Jugadora ju) {
        String equipo = ju.getClub();
        if(this.equipos.containsKey(equipo)){
            this.equipos.put(equipo, this.equipos.get(equipo) + 1);
        }//poner un try catch para verificar cantidad de jugadoras en equipo
    }

    //Elimina una jugadora de la lista, por nombre de jugadora
    public int eliminarJugadora(String nombre) {
        for(int i = 0; i < listaJu.length; i++) {
            Jugadora ju = listaJu[i];
            String nombreJu = ju.getNombre();
            if (nombre.equalsIgnoreCase(nombreJu)){
                //si la encuentra, tambien eliminarla del equipo
                this.listaJu[i] = null;
                return i;
            }
        }
        return 0;//poner un try cath por si esta funcion retorna 0
    }
    
    //metodo para mover el arreglo de Jugadoras en caso de eliminar una jugadora
    public void moverLista(int i) {
        for ( int j = i; j < listaJu.length; j++) {
            Jugadora juAux = listaJu[j+1];
            listaJu[j] = juAux;
        }    
    }
    
    //Devuelve la cantidad de jugadoras de un equipo, equipo pasado por parametro
    public int cantidadJugadorasPorEquipo(String equipo) {
        int i = equipos.get(equipo);
        return i;
    }
    
}
