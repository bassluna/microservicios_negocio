package dao;

import org.springframework.data.repository.CrudRepository;

import entity.Cuenta;


public interface CuentaJpaSpring extends CrudRepository<Cuenta, Integer> {

//	@Transactional
//	@Modifying
//	@Query("Delete from persona c where c.nombre=?1")
//	void eliminarPorNombre(String nombre);
	
//	@Transactional
//	@Query("select numero_cuenta, tipo_cuenta, saldo_inicial, estado, nombre from persona as p inner join cuenta as cu on p.id_cliente=cu.id_cliente;")
//	List<> listarCuentas();
	
	
}
