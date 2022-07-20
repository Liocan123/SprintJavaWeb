package model.service;

import java.util.List;

import model.entity.Profesional;

public interface ProfesionalService {
	
	public void create(Profesional p);
	public List<Profesional> read();
	public Profesional read(int idUsuario);
	public void update(Profesional p);

}
