package Controlador;

import Model.Arbitro;
import java.util.ArrayList;

public class ControladorArbitros {
    
/*Variables de instancia*/

    private Arbitro arbitro = new Arbitro();
    private static ArrayList<Arbitro> listaArbitros = new ArrayList<>();

    
/*Constructores*/
    
        //Constructor vacio
    public ControladorArbitros(){

    }
        //Constructor lleno
    public ControladorArbitros(ArrayList<Arbitro> listaArbitros) {
        this.listaArbitros = listaArbitros;
    }
    
/*Getters*/
    
    public Arbitro getArbitro() {
        return this.arbitro;
    }

    public ArrayList<Arbitro> getListaArbitros() {
        return this.listaArbitros;
    }

	// Variables generales de Persona

    public String getArbitroNombre() {
        return this.arbitro.getNombre();
    }
    public String getArbitroApellido() {
        return this.arbitro.getApellido();
    }
    public int getArbitroNacimientoDia() {
        return this.arbitro.getNacimientoDia();
    }
    public int getArbitroNacimientoMes() {
        return this.arbitro.getNacimientoMes();
    }
    public int getArbitroNacimientoAnio() {
        return this.arbitro.getNacimientoAnio();
    }
    
    public String getArbitroNacionalidad() {
        return this.arbitro.getNacionalidad();
    }
    public String getArbitroDni() {
        return this.arbitro.getDni();
    }
    // Variables únicas de Arbitro
    public int getArbitroTarjetas() {
        return this.arbitro.getTarjetas();
    }
    public boolean isArbitroInternacional() {
        return this.arbitro.isInternacional();
    }
    
/*Setters*/
    
        //Variables generales de Persona
    public void setArbitro(Arbitro arbitro){
        this.arbitro = arbitro;
    }
    public void setArbitroNombre(String nombre){
        this.arbitro.setNombre(nombre);
    }
    public void setArbitroApellido(String apellido){
        this.arbitro.setApellido(apellido);
    }
    public void setArbitroNacimiento(int dia, int mes, int anio){
        this.arbitro.setNacimiento(dia, mes, anio);
    }

    public void setArbitroNacionalidad(String nacionalidad){
        this.arbitro.setNacionalidad(nacionalidad);
    }
    public void setArbitroDni(String dni){
        this.arbitro.setDni(dni);
    }
        //Variables unicas de Arbitro
    public void setArbitroTarjetas(int tarjetas){
        this.arbitro.setTarjetas(tarjetas);
    }
    public void setArbitroInternacional(boolean internacional){
        this.arbitro.setInternacional(internacional);
    }
    
/*Metodos*/
    
        //Añade un arbitro a la lista
    public void setArbitroLista(){
	
        this.listaArbitros.add(this.arbitro);
    }
    public void setArbitroDesdeLista(int pos){
        this.arbitro = this.listaArbitros.get(pos);
    }
    
        //Carga todos los arbitros con el mismo en la lista temporal
    public ArrayList<Arbitro> getArbitroPorNombreYApellido(String nombre, String apellido){
        ArrayList<Arbitro> listaTempArbitros = new ArrayList<>();
        for(Arbitro i : this.listaArbitros){
                if(i.getNombre().equals(nombre) && i.getApellido().equals(apellido)){
                    listaTempArbitros.add(i);
            }
        }
		return listaTempArbitros;
    }
    public ArrayList<Arbitro> getArbitroSoloPorNombre(String nombre){
        ArrayList<Arbitro> listaTempArbitros = new ArrayList<>();
        for(Arbitro i : this.listaArbitros){
                if(i.getNombre().equals(nombre)){
                    listaTempArbitros.add(i);
            }
        }
		return listaTempArbitros;
    }
    public ArrayList<Arbitro> getArbitroSoloPorApellido(String apellido){
        ArrayList<Arbitro> listaTempArbitros = new ArrayList<>();
        for(Arbitro i : this.listaArbitros){
                if(i.getApellido().equals(apellido)){
                    listaTempArbitros.add(i);
            }
        }
		return listaTempArbitros;
    }
        //Retorna un arbitro con el codigo coincidente
    public Arbitro getArbitroPorDni(String dni){
        for(Arbitro i : this.listaArbitros){
            if(i.getDni().equals(dni) ){
                return i;
            }
        }
        throw new RuntimeException("No se encontro el arbitro");
    }
    
        //Almacena en la lista temporal los arbitros internacionales
    public ArrayList getArbitrosInternacionales(){
		ArrayList<Arbitro> listaTemp = new ArrayList<>();
        for(Arbitro i : this.listaArbitros){
            if(i.isInternacional()){
                listaTemp.add(i);
            }
        }
		return listaTemp;
    }
    
        //Almacena en la lista temporal los arbitros Nacionales
    public ArrayList getArbitrosNacionales(){
        ArrayList<Arbitro> listaTempArbitros = new ArrayList<>();
        for(Arbitro i : this.listaArbitros){
            //If negado, osea que no sea internacional
            if(i.isInternacional()){
                listaTempArbitros.add(i);
            }
        }
		return listaTempArbitros;
    }
    
        //Elimina el arbitro por codigo, Si se encuentra y lo elimina devuelve verdadero, si no se encuentra devuelve falso
    public void eliminarArbitroLista(String dni){
        if(this.listaArbitros.isEmpty() == false){
        for(int i = 0; i< this.listaArbitros.size(); i++){
            if(this.listaArbitros.get(i).getDni().equals(dni)){
                this.listaArbitros.remove(i);
                return;
            }
        }
        }
        throw new RuntimeException("No se pudo eliminar al arbitro");
    }
        //Modifica el arbitro reemplazando al original. Si no encuentra al arbitro retona falso
    public void modificarArbitroLista(String dni){
        for(int i = 0; i < this.listaArbitros.size(); i++){
            if( this.listaArbitros.get(i).getDni().equals(dni)){
                this.listaArbitros.remove(i);
                this.listaArbitros.set(i, this.arbitro);
                
            }
        }
        throw new RuntimeException("No se pudo modificar el arbitro");
    }
    public void setArbitroDeListaExterna(ArrayList<Arbitro> lista,int pos){
        this.arbitro = lista.get(pos);
    }
	//Devuelve el tamaño de la lista. Es necesario especificar si es la lista temporal o no
    public int getSizeLista(){
	return this.listaArbitros.size();
	}
	
	//Devuelve el arbitro que está en esa posicion de la lista. Es necesario especificarsi si es la lista temporal o no
    public Arbitro getArbitroLista(int posicion){
	return this.listaArbitros.get(posicion);
	}	        
}