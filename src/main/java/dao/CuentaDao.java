package dao;

import java.util.List;

import entity.Cuenta;


public interface CuentaDao {

	void registrar(Cuenta cuenta);
    
    List<Cuenta> devolverCuentas();	

    Cuenta recuperarCuenta(int idCuenta);
    
    Cuenta updateCuenta(Cuenta cuenta);

//	void eliminarCuenta(int idCuenta);

}

