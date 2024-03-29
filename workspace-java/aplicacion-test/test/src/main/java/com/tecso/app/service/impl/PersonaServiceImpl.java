package com.tecso.app.service.impl;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecso.app.model.Persona;
import com.tecso.app.repository.PersonaRepository;
import com.tecso.app.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository personaRepo;

	@Override
	public Persona obtenerPersonaPorId(Long idPersona) {
		Optional<Persona> personaQuery = personaRepo.findById(idPersona);
		if(personaQuery != null) {
			return personaQuery.get();
		}
		return null;
	}

	@Override
	public void guardarOActualizar(Persona persona) {
		personaRepo.save(persona);
	}

	@Override
	public Persona obtenerPersonaPorDni(BigInteger documento) {
		
		return personaRepo.findByDni(documento);
	}

}
