package com.nasa.prueba.aspirante.infraestructura.restcontroller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.service.IPruebaNasaService;

@RestController
public class PruebaRestController {

	@Autowired
	IPruebaNasaService iPruebaNasaService;

	@GetMapping(value = "/get-data-api-nasa", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllRowsDataNasa() {
		List<PruebaEntity> lista = iPruebaNasaService.findAll();
		if (lista.size() > 0) {
			Collections.sort(lista);
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
}
