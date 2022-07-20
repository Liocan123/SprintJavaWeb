package model.service;


import java.util.List;
import model.dao.AdministrativoDAO;
import model.dao.IAdministrativoDAO;
import model.entity.Administrativo;

public class AdministrativoServiceImpl implements AdministrativoService {
    IAdministrativoDAO dao3 = new AdministrativoDAO();

public void create(Administrativo a) {
		
		dao3.create(a);
	}
	
	@Override
	public List<Administrativo> read() {


		return dao3.read();
	}

	@Override
	public void update(Administrativo a) {
		
		dao3.update(a);
		
	}

	@Override
	public Administrativo read(int idUsuario) {
		// TODO Auto-generated method stub
		return dao3.read(idUsuario);
	}

}