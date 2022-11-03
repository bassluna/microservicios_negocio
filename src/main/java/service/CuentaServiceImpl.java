package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CuentaDao;
import dao.CuentaJpaSpring;
import entity.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService{
	
	@Autowired
	CuentaJpaSpring dao;
	
	@Autowired
	CuentaDao cuentaDao;
	
	@Override
	public void agregarCuenta(Cuenta cuenta) {
		cuentaDao.registrar(cuenta);
	}	

	@Override
	public List<Cuenta> recuperarCuentas() {
		return (List<Cuenta>) cuentaDao.devolverCuentas();
	}
	
	@Override
	public Cuenta recuperarCuenta(int id) {
		return cuentaDao.recuperarCuenta(id);
	}
	
	public Cuenta actualizarCuenta(Cuenta cuenta){
		return cuentaDao.updateCuenta(cuenta);
	}
	
}
