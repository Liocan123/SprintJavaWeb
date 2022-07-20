package model.service;

import java.util.List;

import model.entity.Cliente;

public interface ClienteService {
	
	public void create(Cliente c);
	public List<Cliente> read();
	public Cliente read(int idUsuario);
	public void update(Cliente c);

}
