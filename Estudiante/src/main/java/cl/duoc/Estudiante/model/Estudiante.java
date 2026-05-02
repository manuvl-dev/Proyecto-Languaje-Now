package cl.duoc.Estudiante.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer idEstudiante;
private String rutEstudiante, nombreCompletoEsudiante;
private String correoEstudiante;
private String telefonoEstudiante;
private String usuarioEstudiante;
private String contraseñaEstudiante;
private String fechaRegistroEstudiante, fechaNacEstudiante, estadoEstudiante;
private String estadoAcademicoEstudiante, fechaMatriculaEstudiante;
public Estudiante() {
    this.idEstudiante = 0;
    this.rutEstudiante = "";
    this.nombreCompletoEsudiante = "";
    this.correoEstudiante = "";
    this.telefonoEstudiante = "";
    this.usuarioEstudiante = "";
    this.contraseñaEstudiante = "";
    this.fechaRegistroEstudiante = "";
    this.fechaNacEstudiante = "";
    this.estadoEstudiante = "";
    this.estadoAcademicoEstudiante = "";
    this.fechaMatriculaEstudiante = "";

}
public Integer getIdEstudiante() {
    return idEstudiante;
}
public void setIdEstudiante(Integer idEstudiante) {
    this.idEstudiante = idEstudiante;
}
public String getRutEstudiante() {
    return rutEstudiante;
}
public void setRutEstudiante(String rutEstudiante) {
    this.rutEstudiante = rutEstudiante;
}
public String getNombrecompletoEsudiante() {
    return nombreCompletoEsudiante;
}
public void setNombrecompletoEsudiante(String nombrecompletoEsudiante) {
    this.nombreCompletoEsudiante = nombrecompletoEsudiante;
}
public String getCorreoEstudiante() {
    return correoEstudiante;
}
public void setCorreoEstudiante(String correoEstudiante) {
    this.correoEstudiante = correoEstudiante;
}
public String getTelefonoEstudiante() {
    return telefonoEstudiante;
}
public void setTelefonoEstudiante(String telefonoEstudiante) {
    this.telefonoEstudiante = telefonoEstudiante;
}
public String getUsuarioEstudiante() {
    return usuarioEstudiante;
}
public void setUsuarioEstudiante(String usuarioEstudiante) {
    this.usuarioEstudiante = usuarioEstudiante;
}
public String getContraseñaEstudiante() {
    return contraseñaEstudiante;
}
public void setContraseñaEstudiante(String contraseñaEstudiante) {
    this.contraseñaEstudiante = contraseñaEstudiante;
}
public String getFecharegistroEstudiante() {
    return fechaRegistroEstudiante;
}
public void setFecharegistroEstudiante(String fecharegistroEstudiante) {
    this.fechaRegistroEstudiante = fecharegistroEstudiante;
}
public String getFechanacEstudiante() {
    return fechaNacEstudiante;
}
public void setFechanacEstudiante(String fechanacEstudiante) {
    this.fechaNacEstudiante = fechanacEstudiante;
}
public String getEstadoEstudiante() {
    return estadoEstudiante;
}
public void setEstadoEstudiante(String estadoEstudiante) {
    this.estadoEstudiante = estadoEstudiante;
}
public String getEstadoacademicoEstudiante() {
    return estadoAcademicoEstudiante;
}
public void setEstadoacademicoEstudiante(String estadoacademicoEstudiante) {
    this.estadoAcademicoEstudiante = estadoacademicoEstudiante;
}
public String getFechamatriculaEstudiante() {
    return fechaMatriculaEstudiante;
}
public void setFechamatriculaEstudiante(String fechamatriculaEstudiante) {
    this.fechaMatriculaEstudiante = fechamatriculaEstudiante;
}



}
