package service;

import java.util.List;

import entity.Cuenta;

public interface CuentaService {

	void agregarCuenta(Cuenta cuenta);

	List<Cuenta> recuperarCuentas();
	
	Cuenta recuperarCuenta(int id);
	
	Cuenta actualizarCuenta(Cuenta cuenta);
	
//	void eliminarPorId(int idCuenta);
}
