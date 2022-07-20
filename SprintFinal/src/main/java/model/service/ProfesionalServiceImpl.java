package model.service;

import java.util.List;

import model.dao.IProfesionalDAO;
import model.dao.ProfesionalDAO;
import model.entity.Profesional;

public class ProfesionalServiceImpl implements ProfesionalService {

	IProfesionalDAO dao2 = new ProfesionalDAO();
	
	@Override
	public List<Profesional> read() {

		return dao2.read();
	}

	@Override
	public void create(Profesional p) {
		
		dao2.create(p);
		
	}

	@Override
	public Profesional read(int idUsuario) {
		// TODO Auto-generated method stub
		return dao2.read(idUsuario);
	}

	@Override
	public void update(Profesional p) {
		dao2.update(p);
		
	}

}
