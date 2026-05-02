package cl.duoc.Administrador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.Administrador.model.Administrador;
import cl.duoc.Administrador.repository.RepositoryAdministrador;

@Service
public class ServiceAdministrador {
    @Autowired
    private RepositoryAdministrador repositoryAdministrador;

    //Metoddo para listar los administradores

    public List<Administrador> administradorListar(){
        return this.repositoryAdministrador.findAll();
    }

    //Metodo para almacenar un administrador, pero primero verifica que no exista el rut del administrador

    public Boolean administradorAlmacenar(Administrador administrador){
        if(repositoryAdministrador.existsByRutAdministrador(administrador.getRutAdministrador())) {
            return false;
        } else {
            this.repositoryAdministrador.save(administrador);
            return true;
        }
    }

    //Metodo para buscar un administrador por su ID, pero no retorna el administrador,
    //solo retorna un booleano para verificar si existe o no el administrador

    public Boolean administradorBuscarId(Integer idAdministrador){
        return repositoryAdministrador.existsById(idAdministrador);
    }

    //Mismo metodo, pero para buscar un administrador por su rut

    public Boolean administradorBuscarRut(String rutAdministrador){
        if(repositoryAdministrador.existsByRutAdministrador(rutAdministrador)){
            return repositoryAdministrador.existsByRutAdministrador(rutAdministrador);
        } else {
            return false;
        }
    }

    //Metodo para modificar un administrador, pero primero verifica que exista el administrador por su ID

    public Boolean administradorModificar(Administrador administrador){
        if(repositoryAdministrador.existsById(administrador.getIdAdministrador())) {
            this.repositoryAdministrador.save(administrador);
            return true;
        } else {
            return false;
        }
    }

    //Metodo para eliminar un administrador, pero primero verifica que exista el administrador por su ID
    
    public Boolean administradorEliminar(Administrador administrador){
        if(repositoryAdministrador.existsById(administrador.getIdAdministrador())) {
            this.repositoryAdministrador.delete(administrador);
            return true;
        } else {
            return false;
        }
    }

    public List<Administrador> administradorBuscarNombre(String nombreCompletoAdministrador){
        return repositoryAdministrador.findByNombreCompletoAdministradorContaining(nombreCompletoAdministrador);
    }
       
}