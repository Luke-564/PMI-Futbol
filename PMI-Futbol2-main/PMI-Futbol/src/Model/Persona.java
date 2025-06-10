package Model;

public class Persona {
    //variables de instancia
    private String nombre;
    private String apellido;
    private Fecha nacimiento = new Fecha();
    private String nacionalidad;
    private String dni;
    //Constructores
    public Persona() {
    }
    public Persona(String nombre, String apellido, Fecha nacimiento, 
            String nacionalidad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.dni = dni;
    }
    //Getters / Observadores
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getNacimientoDia() {
        return nacimiento.getDia();
    }
    public int getNacimientoMes() {
        return nacimiento.getMes();
    }
    public int getNacimientoAnio() {
        return nacimiento.getAnio();
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getDni() {
        return dni;
    }
    //Setters / Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNacimiento(int dia, int mes, int anio) {
        this.nacimiento.setDia(dia);
        this.nacimiento.setMes(mes);
        this.nacimiento.setAnio(anio);
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //toString, no se si es necesario pero por las dudas
    @Override
    public String toString() {
        return nombre + "," + apellido + "," + nacimiento + "," + nacionalidad + "," + dni;
    }
    
}
