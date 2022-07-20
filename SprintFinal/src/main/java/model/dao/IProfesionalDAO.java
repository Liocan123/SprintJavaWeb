package model.dao;

import java.util.List;

import model.entity.Profesional;


public interface IProfesionalDAO {
	
	public void create(Profesional p);
	public List<Profesional> read();
	public Profesional read(int idUsuario);
	public void update(Profesional p);
	public void delete(int idUsuario);


}
