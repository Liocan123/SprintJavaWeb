package model.dao;

import java.util.List;

import model.entity.Capacitacion;


public interface ICapacitacionDAO {
	
	public void create(Capacitacion ca);
	public List<Capacitacion> read();
	public Capacitacion read(int identificador);
	public void update(Capacitacion ca);
	public void delete(int identificador);


}
