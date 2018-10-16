package com.tecso.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecso.app.model.Curso;
import com.tecso.app.repository.CursoRepository;
import com.tecso.app.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	CursoRepository repo;

	@Override
	public List<Curso> buscarTodosLosCursos() {
		Iterable<Curso> cursos = repo.findAll();
		List<Curso> rta = new ArrayList<Curso>();
		while(cursos.iterator().hasNext()) {
			rta.add(cursos.iterator().next());
		}
		return rta;
	}

	@Override
	public Curso buscarCursoPorId(Long idCurso) {
		Optional<Curso> curso = repo.findById(idCurso);
		if(curso != null) {
			return curso.get();
		}
		return null;
	}

	

}
