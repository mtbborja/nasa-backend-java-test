package com.nasa.prueba.aspirante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;

@Service
public class PruebaNasaServiceImpl implements IPruebaNasaService {

	@Autowired
	PruebaInterfaz pruebaInterfaz;

	@Override
	public void saveDataNasa(PruebaEntity objEntity) {
		pruebaInterfaz.save(objEntity);
	}

	@Override
	public List<PruebaEntity> findAll() {
		return (List<PruebaEntity>) pruebaInterfaz.findAll();

	}
}
