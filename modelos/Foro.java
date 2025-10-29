import java.util.ArrayList;
import java.util.List;

public class Foro {
private String id;
private String nombre;
private int numeroDeComentarios;
private final List<String> comentarios = new ArrayList<>();

public Foro(String id, String nombre) {
this.id = id;
this.nombre = nombre;
this.numeroDeComentarios = 0;
}

public void agregarComentario(String comentario) {
comentarios.add(comentario);
numeroDeComentarios = comentarios.size();
}

public String getId() { return id; }
public String getNombre() { return nombre; }
public int getNumeroDeComentarios() { return numeroDeComentarios; }
public List<String> getComentarios() { return comentarios; }
}