package model.service;

import java.util.List;

import model.dao.ClienteDAO;
import model.dao.IClienteDAO;
import model.entity.Cliente;

public class ClienteServiceImpl implements ClienteService {
	
	IClienteDAO dao1 = new ClienteDAO();

	@Override
	public void create(Cliente c) {
		
		dao1.create(c);
	}
	
	@Override
	public List<Cliente> read() {


		return dao1.read();
	}

	@Override
	public void update(Cliente c) {
		
		dao1.update(c);
		
	}

	@Override
	public Cliente read(int idUsuario) {
		// TODO Auto-generated method stub
		return dao1.read(idUsuario);
	}

}
