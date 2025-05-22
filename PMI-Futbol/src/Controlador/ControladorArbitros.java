
package Controlador;

import Model.Arbitro;
import java.util.ArrayList;

public class ControladorArbitros {
    
        //Variables de instancia

    private final Arbitro arbitro = new Arbitro();
    private final ArrayList<Arbitro> listaArbitros;
    private final ArrayList<Arbitro> listaTempArbitros;

    public ControladorArbitros(){
        this.listaArbitros = new ArrayList<>();
        this.listaTempArbitros = new ArrayList<>();
    }
    public ControladorArbitros(Arbitro arbitro, ArrayList<Arbitro> listaArbitros, ArrayList<Arbitro> listaTempArbitros) {
        this.listaArbitros = listaArbitros;
        this.listaTempArbitros = listaTempArbitros;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public ArrayList<Arbitro> getListaArbitros() {
        return listaArbitros;
    }

    public ArrayList<Arbitro> getListaTempArbitros() {
        return listaTempArbitros;
    }


    public void AddArbitro(Arbitro arbitro){
        this.listaArbitros.add(arbitro);
    }
    
    public void GetArbitroPorNombre(String nombre, String apellido){
        this.listaTempArbitros.clear();
        for(Arbitro i : this.listaArbitros){
                if(i.getNombre().equals(nombre) && i.getApellido().equals(apellido)){
                    this.listaTempArbitros.add(i);
            }
        }
    }
    
    public Arbitro GetArbitroPorCodigo(int codigo){
        for(Arbitro i : this.listaArbitros){
            if(i.getCodigo() == codigo){
                return i;
            }
        }
        Arbitro arbitroNulo = null;
        return arbitroNulo;
    }
    //Almacena en la lista temporal los arbitros internacionales
    public void GetArbitrosInternacionales(){
        this.listaTempArbitros.clear();
        for(Arbitro i : this.listaArbitros){
            if(i.isInternacional()){
                this.listaTempArbitros.add(i);
            }
        }
    }
    //Almacena en la lista temporal los arbitros Nacionales
    public void GetArbitrosNacionales(){
        this.listaTempArbitros.clear();
        for(Arbitro i : this.listaArbitros){
            //If negado, osea que no sea internacional
            if(i.isInternacional()){
                this.listaTempArbitros.add(i);
            }
        }
    }
    
    
}