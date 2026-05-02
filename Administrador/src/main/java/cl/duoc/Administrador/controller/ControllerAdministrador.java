package cl.duoc.Administrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.Administrador.model.Administrador;
import cl.duoc.Administrador.service.ServiceAdministrador;

@RestController
@RequestMapping("/administrador")
public class ControllerAdministrador {

    @Autowired
    private ServiceAdministrador serviceAdministrador;

    @GetMapping
    public List<Administrador> administradorListar(){
        return this.serviceAdministrador.administradorListar();
    }

    @GetMapping("/buscar/id/{id}")
    public Boolean administradorBuscarId(@PathVariable("id") Integer idAdministrador){
        return this.serviceAdministrador.administradorBuscarId(idAdministrador);
    }

    @GetMapping("/buscar/rut/{rut}")
    public Boolean administradorBuscarRut(@PathVariable("rut") String rutAdministrador){
        return this.serviceAdministrador.administradorBuscarRut(rutAdministrador);
    }

    @GetMapping("/buscar/nombre/{nombreCompletoAdministrador}")
    public ResponseEntity<List<Administrador>> administradorBuscarNombre(@PathVariable("nombreCompletoAdministrador") String nombreCompletoAdministrador) {
        List<Administrador> listaAdministradores = this.serviceAdministrador.administradorBuscarNombre(nombreCompletoAdministrador);
        return ResponseEntity.ok(listaAdministradores);
    }

    @PostMapping
    public ResponseEntity<?> administradorAlmacenar(@RequestBody Administrador administrador){
        if(this.serviceAdministrador.administradorAlmacenar(administrador)){
            return ResponseEntity.ok("Administrador almacenado correctamente");
        } else {
            return ResponseEntity.badRequest().body("El rut del administrador ya existe");
        }
    }

    @PutMapping("/modificar")
    public ResponseEntity<?> administradorModificar(@RequestBody Administrador administrador){
        if(this.serviceAdministrador.administradorModificar(administrador)){
            return ResponseEntity.ok("Administrador modificado correctamente");
        } else {
            return ResponseEntity.badRequest().body("El ID del administrador no existe");
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> administradorEliminar(@PathVariable("id") Integer idAdministrador){
        Administrador adminParaEliminar = new Administrador(); 
        adminParaEliminar.setIdAdministrador(idAdministrador); 
        
        if (this.serviceAdministrador.administradorEliminar(adminParaEliminar)) {
            return ResponseEntity.ok("Administrador eliminado con éxito");
        } else {
            return ResponseEntity.badRequest().body("El ID no existe para eliminar");
        }
    }

}
