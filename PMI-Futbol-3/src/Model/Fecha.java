
package Model;

public class Fecha {
    //variables de instancia
    private int dia;
    private int mes;
    private int anio;
    //observadores
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }
    //modificadores
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    //constructores
    public Fecha() {
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //metodos
    public String muestraFecha(Fecha para){
        return para.dia + "," + para.mes + "," + para.anio;
    }
    
    public boolean isEmpty() {
        if(dia == 0) {
            return true;
        }
        if(mes == 0) {
            return true;
        }
        if(anio == 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  dia + "," + mes + "," + anio;
    }
    
    
    
}
