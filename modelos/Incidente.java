
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
private int id;
private String titulo;
private String descripcion;
private final List<String> log_actualizaciones = new ArrayList<>();
private LocalDateTime fecha_reportado = LocalDateTime.now();
private LocalDateTime fecha_cerrado;
private String tipo; 
private PersonalAcademico beneficiario;

public Incidente(int id, String titulo, String descripcion, String tipo, PersonalAcademico beneficiario) {
    this.id = id;
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.tipo = tipo;
    this.beneficiario = beneficiario;
    this.log_actualizaciones.add("Creado: " + fecha_reportado);
    }

    public void registrarAccion(String accion) { log_actualizaciones.add(accion); }
    public void cerrar() { this.fecha_cerrado = LocalDateTime.now(); registrarAccion("Cerrado"); }

    public int getId() { 
        return id; 
        }

    public String getTitulo() { 
        return titulo; 
        }

    public String getDescripcion() { 
        return descripcion; 
    }

    public List<String> getLog_Actualizaciones() { 
        return log_actualizaciones; 
    }

    public LocalDateTime getFechaCreacion() { 
        return fecha_reportado; 
    }

    public LocalDateTime getFechaCerrado() { 
        return fecha_cerrado; 
    }

    public String getTipo() { 
        return tipo; 
    }

    public PersonalAcademico getBeneficiario() { 
        return beneficiario; 
    }
}