public class PersonalAcademico extends Usuario {

public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
super(usuario, contrasena, nombre, apellido);
}

public Incidente reportarError(String email, String contenido, SoporteTecnico soporte) {
return soporte.registrarIncidente(this, "Error reportado", contenido);
}

public Incidente solicitarAsesoramientoDelSistema(String email, String contenido, SoporteTecnico soporte) {
return soporte.registrarIncidente(this, "Asesoramiento", contenido);
}

public void comentarEnForo(Foro foro, String comentario) {
foro.agregarComentario(this.getUsuario() + ": " + comentario);
}
}