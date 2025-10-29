import java.util.ArrayList;
import java.util.List;

public class SoporteTecnico {
    private final List<Incidente> incidentes = new ArrayList<>();

    public void brindarAsistencia(Usuario usuario) {
        // codigo
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        // codigo
    }

    public void registrarIncidente(String email, String contenido, SoporteTecnico soporte){
        // codigo
    }

    public void derivarProblemaDeGestion(Administrador admin, Incidente incidente) {
        incidente.registrarAccion("Derivado a administración por " + admin.getUsuario());
    }

    public List<Incidente> getIncidentes() { return incidentes; }
}
