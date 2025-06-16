
package Controlador;

import Model.Jugadora;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ControladorJugadoras {
    
    //Variables de instancia
    
    private Jugadora jugadora = new Jugadora ();
    private static ArrayList <Jugadora> listaJu = new ArrayList<>(); 
    private static HashMap<String, Integer> equipos = new HashMap<>();
    
    //Constructores
    
    //Vacio
    public ControladorJugadoras() {    
    }
    //Con la lista y el hashmap desde el main
    public ControladorJugadoras(HashMap mapa, ArrayList lista) {
        ControladorJugadoras.equipos = mapa;
        ControladorJugadoras.listaJu = lista;
    }
    
    //Getters

    public ArrayList getListaJugadoras() {
        return listaJu;
    }
    public HashMap<String, Integer> getEquipos() {
        return equipos;
    }
    
    //Setters
    
    //Agrega una jugadora a la lista
    public void agregarJugadoraALaLista() {
        //Intenta agregar la jugadora 
        try{
            //si falla al agregar a equipos lanza exception
            agregarAEquipos(this.jugadora);
            //Agrega la jugadora a la lista
            ControladorJugadoras.listaJu.add(this.jugadora);
        }
        catch(Exception e){
            throw new RuntimeException("No se pudo agregar la jugadora");
        }
    }
    
    //Este metodo es solo para usar en el main al principio una vez que se pasa
    //la lista desde archivo
    public void setEquipos() {
        //Recorre la lista de jugadoras
        for (int i = 0; i < ControladorJugadoras.listaJu.size(); i++) {
            //Guarda la jugadora de i
            setJugadora(ControladorJugadoras.listaJu.get(i));
            //Agrega al equipo
            agregarAEquipos(jugadora);
        }//No es necesario un try cacth en este
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
    
    //Hace una lista temporal de las jugadoras con el mismo apellido
    public List<Jugadora> busquedaApellido(String nombre) {
        List <Jugadora> listaTemp = new ArrayList<>();
        for(Jugadora ju : listaJu) {
            if (ju.getApellido().equals(nombre)){
                listaTemp.add(ju);
            }
        }
        return listaTemp;
    } 
    
    //Devuelve una jugadora por su dni
    public Jugadora buscarDniJugadora(String dni) {
        for(Jugadora ju : listaJu) {
            if (ju.getDni().equals(dni)){
                return ju;
            }
        }
        //Devuelve una jugadora vacia si no iguala el dni
        Jugadora juga = new Jugadora();
        return juga;
    }
    
    
    //Aumenta el numero de jugadoras de un equipo
    public void agregarAEquipos(Jugadora ju) {
        //Guarda el club de la jugadora pasada por parametro
        String equipo = ju.getClub();
        //Verifica si el equipo no supera las 7 jugadoras
        if (ControladorJugadoras.equipos.get(equipo) >= 7){
            //Lanza excepcion 
            throw new RuntimeException("Limite de jugadoras por equipo superado."); 
        }
        else{
            //Guarda la jugadora al equipo
            ControladorJugadoras.equipos.put(equipo, ControladorJugadoras.equipos.get(equipo) + 1);
        }   
    }

    //Elimina una jugadora de la lista, por dni
    public void eliminarJugadora(String dni) {
        //Recorre toda la lista
        for(int i = 0; i < listaJu.size(); i++) {
            Jugadora ju = listaJu.get(i);
            String codigoJu = ju.getDni();
            //Verifica cuando igualan dni
            if (codigoJu.equals(dni)){
                try{
                    String equipo = ju.getClub();
                    eliminarDeEquipo(equipo);
                    ControladorJugadoras.listaJu.remove(i);
                }catch(Exception e) {
                    throw new RuntimeException("No se pudo eliminar jugadora.");
                }
            }
        }
    }
    
    //Devuelve la cantidad de jugadoras de un equipo, equipo pasado por parametro
    public int cantidadJugadorasPorEquipo(String equipo) {
        int i = equipos.get(equipo);
        return i;
    }
    
    //elimina de equipo
    public void eliminarDeEquipo(String club) {
        //Guarda la cantidad de jugadoras del equipo
        int i = ControladorJugadoras.equipos.get(club);
        //Verifica si el equipo no tenga menos de 5 jugadoras
        if (i <= 5){
            //Lanza excepcion 
            throw new RuntimeException("El equipo no puede quedar con menos de 5 jugadoras."); 
        }
        else{
            //Elimina la jugadora del equipo
            i--;
            ControladorJugadoras.equipos.put(club, i);
        }
    }
    
    //devuelve una lista con las jugadoras que superen cierta cantidad de goles
    public List cantGoles(int cant) {
        List <Jugadora> listAux = new ArrayList <>();
        for (int i = 0; i < listaJu.size(); i++) {
            Jugadora jugAux = listaJu.get(i);
            int goles = jugAux.getGoles();
            if (cant <= goles){
                listAux.add(jugAux);
            }
        }
        return listAux;
    } 
    
    //devuelve una lista con las jugadoras que mas expulsiones tuvieron
    public List masExpulsiones () {
        //Ordena la lista por expulsiones
        Collections.sort(ControladorJugadoras.listaJu);
        //Crea una lista de jugadoras nueva
        List <Jugadora> lisAux = new ArrayList <>();
        //Guarda la jugadora de la primera posicion porque es la de mayor expulsiones
        Jugadora jugAux = ControladorJugadoras.listaJu.get(0);
        lisAux.add(jugAux);
        //Guarda la cantidad de expulsiones
        int rojasAux = jugAux.getT_Rojas();
        //Recorre la lista de jugadoras
        for (int i = 1; i < listaJu.size(); i++){
            Jugadora jugAux2 = listaJu.get(i);
            //Guarda las expulsiones de la jugadora en i
            int rojasAux2 = jugAux2.getT_Rojas();
            //Compara si tienen igual cantidad de expulsiones
            if (rojasAux == rojasAux2){
                //Guarda en la lista, esta lista puede quedar con una sola jugadora
                lisAux.add(jugAux2);
            }
        }
        return lisAux;
    }
    
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
    
    //Retorna la cantidad de  jugadoras segun un equipo pasado por parametro
    public int cantidadEquipo(String club) {
        int i = ControladorJugadoras.equipos.get(club);
        return i;
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
    public int getNacimientoDiaJugadora() {
        return this.jugadora.getNacimientoDia();
    }
    public int getNacimientoMesJugadora() {
        return this.jugadora.getNacimientoMes();
    }
    public int getNacimientoAnioJugadora() {
        return this.jugadora.getNacimientoAnio();
    }
    public String getNacionalidadJugadora() {
        return this.jugadora.getNacionalidad();
    }
    public String getDniJugadora() {
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