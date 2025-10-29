public class Administrador extends Usuario {

    public Administrador(String usuario, String contrasena) {
        super(usuario, contrasena);
    }

    public Usuario crearUsuarioConRol(String usuario, String contrasena, String rol) {
            
        switch (rol.toLowerCase()) {     
            case "estudiante": 
                return new Estudiante(usuario, contrasena);
            case "profesor": 
                return new Profesor(usuario, contrasena);
            case "personalacademico": 
                return new PersonalAcademico(usuario, contrasena);
            default: 
                return new Usuario(usuario, contrasena);
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
