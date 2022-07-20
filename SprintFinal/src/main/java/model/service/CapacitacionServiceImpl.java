package model.service;

import java.util.List;

import model.dao.CapacitacionDAO;
import model.dao.ICapacitacionDAO;
import model.entity.Capacitacion;

public class CapacitacionServiceImpl implements CapacitacionService {
	
	ICapacitacionDAO dao = new CapacitacionDAO();

	@Override
	public List<Capacitacion> read() {
		
		return dao.read();
	}

	@Override
	public void create(Capacitacion ca) {
		dao.create(ca);
		
	}
	
}
