package com.tecso.app.model;

import java.io.Serializable;

public class InscripcionesCursoPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idAlumno;
	
	private Long idCurso;

	public Long getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Long idAlumno) {
		this.idAlumno = idAlumno;
	}
	
	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InscripcionesCursoPK)) {
			return false;
		}
		InscripcionesCursoPK castOther = (InscripcionesCursoPK)other;
		return 
			(this.idAlumno == castOther.idAlumno)
			&& (this.idCurso.equals(castOther.idCurso));
	}
	
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = (int) (hash * prime + this.idAlumno);
		hash = (int) (hash * prime + this.idCurso);
		
		return hash;
	}

}
