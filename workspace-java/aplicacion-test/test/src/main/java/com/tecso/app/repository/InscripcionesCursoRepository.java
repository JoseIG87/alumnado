package com.tecso.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tecso.app.model.Alumno;
import com.tecso.app.model.Curso;
import com.tecso.app.model.InscripcionesCurso;

public interface InscripcionesCursoRepository extends CrudRepository<InscripcionesCurso, Long> {
	
	@Query("select ic from inscripcionesCurso ic where ic.idAlumno=:idAlumno and ic.idCurso=:idCurso")
	InscripcionesCurso findByPersonaIdAndAlumnoId(Alumno idAlumno, Curso idCurso);

}
