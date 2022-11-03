package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PersonaDao;
import dao.PersonaJpaSpring;
import entity.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	PersonaJpaSpring dao;
	
	@Autowired
	PersonaDao personaDao;
	
	@Override
	public void agregarPersona(Persona persona) {
		personaDao.registrar(persona);
	}	

	@Override
	public List<Persona> recuperarPersonas() {
		return (List<Persona>) personaDao.devolverPersonas();
	}
	
	@Override
	public Persona recuperarPersona(int id) {
		return personaDao.recuperarPersona(id);
	}
	
	
	public Persona actualizarPersona(Persona persona){
		return personaDao.updatePersona(persona);
	}
	
}
