public class Profesor extends Usuario {

    public Profesor(String usuario, String contrasena) {
        super(usuario, contrasena);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa AdtividadSumativa) {
        curso.agregarActividad(AdtividadSumativa);
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa AdtividadSumativa, float nota) {
        actividad.registrarCalificacion(estudiante, nota);
    }

    public void aceptarInscripcion(Curso curso, String Estudiante) {
        curso.moverDeEsperaAInscrito(Estudiante);
    }

    public Foro crearNuevoForo(Foro foro) {
        Foro foro = new Foro();
        curso.agregarForo(foro);
        return foro;
    }
}
