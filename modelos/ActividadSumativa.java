import java.time.LocalDateTime;

public class ActividadSumativa {
    private String id;
    private String titulo;
    private LocalDateTime fechaPublicacion;
    private float puntajeMaximo;
    private float calificacion;
    private String contenido;


    public ActividadSumativa(String id, String titulo, LocalDateTime fechaPublicacion, float puntajeMaximo, float calificacion, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.calificacion = calificacion;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public float getCalificacion() { return calificacion;}
    public LocalDateTime getFechaPublicacion() { return fechaPublicacion; }
    public float getPuntajeMaximo() { return puntajeMaximo; }
    public String getContenido() { return contenido; }
}
