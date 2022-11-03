package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entity.Persona;
import service.PersonaService;

@CrossOrigin(origins = "*") //permite recibir peticiones desde cualquier origen
@RestController
@RequestMapping("/controllerPersona")
public class PersonaController {
	
	@Autowired
	PersonaService service;
	
	@GetMapping(value="personas", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Persona> recuperarPersonas(){
		return service.recuperarPersonas();
	}
	
	@GetMapping(value="personas/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Persona recuperarPersona(@PathVariable("id") int id) {
		return service.recuperarPersona(id);
	}
	
    @RequestMapping(value = "personas", method = RequestMethod.POST)
    public void registrarPersona(@RequestBody Persona persona) {
    	service.agregarPersona(persona);
    }
    
    @RequestMapping(value = "personas", method = RequestMethod.PUT)
	public void actualizarPersona(@RequestBody Persona persona) {
		service.actualizarPersona(persona);
	}
    
//	@DeleteMapping(value="personas/{id}")
//	public void eliminarPorId(@PathVariable("id") int idPersona) {
//		service.eliminarPorId(idPersona);
//	}
		
}
