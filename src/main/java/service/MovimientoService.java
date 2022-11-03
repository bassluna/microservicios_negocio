package service;

import java.util.List;

import entity.Movimiento;

public interface MovimientoService {

	void agregarMovimiento(Movimiento movimiento);

	List<Movimiento> recuperarMovimientos();
	
	Movimiento recuperarMovimiento(int id);
	
	Movimiento actualizarMovimiento(Movimiento movimiento);
	
//	void eliminarPorId(int idMovimiento);
	
}
