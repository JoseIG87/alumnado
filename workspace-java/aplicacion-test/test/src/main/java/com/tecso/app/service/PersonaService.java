package com.tecso.app.service;

import java.math.BigInteger;

import com.tecso.app.model.Persona;

public interface PersonaService {
	
	Persona obtenerPersonaPorId (Long idPersona);
	
	Persona obtenerPersonaPorDni (BigInteger documento);
	
	void guardarOActualizar (Persona persona);

}
