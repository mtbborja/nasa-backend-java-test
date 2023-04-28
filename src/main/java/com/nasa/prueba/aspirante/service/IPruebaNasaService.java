package com.nasa.prueba.aspirante.service;

import java.util.List;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;

public interface IPruebaNasaService {
	
	public void saveDataNasa(PruebaEntity objEntity);
	public List<PruebaEntity> findAll();

}
