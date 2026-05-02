package cl.duoc.Administrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.Administrador.model.Administrador;

@Repository
public interface RepositoryAdministrador extends JpaRepository<Administrador, Integer> {

    boolean existsByRutAdministrador(String rutAdministrador);

    List<Administrador> findByNombreCompletoAdministradorContaining(String nombreCompletoAdministrador);
}
