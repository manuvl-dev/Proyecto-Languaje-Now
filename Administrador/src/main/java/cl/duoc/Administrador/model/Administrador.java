package cl.duoc.Administrador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Administrador {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idAdministrador;
    private String rutAdministrador;
    private String nombreCompletoAdministrador;
    private String correoAdministrador;
    private String telefonoAdministrador;
    private String usuarioAdministrador;
    private String contrasenaAdministrador;
    private String fecharegistroAdministrador, fechanacAdministrador, estadoAdministrador;
    private String fechaContratoAdministrador;

    public Administrador() {
        this.idAdministrador = 0;
        this.rutAdministrador = "";
        this.nombreCompletoAdministrador = "";
        this.correoAdministrador = "";
        this.telefonoAdministrador = "";
        this.usuarioAdministrador = "";
        this.contrasenaAdministrador = "";
        this.fecharegistroAdministrador = "";
        this.fechanacAdministrador = "";
        this.estadoAdministrador = "";
        this.fechaContratoAdministrador = "";
    }

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getRutAdministrador() {
        return rutAdministrador;
    }

    public void setRutAdministrador(String rutAdministrador) {
        this.rutAdministrador = rutAdministrador;
    }

    public String getNombreCompletoAdministrador() {
        return nombreCompletoAdministrador;
    }

    public void setNombreCompletoAdministrador(String nombreCompletoAdministrador) {
        this.nombreCompletoAdministrador = nombreCompletoAdministrador;
    }

    public String getCorreoAdministrador() {
        return correoAdministrador;
    }

    public void setCorreoAdministrador(String correoAdministrador) {
        this.correoAdministrador = correoAdministrador;
    }

    public String getTelefonoAdministrador() {
        return telefonoAdministrador;
    }

    public void setTelefonoAdministrador(String telefonoAdministrador) {
        this.telefonoAdministrador = telefonoAdministrador;
    }

    public String getUsuarioAdministrador() {
        return usuarioAdministrador;
    }

    public void setUsuarioAdministrador(String usuarioAdministrador) {
        this.usuarioAdministrador = usuarioAdministrador;
    }

    public String getContrasenaAdministrador() {
        return contrasenaAdministrador;
    }

    public void setContrasenaAdministrador(String contrasenaAdministrador) {
        this.contrasenaAdministrador = contrasenaAdministrador;
    }

    public String getFecharegistroAdministrador() {
        return fecharegistroAdministrador;
    }

    public void setFecharegistroAdministrador(String fecharegistroAdministrador) {
        this.fecharegistroAdministrador = fecharegistroAdministrador;
    }

    public String getFechanacAdministrador() {
        return fechanacAdministrador;
    }

    public void setFechanacAdministrador(String fechanacAdministrador) {
        this.fechanacAdministrador = fechanacAdministrador;
    }

    public String getEstadoAdministrador() {
        return estadoAdministrador;
    }

    public void setEstadoAdministrador(String estadoAdministrador) {
        this.estadoAdministrador = estadoAdministrador;
    }

    public String getFechaContratoAdministrador() {
        return fechaContratoAdministrador;
    }

    public void setFechaContratoAdministrador(String fechaContratoAdministrador) {
        this.fechaContratoAdministrador = fechaContratoAdministrador;
    }

}