package lpz.nelson.models;


public class Usuario {

    private Integer id;

    private String nombre;

    private String pass;

    private String nivelAcceso;

    private String estado;

    public Usuario() {
    }

    public Usuario(String nombre, String pass, String nivelAcceso, String estado) {
        this.nombre = nombre;
        this.pass = pass;
        this.nivelAcceso = nivelAcceso;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", pass=" + pass + ", funcionarioNombre="
                + ", nivelAcceso=" + nivelAcceso + ", estado=" + estado + "]";
    }
}
