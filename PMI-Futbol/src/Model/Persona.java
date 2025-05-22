package Model;

public class Persona {
    //variables de instancia
    private String nombre;
    private String apellido;
    private Fecha nacimiento;
    private String nacionalidad;
    private int codigo;
    //Constructores
    public Persona() {
    }
    public Persona(String nombre, String apellido, Fecha nacimiento, 
            String nacionalidad, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
        this.codigo = codigo;
    }
    //Getters / Observadores
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Fecha getNacimiento() {
        return nacimiento;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public int getCodigo() {
        return codigo;
    }
    //Setters / Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //toString, no se si es necesario pero por las dudas
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + 
                ", nacimiento=" + nacimiento + ", nacionalidad=" 
                + nacionalidad + ", codigo=" + codigo + '}';
    }
}
