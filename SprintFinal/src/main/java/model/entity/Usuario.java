package model.entity;

public class Usuario {
	
	private int idUsuario;
	private int run;
	private String nombre;
	private String fechaDeNacimiento;
	private String tipoDeUsuario;
	
	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, int run, String nombre, String fechaDeNacimiento, String tipoDeUsuario) {
		super();
		this.idUsuario= idUsuario;
		this.run = run;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	public Usuario( int run, String nombre, String fechaDeNacimiento, String tipoDeUsuario) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.tipoDeUsuario = tipoDeUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getTipoDeUsuario() {
		return tipoDeUsuario;
	}

	public void setTipoDeUsuario(String tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", run=" + run + ", nombre=" + nombre + ", fechaDeNacimiento="
				+ fechaDeNacimiento + ", tipoDeUsuario=" + tipoDeUsuario + "]";
	}
	
	
	
}
