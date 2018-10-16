package com.tecso.app.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tecso.app.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
	
	@Query("select p from persona p where p.documento=:documento")
	Persona findByDni(@Param("documento") BigInteger documento);
	
}
