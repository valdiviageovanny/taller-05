public class Estudiante extends Usuario {

    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void solicitarInscripcionCurso(Curso curso) {
        curso.agregarEstudianteEnEspera(this);
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa ActividadSumativa) {
        //ActividadSumativa.registrarEntrega(this, "La actividad sumativa fue entregada por: " + this.usuario);
    }
}
