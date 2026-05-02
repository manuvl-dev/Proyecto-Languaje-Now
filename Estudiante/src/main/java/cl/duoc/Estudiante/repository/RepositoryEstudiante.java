package cl.duoc.Estudiante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.Estudiante.model.Estudiante;

public interface RepositoryEstudiante extends JpaRepository <Estudiante, Integer> {
boolean existsByRutEstudiante(String rutEstudiante);
List<Estudiante> findByNombreCompletoEstudianteContaining(String nombre);

boolean existsByRutEstudiante2(String rutEstudiante);
}
