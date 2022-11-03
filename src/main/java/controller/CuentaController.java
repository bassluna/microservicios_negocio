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

import entity.Cuenta;
import service.CuentaService;

@CrossOrigin(origins = "*") //permite recibir peticiones desde cualquier origen
@RestController
@RequestMapping("/controllerCuenta")
public class CuentaController {

	@Autowired
	CuentaService service;
	
	@GetMapping(value="cuentas", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cuenta> recuperarCuentas(){
		return service.recuperarCuentas();
	}
	
	@GetMapping(value="cuentas/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Cuenta recuperarCuenta(@PathVariable("id") int id) {
		return service.recuperarCuenta(id);
	}
	
    @RequestMapping(value = "cuentas", method = RequestMethod.POST)
    public void registrarCuenta(@RequestBody Cuenta cuenta) {
    	service.agregarCuenta(cuenta);
    }
	
    @RequestMapping(value = "cuentas", method = RequestMethod.PUT)
	public void actualizarCuenta(@RequestBody Cuenta cuentas) {
		service.actualizarCuenta(cuentas);
	}
			
}
