import java.util.Objects;

public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;


public Usuario(String usuario, String contrasena, String nombre, String apellido) {
this.usuario = usuario;
this.contrasena = contrasena;
this.nombre = nombre;
this.apellido = apellido;
}

public boolean login(String usuario, String contrasena) {
return Objects.equals(this.usuario, usuario) && Objects.equals(this.contrasena, contrasena);
}

public boolean logOut() { return true; }


public String getUsuario() { 
    return usuario; 
}
public void setUsuario(String usuario) { 
    this.usuario = usuario; 
}
public String getContrasena() { 
    return contrasena; 
}
public void setContrasena(String contrasena) { 
    this.contrasena = contrasena; 
}
public String getNombre() { return nombre; }
public void setNombre(String nombre) { 
    this.nombre = nombre; 
}
public String getApellido() { 
    return apellido; }

public void setApellido(String apellido) { 
    this.apellido = apellido; 
}
}