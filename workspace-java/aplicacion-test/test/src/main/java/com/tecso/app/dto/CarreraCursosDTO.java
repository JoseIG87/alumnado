package com.tecso.app.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.tecso.app.model.InscripcionesCurso;

public class CarreraCursosDTO implements Serializable{
	private static final long serialVersionUID = 4046367319635395673L;

	private String nombreCarrera;
	
	private List<InscripcionesCurso> cursosActivos;
	
	private List<InscripcionesCurso> cursosAprobados;
	
	private List<InscripcionesCurso> cursosDesaprobados;
	
	private BigDecimal promedioGeneralCarrera;

	public CarreraCursosDTO() {
		super();
	}

	public CarreraCursosDTO(String nombreCarrera, List<InscripcionesCurso> cursosActivos,
			List<InscripcionesCurso> cursosAprobados, List<InscripcionesCurso> cursosDesaprobados,
			BigDecimal promedioGeneralCarrera) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.cursosActivos = cursosActivos;
		this.cursosAprobados = cursosAprobados;
		this.cursosDesaprobados = cursosDesaprobados;
		this.promedioGeneralCarrera = promedioGeneralCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public List<InscripcionesCurso> getCursosActivos() {
		return cursosActivos;
	}

	public void setCursosActivos(List<InscripcionesCurso> cursosActivos) {
		this.cursosActivos = cursosActivos;
	}

	public List<InscripcionesCurso> getCursosAprobados() {
		return cursosAprobados;
	}

	public void setCursosAprobados(List<InscripcionesCurso> cursosAprobados) {
		this.cursosAprobados = cursosAprobados;
	}

	public List<InscripcionesCurso> getCursosDesaprobados() {
		return cursosDesaprobados;
	}

	public void setCursosDesaprobados(List<InscripcionesCurso> cursosDesaprobados) {
		this.cursosDesaprobados = cursosDesaprobados;
	}

	public BigDecimal getPromedioGeneralCarrera() {
		return promedioGeneralCarrera;
	}

	public void setPromedioGeneralCarrera(BigDecimal promedioGeneralCarrera) {
		this.promedioGeneralCarrera = promedioGeneralCarrera;
	}
}
