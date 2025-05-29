
package Controlador;

import Model.Arbitro;
import Model.Fecha;
import java.util.ArrayList;

public class ControladorArbitros {
    
/*Variables de instancia*/

    private Arbitro arbitro ;
    private ArrayList<Arbitro> listaArbitros;
    private ArrayList<Arbitro> listaTempArbitros;

    
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
        this.listaTempArbitros = listaTempArbitros;
    }
    
/*Getters*/
    
    public Arbitro getArbitro() {
        return arbitro;
    }

    public ArrayList<Arbitro> getListaArbitros() {
        return listaArbitros;
    }

    public ArrayList<Arbitro> getListaTempArbitros() {
        return listaTempArbitros;
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
    public void setArbitroCodigo(){
        this.arbitro.setCodigo(0);
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
    
        //Carga todos los arbitros con el mismo en la lista temporal
    public void getArbitroPorNombre(String nombre, String apellido){
        this.listaTempArbitros.clear();
        for(Arbitro i : this.listaArbitros){
                if(i.getNombre().equals(nombre) && i.getApellido().equals(apellido)){
                    this.listaTempArbitros.add(i);
            }
        }
    }
        //Retorna un arbitro con el codigo coincidente
    public Arbitro getArbitroPorCodigo(int codigo){
        for(Arbitro i : this.listaArbitros){
            if(i.getCodigo() == codigo){
                return i;
            }
        }
        Arbitro arbitroNulo = null;
        return arbitroNulo;
    }
    
        //Almacena en la lista temporal los arbitros internacionales
    public void getArbitrosInternacionales(){
        this.listaTempArbitros.clear();
        for(Arbitro i : this.listaArbitros){
            if(i.isInternacional()){
                this.listaTempArbitros.add(i);
            }
        }
    }
    
        //Almacena en la lista temporal los arbitros Nacionales
    public void getArbitrosNacionales(){
        this.listaTempArbitros.clear();
        for(Arbitro i : this.listaArbitros){
            //If negado, osea que no sea internacional
            if(i.isInternacional()){
                this.listaTempArbitros.add(i);
            }
        }
    }
    
        //Elimina el arbitro por codigo, Si se encuentra y lo elimina devuelve verdadero, si no se encuentra devuelve falso
    public boolean eliminarArbitroLista(int codigo){
        for(int i = 0; i< this.listaArbitros.size(); i++){
            if(this.listaArbitros.get(i).getCodigo() == codigo){
                this.listaArbitros.remove(i);
                return true;
            }
        }
        return false;
    }
        //Modifica el arbitro reemplazando al original. Si no encuentra al arbitro retona falso
    public boolean modificarArbitroLista(int codigo){
        for(int i = 0; i < this.listaArbitros.size(); i++){
            if(codigo == this.listaArbitros.get(i).getCodigo()){
                this.listaArbitros.remove(i);
                this.listaArbitros.set(i, this.arbitro);
                return true;
            }
        }
        return false;
    }
    
    
}