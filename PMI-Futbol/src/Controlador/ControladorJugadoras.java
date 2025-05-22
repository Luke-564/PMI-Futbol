
package Controlador;

import Model.Jugadora;
import java.util.HashMap;
import Model.Fecha;
import java.util.ArrayList;
import java.util.Collections;

public class ControladorJugadoras {
    
    //Variables de instancia
    
    private Jugadora jugadora = new Jugadora ();
    private ArrayList <Jugadora> listaJu; 
    private HashMap<String, Integer> equipos;
    
    //Constructores
    
    //Vacio
    public ControladorJugadoras() {
        this.equipos = new HashMap<>();
        this.listaJu = new ArrayList<>();
    }
    //solo guarda una jugadora, no se si este lo lleguemos a usar
    public ControladorJugadoras(Jugadora juga) {
        this.equipos = new HashMap<>();
        this.listaJu = new ArrayList<>();
        this.jugadora = juga;
    }
    /*Construye la lista y los equipos, muy importante para pasar la informacion
    del main al constructor*/
    public ControladorJugadoras(HashMap mapa, ArrayList lista) {
        this.equipos = mapa;
        this.listaJu = lista;
    }
    
    //Getters
    
    public Jugadora getJuga() {
        return jugadora;
    }
    public ArrayList getListaJu() {
        return listaJu;
    }
    public HashMap<String, Integer> getEquipos() {
        return equipos;
    }
    
    //Setters

    public void setJugadora(Jugadora jugadora) {
        this.jugadora = jugadora;
    }
    public void setListaJu(ArrayList lista) {
        this.listaJu = lista;
    }
    public void setEquipos(HashMap<String, Integer> equipos) {
        this.equipos = equipos;
    }    
    public void setJugadoraNombre(String nombre) {
        this.jugadora.setNombre(nombre);
    }
    public void setJugadoraApellido(String apellido) {
        this.jugadora.setApellido(apellido);
    }
    public void setJugadoraNacimiento(Fecha nacimiento) {
        this.jugadora.setNacimiento(nacimiento);
    }
    public void setJugadoraNacionalidad(String nacionalidad) {
        this.jugadora.setNacionalidad(nacionalidad);
    }
    public void setJugadoraPosicion(String posicion) {
        this.jugadora.setPosicion(posicion);
    }
    public void setJugadoraClub(String club) {
        this.jugadora.setClub(club);
    }
    public void setJugadoraGoles(int goles) {
        this.jugadora.setGoles(goles);
    }
    public void setJugadoraT_Amarillas(int amarillas) {
        this.jugadora.setT_Amarillas(amarillas);
    }
    public void setJugadoraT_Rojas(int rojas) {
        this.jugadora.setT_Rojas(rojas);
    }
    public void setJugadoraCodigoAutomatico() {
        this.jugadora.setCodigo(0);//hacer algo para que sea automatico
    }
    
    //Metodos 
    
    //Hace una lista temporal de las jugadoras con el mismo nombre
    public ArrayList getJugadorasDeLaLista(String nombre) {
        ArrayList <Jugadora> listaTemp = new ArrayList<>();
        for(int i = 0; i < listaJu.size(); i++) {
            Jugadora ju = listaJu.get(i);
            String nombreJu = ju.getNombre();
            if (nombre.equalsIgnoreCase(nombreJu)){
                listaTemp.add(ju);
            }
        }
        //Poner un try catch en caso de no encontrar a la jugadora
        return listaTemp;
    } 
    //devuelve una jugadora de la lista de jugadoras, la busca por el codigo
    public Jugadora getJugadoraDeLaListaCodigo(int codigo) {
        for(int i = 0; i < listaJu.size(); i++) {
            Jugadora ju = listaJu.get(i);
            int cod = ju.getCodigo();
            if (cod == codigo){
                return listaJu.get(i);
            }
        }
        Jugadora jus = null; //Poner un try catch en caso de no encontrar a la jugadora
        return jus;
    } 
    
    //Agrega una jugadora a la lista 
    public void setListaJu(Jugadora ju) {
        this.listaJu.add(ju);
        setEquipos(ju);
    }//poner un try catch para saber si el equipo ya tiene 7 jugadoras
    
    //Aumenta el numero de jugadoras de un equipo
    public void setEquipos(Jugadora ju) {
        String equipo = ju.getClub();
        if(this.equipos.containsKey(equipo)){
            this.equipos.put(equipo, this.equipos.get(equipo) + 1);
        }//poner un try catch para verificar cantidad de jugadoras en equipo
    }

    //Elimina una jugadora de la lista, por codigo
    public int eliminarJugadora(int codigo) {
        for(int i = 0; i < listaJu.size(); i++) {
            Jugadora ju = listaJu.get(i);
            int codigoJu = ju.getCodigo();
            if (codigoJu == codigo){
                //si la encuentra, tambien eliminarla del equipo
                String equipo = ju.getClub();
                eliminarDeEquipo(equipo);
                this.listaJu.remove(i);
                return i;
            }
        }
        return 0;//poner un try cath por si esta funcion retorna 0
    }
    
    //Devuelve la cantidad de jugadoras de un equipo, equipo pasado por parametro
    public int cantidadJugadorasPorEquipo(String equipo) {
        int i = equipos.get(equipo);
        return i;//poner try catch por las dudas
    }
    
    //elimina de equipo
    public int eliminarDeEquipo(String club) {
        int i = this.equipos.get(club);
        i--;
        this.equipos.put(club, i);
        return 0; //poner un try catch por si el equipo tiene menos de 5 jugadoras
    }
    
    //devuelve una lista con las jugadoras que superen cierta cantidad de goles
    public ArrayList cantGoles(int cant) {
        ArrayList <Jugadora> listAux = new ArrayList <>();
        for (int i = 0; i < listaJu.size(); i++) {
            Jugadora jugAux = listaJu.get(i);
            int goles = jugAux.getGoles();
            if (cant <= goles){
                listAux.add(jugAux);
            }
        }
        return listAux;
    }//poner try catch por si no existe jugadoras  
    
    //devuelve una lista con las jugadoras que mas expulsiones tuvieron
    public ArrayList masExpulsiones () {
        Collections.sort(this.listaJu);
        ArrayList <Jugadora> lisAux = new ArrayList <>();
        Jugadora jugAux = this.listaJu.get(0);
        lisAux.add(jugAux);
        int t_R_aux = jugAux.getT_Rojas();
        for (int i = 1; i < listaJu.size(); i++){
            Jugadora jugAux2 = listaJu.get(i);
            int t_R_aux2 = jugAux2.getT_Rojas();
            if (t_R_aux == t_R_aux2){
                lisAux.add(jugAux2);
            }
        }
        return lisAux;
    }//pondria un try catch, pero no se donde
    
    //Devuelve cuantas jugadoras de cierta posicion
    public int jugadorasDePosicion(String posicion) {
        int cuantas = 0;
        for (Jugadora juAux : listaJu) {
            String posAux = juAux.getPosicion();
            if (posicion.equals(posAux)) {
                cuantas ++;
            }
        }
        return cuantas;
    }
}
