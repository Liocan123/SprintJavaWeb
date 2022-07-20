package model.entity;

public class Profesional extends Usuario  {
	
	private String titulo;
	private String fechaDeIngreso;
	
	public Profesional() {
		super();
	}

	public Profesional(String titulo, String fechaDeIngreso) {
		super();
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	
	public Profesional(int run, String nombre, String fechaDeNacimiento, String tipoDeUsuario, String titulo, String fechaDeIngreso) {
		super(run, nombre, fechaDeNacimiento, tipoDeUsuario);
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
		// TODO Auto-generated constructor stub
	}

	
	public Profesional(int idUsuario, int run, String nombre, String fechaDeNacimiento, String tipoDeUsuario, String titulo, String fechaDeIngreso) {
		super(idUsuario,run, nombre, fechaDeNacimiento, tipoDeUsuario);
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaDeIngreso=" + fechaDeIngreso + "]";
	}
	
	
	
	
	

}
