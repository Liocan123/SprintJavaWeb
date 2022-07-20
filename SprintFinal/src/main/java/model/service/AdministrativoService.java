package model.service;

import java.util.List;

import model.entity.Administrativo;

public interface AdministrativoService {
   
	void create(Administrativo a);

    public List<Administrativo> read();
	
	public Administrativo read(int idUsuario);
	
	public void update(Administrativo a);
}
