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

import entity.Cliente;
import service.ClienteService;


@CrossOrigin(origins = "*") //permite recibir peticiones desde cualquier origen
@RestController
@RequestMapping("/controllerClient")
public class ClienteController{
	
	@Autowired
	ClienteService service;

	@GetMapping(value="clientes", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> recuperarClientes(){
		return service.recuperarClientes();
	}
	
	@GetMapping(value="clientes/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Cliente recuperarCliente(@PathVariable("id") int id) {
		return service.recuperarCliente(id);
	}
	
    @RequestMapping(value = "clientes", method = RequestMethod.POST)
    public void registrarCliente(@RequestBody Cliente cliente) {
    	service.agregarCliente(cliente);
    }
    
    @RequestMapping(value = "clientes", method = RequestMethod.PUT)
	public void actualizarCliente(@RequestBody Cliente cliente) {
		service.actualizarCliente(cliente);
	}
		
}
