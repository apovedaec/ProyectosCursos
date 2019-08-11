package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("miServicioSimple")	
public class MiServicio implements IServicio {
	
	public MiServicio() {
	}
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante simple";
	}

	

}
