package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MovimientoDao;
import dao.MovimientoJpaSpring;
import entity.Movimiento;

@Service
public class MovimientoServiceImpl implements MovimientoService{
	

	@Autowired
	MovimientoJpaSpring dao;
	
	@Autowired
	MovimientoDao movimientoDao;
	
	@Override
	public void agregarMovimiento(Movimiento movimiento) {
		movimientoDao.registrar(movimiento);
	}	

	@Override
	public List<Movimiento> recuperarMovimientos() {
		return (List<Movimiento>) movimientoDao.devolverMovimientos();
	}
	
	@Override
	public Movimiento recuperarMovimiento(int id) {
		return movimientoDao.recuperarMovimiento(id);
	}
	
	public Movimiento actualizarMovimiento(Movimiento movimiento){
		return movimientoDao.updateMovimiento(movimiento);
	}

}
