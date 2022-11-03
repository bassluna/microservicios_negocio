package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ClienteDao;
import dao.ClienteJpaSpring;
import entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteJpaSpring dao;
	
	@Autowired
	ClienteDao clienteDao;
	
	@Override
	public void agregarCliente(Cliente cliente) {
		clienteDao.registrar(cliente);
	}	

	@Override
	public List<Cliente> recuperarClientes() {
		return (List<Cliente>) clienteDao.devolverClientes();
	}
	
	@Override
	public Cliente recuperarCliente(int id) {
		return clienteDao.recuperarCliente(id);
	}
	
	public Cliente actualizarCliente(Cliente cliente){
		return clienteDao.updateCliente(cliente);
	}
}
