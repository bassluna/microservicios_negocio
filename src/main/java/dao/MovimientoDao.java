package dao;

import java.util.List;

import entity.Movimiento;


public interface MovimientoDao {

	void registrar(Movimiento movimiento);
    
    List<Movimiento> devolverMovimientos();	

    Movimiento recuperarMovimiento(int idMovimiento);
    
    Movimiento updateMovimiento(Movimiento movimiento);
    
//	void eliminarMovimiento(int idMovimiento);

}

