package cl.duoc.Estudiante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.Estudiante.model.Estudiante;
import cl.duoc.Estudiante.service.ServiceEstudiante;

@RestController
@RequestMapping("/estudiantes")
public class ControllerEstudiante {
@Autowired
private ServiceEstudiante serviceEstudiante;
@GetMapping("/listar")
public ResponseEntity<List<Estudiante>> listar() {
    return ResponseEntity.ok(serviceEstudiante.estudianteListar());
    }

@GetMapping("/buscar/{id}")
public ResponseEntity<?> buscarId(@PathVariable Integer id) {
    Estudiante estudiante = serviceEstudiante.estudianteBuscar(id);
    if (estudiante != null) {
     return ResponseEntity.ok(estudiante);
    } else {
        return ResponseEntity.status(404).body("Estudiante no encontrado con ID: " + id);
        }
    }

@PostMapping("/guardar")
public ResponseEntity<String> guardar(@RequestBody Estudiante estudiante) {
     if (serviceEstudiante.estudianteAlmacenar(estudiante)) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Estudiante guardado exitosamente.");
        } else {
            return ResponseEntity.status(400).body("Error: El RUT ya se encuentra registrado.");
        }
    }

@PutMapping("/modificar")
public ResponseEntity<String> modificar(@RequestBody Estudiante estudiante) {
    if (serviceEstudiante.estudianteModificar(estudiante)) {
        return ResponseEntity.ok("Datos del estudiante actualizados correctamente.");
    } else {
     return ResponseEntity.status(400).body("Error: No se puede modificar, el estudiante no existe.");
        }
    }

 @DeleteMapping("/eliminar")
public ResponseEntity<String> eliminar(@RequestBody Estudiante estudiante) {
     if (serviceEstudiante.estudianteEliminar(estudiante)) {
        return ResponseEntity.ok("Estudiante eliminado correctamente.");
        } else {
        return ResponseEntity.status(404).body("Error: El estudiante no existe y no pudo ser eliminado.");
        }
    }

 @GetMapping("/buscar-nombre/{nombre}")
public ResponseEntity<List<Estudiante>> buscarPorNombre(@PathVariable String nombreCompletoEsudiante) {
        return ResponseEntity.ok(serviceEstudiante.buscarNombreParcial(nombreCompletoEsudiante));
    }
}
