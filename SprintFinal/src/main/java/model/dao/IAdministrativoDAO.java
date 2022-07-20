package model.dao;

import java.util.List;

import model.entity.Administrativo;


public interface IAdministrativoDAO {
	
	public void create(Administrativo a);
	public List<Administrativo> read();
	public Administrativo read(int idUsuario);
	public void update(Administrativo a);
	public void delete(int idUsuario);

}
