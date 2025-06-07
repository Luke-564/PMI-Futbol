    package Model;

public class Arbitro extends Persona {
    //variables
    private int tarjetas;
    private boolean internacional;
    //Constructores
    public Arbitro() {
    }
    public Arbitro(int tarjetas, boolean internacional) {
        this.tarjetas = tarjetas;
        this.internacional = internacional;
    }
    public Arbitro(int tarjetas, boolean internacional, String nombre, 
            String apellido, Fecha nacimiento, String nacionalidad, int codigo) {
        super(nombre, apellido, nacimiento, nacionalidad,codigo);
        this.tarjetas = tarjetas;
        this.internacional = internacional;
    }
    //Getters / Observadores
    public int getTarjetas() {
        return tarjetas;
    }
    public boolean isInternacional() {
        return internacional;
    }
    //Setters / Modificadores
    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }
    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }
    //toString
    @Override
    public String toString() {
        return ","+ tarjetas + "," + internacional;
    }    
}
