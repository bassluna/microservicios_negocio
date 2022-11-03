package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Movimiento;

@Repository
public class MovimientoDaoImpl implements MovimientoDao {


	@Autowired
	MovimientoJpaSpring jpaMovimiento;
	
    @Override
    public void registrar(Movimiento movimiento) {
        jpaMovimiento.save(movimiento);
    }
    
	public Movimiento recuperarMovimiento(int idMovimiento) {
		return jpaMovimiento.findById(idMovimiento).orElse(null);
	}
	
	public List<Movimiento> devolverMovimientos() {
		List<Movimiento> movimientos = new ArrayList<>();
		Iterable<Movimiento> movimiento =  jpaMovimiento.findAll();
		for(Movimiento cue : movimiento) {
			System.out.println(cue);
			movimientos.add(cue);
		}	
		return movimientos;			
	}
	
	@Override
	public Movimiento updateMovimiento(Movimiento movimiento) {
		return jpaMovimiento.save(movimiento);
	}
		
//	public void eliminarMovimiento(int idMovimiento) {
//		jpaPerson.deleteById(idMovimiento);
//	}


}
