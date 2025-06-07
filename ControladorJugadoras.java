package Controlador;

import Model.Jugadora;
import java.util.HashMap;
import Model.Fecha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    /*Construye la lista y los equipos, muy importante para pasar la informacion
    del main al constructor*/
    public ControladorJugadoras(HashMap mapa, ArrayList lista) {
        this.equipos = mapa;
        this.listaJu = lista;
    }
    
    //Getters

    public ArrayList getListaJugadoras() {
        return listaJu;
    }
    public HashMap<String, Integer> getEquipos() {
        return equipos;
    }
    
    //Setters
    public void agregarJugadoraALaLista() {
        this.listaJu.add(this.jugadora);
        agregarAEquipos(this.jugadora);
    }//poner un try catch para saber si el equipo ya tiene 7 jugadoras
    
    public void setEquipos(HashMap<String, Integer> equipos) {
        this.equipos = equipos;
    }
    public Jugadora getJugadora() {
        return this.jugadora;
    }
    public void setJugadora(Jugadora ju) {
        this.jugadora = ju;
    }
    
    //Metodos 
    
    //Hace una lista temporal de las jugadoras con el mismo nombre
    public List<Jugadora> busqueda_Nombre(String nombre) {
        List <Jugadora> listaTemp = new ArrayList<>();
        for(Jugadora ju : listaJu) {
            if (ju.getNombre().equals(nombre)){
                listaTemp.add(ju);
            }
        }
        return listaTemp;
    } 
    
    //Aumenta el numero de jugadoras de un equipo
    public void agregarAEquipos(Jugadora ju) {
        String equipo = ju.getClub();
        if(this.equipos.containsKey(equipo)){
            this.equipos.put(equipo, this.equipos.get(equipo) + 1);
        }//poner un try catch para verificar cantidad de jugadoras en equipo
    }

    //Elimina una jugadora de la lista, por codigo
    public int eliminarJugadora(String dni) {
        for(int i = 0; i < listaJu.size(); i++) {
            Jugadora ju = listaJu.get(i);
            String codigoJu = ju.getDni();
            if (codigoJu.equals(dni)){
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
    //Hace una lista con las jugadoras segun un equipo pasado por parametro
    public List<Jugadora> mostrarEquipo(String club) {
        List<Jugadora> lis = new ArrayList<>();
        for(Jugadora ju : this.listaJu){
            if(ju.getClub().equals(club)){
                lis.add(ju);
            }
        }
        return lis;
    }
    //Devuelve una jugadora de una lista pasada por parametro y su posicion
    public void guardarJugadora(List<Jugadora> lista, int i){
        this.jugadora = lista.get(i);
    }
    
    //Setters de jugadora
    public void setJugadoraNombre(String nombre) {
        this.jugadora.setNombre(nombre);
    }
    public void setJugadoraApellido(String apellido) {
        this.jugadora.setApellido(apellido);
    }
    public void setJugadoraNacimiento(int dia, int mes, int anio) {
        this.jugadora.setNacimiento(dia, mes, anio);
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
    public void setJugadoraDni(String dni) {
        this.jugadora.setDni(dni);
    }
    //Getters de Jugadora
    public String getNombreJugadora() {
        return this.jugadora.getNombre();
    }
    public String getApellidoJugadora() {
        return this.jugadora.getApellido();
    }
    public Fecha getNacimientoJugadora() {
        return this.jugadora.getNacimiento();
    }
    public String getNacionalidadJugadora() {
        return this.jugadora.getNacionalidad();
    }
    public String getCodigoJugadora() {
        return this.jugadora.getDni();
    }
    public String getPosicionJugadora() {
        return this.jugadora.getPosicion();
    }
    public String getClubJugadora() {
        return this.jugadora.getClub();
    }
    public int getGolesJugadora() {
        return this.jugadora.getGoles();
    }
    public int getAmarillasJugadora() {
        return this.jugadora.getT_Amarillas();
    }
    public int getRojasJugadora() {
        return this.jugadora.getT_Rojas();
    }
}
