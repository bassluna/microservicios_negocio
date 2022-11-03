package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Persona;

@Repository
public class PersonaDaoImpl implements PersonaDao {

	@Autowired
	PersonaJpaSpring jpaPerson;
	
    @Override
    public void registrar(Persona persona) {
        jpaPerson.save(persona);
    }
    
	public Persona recuperarPersona(int idPersona) {
		return jpaPerson.findById(idPersona).orElse(null);
	}
	
	public List<Persona> devolverPersonas() {
		List<Persona> personas = new ArrayList<>();
		Iterable<Persona> person =  jpaPerson.findAll();
		for(Persona cli : person) {
			System.out.println(cli);
			personas.add(cli);
		}	
		return personas;			
	}
	
	
	@Override
	public Persona updatePersona(Persona p) {
		return jpaPerson.save(p);
	}
	
//	public void eliminarCliente(String nombre) {
//		jpaPerson.eliminarPorNombre(nombre);
//	}
	
}


	
	