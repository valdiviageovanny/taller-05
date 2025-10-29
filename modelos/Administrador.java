public class Administrador extends Usuario {

    public Administrador(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public Usuario crearUsuarioConRol(String usuario, String contrasena, String nombre, String apellido, String rol) {
            
        switch (rol.toLowerCase()) {     
            case "estudiante": 
                return new Estudiante(usuario, contrasena, nombre, apellido);
            case "profesor":
                return new Profesor(usuario, contrasena, nombre, apellido);
            case "personalacademico": 
                return new PersonalAcademico(usuario, contrasena, nombre, apellido);
            default: 
                return new Usuario(usuario, contrasena, nombre, apellido);
        }
    }

    public void asignarPermisos(Usuario usuario) {
        // codigo
    }

    public void actualizarSoftware() {
        // codigo
    }

    public void asignarResponsable(Curso curso, Profesor profesor) {
        curso.setResponsable(profesor);
    }
}
