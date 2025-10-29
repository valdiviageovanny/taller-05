public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;

    public Curso(String id, String nombre, boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
    }

    public String getId() {return id;}
    public String getNombre() { return nombre; }
    public boolean getEstadoDisponible() { return estadoDisponible;}
    public void setEstadoDisponible(boolean v) { estadoDisponible = v; }
    public void setId(String id) { this.id = id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}
