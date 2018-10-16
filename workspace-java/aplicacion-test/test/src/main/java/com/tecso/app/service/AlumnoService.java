package com.tecso.app.service;

import java.util.List;

import com.tecso.app.model.Alumno;

public interface AlumnoService {
	
	Alumno obtenerAlumnoPorId(Long idAlumno);
	
	Alumno obtenerAlumnoPorLegajo(Integer legajo);
	
	Alumno obtenerAlumnoPorIdPersona(Long idPersona);
	
	List<Alumno> buscarTodosLosAlumnos();
	
	void guardarOActualizar(Alumno alumno);
	
	void eliminarAlumno(Long id);

}
