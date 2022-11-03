package dao;

import java.util.List;

import entity.Persona;

public interface PersonaDao {
	
    void registrar(Persona persona);
    
    List<Persona> devolverPersonas();

    Persona recuperarPersona(int idPersona);
    
	Persona updatePersona(Persona persona);
    	
//	void eliminarCliente(int idCliente);    

}
