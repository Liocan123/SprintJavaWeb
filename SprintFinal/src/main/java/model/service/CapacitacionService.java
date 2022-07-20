package model.service;

import java.util.List;

import model.entity.Capacitacion;


public interface CapacitacionService {
	
	public void create(Capacitacion ca);
	public List<Capacitacion> read();

}
