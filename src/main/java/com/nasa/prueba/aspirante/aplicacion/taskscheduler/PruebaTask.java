package com.nasa.prueba.aspirante.aplicacion.taskscheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nasa.prueba.aspirante.infraestructura.clientrest.PruebaClienteRest;

@Component
@EnableScheduling
public class PruebaTask {
	@Autowired
	PruebaClienteRest pruebaClienteRest;

	@Scheduled(fixedDelayString = "${task_delay}")
	public void ejecutarTarea() {
		pruebaClienteRest.consumirApiNasa();
	}
}
