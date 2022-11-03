package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Cuenta;

@Repository
public class CuentaDaoImpl implements CuentaDao {

	@Autowired
	CuentaJpaSpring jpaCuenta;
	
    @Override
    public void registrar(Cuenta cuenta) {
        jpaCuenta.save(cuenta);
    }
    
	public Cuenta recuperarCuenta(int idCuenta) {
		return jpaCuenta.findById(idCuenta).orElse(null);
	}
	
	public List<Cuenta> devolverCuentas() {
		List<Cuenta> cuentas = new ArrayList<>();
		Iterable<Cuenta> cuenta =  jpaCuenta.findAll();
		for(Cuenta cue : cuenta) {
			System.out.println(cue);
			cuentas.add(cue);
		}	
		return cuentas;			
	}
	
	
	@Override
	public Cuenta updateCuenta(Cuenta cuenta) {
		return jpaCuenta.save(cuenta);
	}

//	public void eliminarCuenta(int idCuenta) {
//		jpaCuenta.deleteById(idCuenta);
//	}

}
