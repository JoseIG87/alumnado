package com.tecso.app.dto;

import java.io.Serializable;
import java.util.List;

import com.tecso.app.model.Alumno;
import com.tecso.app.model.Docente;

public class AlumnosYDocentesCurso implements Serializable{
	private static final long serialVersionUID = 6190021661252877187L;

	private String nombreCurso;
	
	private List<Alumno> listaDeAlumnos;
	
	private Docente docenteACargo;

	public AlumnosYDocentesCurso() {
		super();
	}

	public AlumnosYDocentesCurso(String nombreCurso, List<Alumno> listaDeAlumnos, Docente docenteACargo) {
		super();
		this.nombreCurso = nombreCurso;
		this.listaDeAlumnos = listaDeAlumnos;
		this.docenteACargo = docenteACargo;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public List<Alumno> getListaDeAlumnos() {
		return listaDeAlumnos;
	}

	public void setListaDeAlumnos(List<Alumno> listaDeAlumnos) {
		this.listaDeAlumnos = listaDeAlumnos;
	}

	public Docente getDocenteACargo() {
		return docenteACargo;
	}

	public void setDocenteACargo(Docente docenteACargo) {
		this.docenteACargo = docenteACargo;
	}

}
