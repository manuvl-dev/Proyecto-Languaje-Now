package cl.duoc.Estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.Estudiante.model.Estudiante;
import cl.duoc.Estudiante.repository.RepositoryEstudiante;

@Service
public class ServiceEstudiante {
@Autowired
private RepositoryEstudiante repositoryEstudiante;

public List<Estudiante> estudianteListar(){
    return this.repositoryEstudiante.findAll();
}

public Estudiante estudianteBuscar(Integer idEstudiante){

    return repositoryEstudiante.findById(idEstudiante).orElse(null);
}

public Boolean estudianteAlmacenar (Estudiante estudiante) {
    if(repositoryEstudiante.existsByRutEstudiante(estudiante.getRutEstudiante())){
        return false;
    } else {
        this.repositoryEstudiante.save(estudiante);
        return true;}
}

public Boolean estudianteModificar(Estudiante estudiante){
    if(repositoryEstudiante.existsById(estudiante.getIdEstudiante())){
        return false;
    } else {
        this.repositoryEstudiante.save(estudiante);
        return true;}
    }

public Boolean estudianteEliminar(Estudiante estudiante){
    if(repositoryEstudiante.existsById(estudiante.getIdEstudiante())){
        return false;
    } else {
        this.repositoryEstudiante.deleteById(estudiante.getIdEstudiante());
        return true;}
}

public List<Estudiante> buscarNombreParcial(String nombreCompletoEsudiante) {

    return repositoryEstudiante.findByNombreCompletoEstudianteContaining(nombreCompletoEsudiante);

}

public Boolean estudianteBuscarRut (Estudiante estudiante) {
    if(repositoryEstudiante.existsByRutEstudiante2(estudiante.getRutEstudiante())){
        return false;
    } else {
        this.repositoryEstudiante.save(estudiante);
        return true;}
}
}