package com.nasa.prueba.aspirante.infraestructura.clientrest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nasa.prueba.aspirante.dominio.dto.Root;
import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.service.IPruebaNasaService;

@Component
public class PruebaClienteRest {

	@Autowired
	IPruebaNasaService iPruebaNasaService;

	RestTemplate restTemplate = new RestTemplate();
	ObjectMapper mapper = new ObjectMapper();

	@Value("${api_nasa_uri}")
	String apiNasaUri;

	public void consumirApiNasa() {
		try {
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			ResponseEntity<String> response = restTemplate.getForEntity(apiNasaUri, String.class);
			Root root = mapper.readValue(response.getBody(), Root.class);
			PruebaEntity objEntity = new PruebaEntity();
			objEntity.setHref(root.getCollection().getItems().get(0).getHref());
			objEntity.setCenter(root.getCollection().getItems().get(0).getData().get(0).getCenter());
			objEntity.setTitle(root.getCollection().getItems().get(0).getData().get(0).getTitle());
			objEntity.setNasaId(root.getCollection().getItems().get(0).getData().get(0).getNasaId());
			objEntity.setCreationDate(new Date());
			iPruebaNasaService.saveDataNasa(objEntity);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
