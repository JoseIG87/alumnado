package com.tecso.app.service;

import com.tecso.app.model.Alumno;
import com.tecso.app.model.Curso;
import com.tecso.app.model.InscripcionesCurso;

public interface InscripcionesCursoService {
	
	InscripcionesCurso buscarInscripcionDeAlumnoACurso (Alumno al, Curso c);

}
