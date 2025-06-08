package Controlador;

import Model.Arbitro;
import Model.Fecha;
import java.util.ArrayList;

public class ControladorArbitros {
    
/*Variables de instancia*/

    private Arbitro arbitro ;
    private ArrayList<Arbitro> listaArbitros;

    
/*Constructores*/
    
        //Constructor vacio
    public ControladorArbitros(){
        /* Me parece que no es necesario
        this.arbitro = new Arbitro();
        this.listaArbitros = new ArrayList<>();
        this.listaTempArbitros = new ArrayList<>();
        */
    }
        //Constructor lleno
    public ControladorArbitros(Arbitro arbitro, ArrayList<Arbitro> listaArbitros, ArrayList<Arbitro> listaTempArbitros) {
        
        this.arbitro = arbitro;
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
    public Fecha getArbitroNacimiento() {
        return this.arbitro.getNacimiento();
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
    public void setArbitroNacimiento(Fecha nacimiento){
        this.arbitro.setNacimiento(nacimiento);
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
    public void setArbitroLista(Arbitro arbitro){
		this.arbitro = arbitro
        this.listaArbitros.add(this.arbitro);
    }
    
        //Carga todos los arbitros con el mismo en la lista temporal
    public ArrayList getArbitroPorNombre(String nombre, String apellido){
        ArrayList<Arbitro> listaTempArbitros = new ArrayList<>();
        for(Arbitro i : this.listaArbitros){
                if(i.getNombre().equals(nombre) && i.getApellido().equals(apellido)){
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
        throw new NoSuchElementException("No se encontro el arbitro");
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
    public void eliminarArbitroLista(int dni){
        for(int i = 0; i< this.listaArbitros.size(); i++){
            if(this.listaArbitros.get(i).getDni().equals(dni)){
                this.listaArbitros.remove(i);
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
		//Devuelve el tamaño de la lista. Es necesario especificar si es la lista temporal o no
	public int getSizeLista(){
				return this.listaArbitros.size();
		}
	
		//Devuelve el arbitro que está en esa posicion de la lista. Es necesario especificarsi si es la lista temporal o no
	public Arbitro getArbitroLista(int posicion){
				return this.listaArbitros.get(posicion);
		}	        
}