package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Cliente;

@Repository
public class ClienteDaoImpl implements ClienteDao {

	
	@Autowired
	ClienteJpaSpring jpaCliente;
	
    @Override
    public void registrar(Cliente cliente) {
        jpaCliente.save(cliente);
    }
    
	public Cliente recuperarCliente(int idCliente) {
		return jpaCliente.findById(idCliente).orElse(null);
	}
	
	public List<Cliente> devolverClientes() {
		List<Cliente> clientes = new ArrayList<>();
		Iterable<Cliente> person =  jpaCliente.findAll();
		for(Cliente cli : person) {
			System.out.println(cli);
			clientes.add(cli);
		}	
		return clientes;			
	}
	
	@Override
	public Cliente updateCliente(Cliente cliente) {
		return jpaCliente.save(cliente);
	}	

//	public void eliminarCliente(int idCliente) {
//		jpaCliente.deleteById(idCliente);
//	}
	
}
