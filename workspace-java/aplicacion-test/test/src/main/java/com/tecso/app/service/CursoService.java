package com.tecso.app.service;

import java.util.List;

import com.tecso.app.model.Curso;

public interface CursoService {
	
	List<Curso> buscarTodosLosCursos();
	
	Curso buscarCursoPorId(Long idCurso);

}
