package com.tecso.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecso.app.model.Alumno;
import com.tecso.app.model.Curso;
import com.tecso.app.model.InscripcionesCurso;
import com.tecso.app.repository.InscripcionesCursoRepository;
import com.tecso.app.service.InscripcionesCursoService;

@Service
public class InscripcionesCursoServiceImpl implements InscripcionesCursoService{
	
	@Autowired
	InscripcionesCursoRepository repo;
	
	@Override
	public InscripcionesCurso buscarInscripcionDeAlumnoACurso(Alumno al, Curso c) {
		
		return repo.findByPersonaIdAndAlumnoId(al, c);
	}

	

}
