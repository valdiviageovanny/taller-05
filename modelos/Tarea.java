import java.time.LocalDateTime;

public class Tarea extends ActividadSumativa {
    public Tarea(String id, String titulo, LocalDateTime fechaPublicacion,
                 float puntajeMaximo, float calificacion, String contenido) {
        super(id, titulo, fechaPublicacion, puntajeMaximo, calificacion, contenido);
    }
}
