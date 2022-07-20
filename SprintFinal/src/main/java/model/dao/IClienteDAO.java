package model.dao;

import java.util.List;

import model.entity.Cliente;

public interface IClienteDAO {
	
	public void create(Cliente c);
	public List<Cliente> read();
	public Cliente read(int idUsuario);
	public void update(Cliente c);
	public void delete(int idUsuario);

}
