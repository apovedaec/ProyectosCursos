package com.bolsadeideas.springboot.di.app.models.services;

//@Primary
//@Component("miServicioSimple")	
public class MiServicio implements IServicio {
	
	public MiServicio() {
	}
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante simple";
	}

	

}
