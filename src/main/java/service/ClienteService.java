package service;

import java.util.List;

import entity.Cliente;

public interface ClienteService {
	
	void agregarCliente(Cliente cliente);

	List<Cliente> recuperarClientes();
	
	Cliente recuperarCliente(int id);
	
	Cliente actualizarCliente(Cliente cliente);
	
//	void eliminarPorId(int idCliente);

}
