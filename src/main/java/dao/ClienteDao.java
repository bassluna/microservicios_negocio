package dao;

import java.util.List;

import entity.Cliente;


public interface ClienteDao {

	void registrar(Cliente cliente);
    
    List<Cliente> devolverClientes();

    Cliente recuperarCliente(int idCliente);
    
    Cliente updateCliente(Cliente cliente);
	
//	void eliminarCliente(int idCliente);


}

