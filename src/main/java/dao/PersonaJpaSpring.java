package dao;

import org.springframework.data.repository.CrudRepository;

import entity.Persona;

public interface PersonaJpaSpring extends CrudRepository<Persona, Integer> {

}

