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

import entity.Movimiento;
import service.MovimientoService;

@CrossOrigin(origins = "*") //permite recibir peticiones desde cualquier origen
@RestController
@RequestMapping("/controllerMovimiento")
public class MovimientoController {
	
	@Autowired
	MovimientoService service;
	
	@GetMapping(value="movimientos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Movimiento> recuperarMovimientos(){
		return service.recuperarMovimientos();
	}
	
	@GetMapping(value="movimientos/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Movimiento recuperarMovimiento(@PathVariable("id") int id) {
		return service.recuperarMovimiento(id);
	}
	
    @RequestMapping(value = "movimientos", method = RequestMethod.POST)
    public void registrarMovimiento(@RequestBody Movimiento movimiento) {
    	service.agregarMovimiento(movimiento);
    }
    
    
    @RequestMapping(value = "movimientos", method = RequestMethod.PUT)
	public void actualizarMovimiento(@RequestBody Movimiento movimiento) {
		service.actualizarMovimiento(movimiento);
	}
		
}
