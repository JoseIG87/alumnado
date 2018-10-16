package com.tecso.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "carrera")
@Table(name = "carrera")
public class Carrera implements Serializable {
	private static final long serialVersionUID = -1674078551966975613L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "identificador", nullable=false)
	private long id;
 
	@Column(name = "nombre", nullable=false)
	private String nombre;
 
	@Column(name = "descripcion", nullable=true)
	private String descripcion;
	
	@Column(name = "fechadesde", nullable=false)
	private Date fechaDesde;
	
	@Column(name = "fechahasta", nullable=true)
	private Date fechaHasta;
	
	@OneToMany(mappedBy="idCarrera")
    private List<Curso> cursos;
	
	@OneToMany(mappedBy="idCarrera")
    private List<InscripcionesCarrera> inscripcionesCarrera;

	public Carrera() {
		super();
		this.cursos = new ArrayList<Curso>();
		this.inscripcionesCarrera = new ArrayList<InscripcionesCarrera>(); 
	}

	public Carrera(long id, String nombre, String descripcion, Date fechaDesde, Date fechaHasta, List<Curso> cursos,
			List<InscripcionesCarrera> inscripcionesCarrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
		this.cursos = cursos;
		this.inscripcionesCarrera = inscripcionesCarrera;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripion() {
		return descripcion;
	}

	public void setDescripion(String descripion) {
		this.descripcion = descripion;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<InscripcionesCarrera> getInscripcionesCarrera() {
		return inscripcionesCarrera;
	}

	public void setInscripcionesCarrera(List<InscripcionesCarrera> inscripcionesCarrera) {
		this.inscripcionesCarrera = inscripcionesCarrera;
	}

	@Override
	public String toString() {
		return String.format("Carrera[id=%d, nombre='%s', descripcion='%s', fechaDesde='%s', "
				+ "fechaHasta='%s']", id, nombre, descripcion, fechaDesde, fechaHasta);
	}

}