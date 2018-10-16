package com.tecso.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tecso.app.model.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
	@Query("select a from alumno a where a.idPersonaAlumno=:id")
	Alumno findByPersona(@Param("id") Long id);
	
	@Query("select a from alumno a where a.legajo=:legajo")
	Alumno findByLegajo(@Param("legajo") Integer legajo);
	
}
