package service;

import java.util.List;

import entity.Persona;

public interface PersonaService {
	
	void agregarPersona(Persona persona);

	List<Persona> recuperarPersonas();
	
	Persona recuperarPersona(int id);
	
	Persona actualizarPersona(Persona persona);

//	void eliminarPorId(int idPersona);

}
