package com.bolsadeideas.springboot.di.app.models.services;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {
	
	public MiServicioComplejo() {
	}
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complicado";
	}

	

}
