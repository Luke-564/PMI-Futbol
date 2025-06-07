package Model;

public class Jugadora extends Persona implements Comparable <Jugadora> {
    //Variables de instancia
    private String posicion;
    private String club;
    private int goles;
    private int t_Amarillas;
    private int t_Rojas;
    //Constructores
    public Jugadora() {
    }
    public Jugadora(String posicion, String club, int goles, int t_Amarillas,
            int t_Rojas) {
        this.posicion = posicion;
        this.club = club;
        this.goles = goles;
        this.t_Amarillas = t_Amarillas;
        this.t_Rojas = t_Rojas;
    }
    public Jugadora(String posicion, String club, int goles, int t_Amarillas, int t_Rojas,
            String nombre, String apellido, Fecha nacimiento, String nacionalidad) {
        super(nombre, apellido, nacimiento, nacionalidad);
        this.posicion = posicion;
        this.club = club;
        this.goles = goles;
        this.t_Amarillas = t_Amarillas;
        this.t_Rojas = t_Rojas;
    }
    //Getters / Observadores
    public String getPosicion() {
        return posicion;
    }
    public String getClub() {
        return club;
    }
    public int getGoles() {
        return goles;
    }
    public int getT_Amarillas() {
        return t_Amarillas;
    }
    public int getT_Rojas() {
        return t_Rojas;
    }
    //Setters / Modificadores
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public void setT_Amarillas(int t_Amarillas) {
        this.t_Amarillas = t_Amarillas;
    }
    public void setT_Rojas(int t_Rojas) {
        this.t_Rojas = t_Rojas;
    }
    //toString
    @Override
    public String toString() {
        return super.toString() + "Jugadora{" + "posicion=" + posicion + ", club=" + club + 
                ", goles=" + goles + ", t_Amarillas=" + t_Amarillas +
                ", t_Rojas=" + t_Rojas + '}';
    }
    //CompareTo
    @Override
    public int compareTo(Jugadora otra) {
        return otra.getT_Rojas() - this.t_Rojas;
    }

}
