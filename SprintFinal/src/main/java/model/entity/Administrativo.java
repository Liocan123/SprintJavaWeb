package model.entity;

public class Administrativo extends Usuario {
	
	private String area;
	private String experienciaPrevia;
	
	public Administrativo() {
		super();
	}

	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	
	
	public Administrativo(int run, String nombre, String fechaDeNacimiento, String tipoDeUsuario, String area, String experienciaPrevia) {
		super(run, nombre, fechaDeNacimiento, tipoDeUsuario);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;

	}
	
	public Administrativo(int idUsuario,int run, String nombre, String fechaDeNacimiento, String tipoDeUsuario, String area, String experienciaPrevia) {
		super(idUsuario, run, nombre, fechaDeNacimiento, tipoDeUsuario);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;

	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		return "administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
	
	

}
