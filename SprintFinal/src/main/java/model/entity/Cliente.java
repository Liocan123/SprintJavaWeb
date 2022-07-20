package model.entity;

public class Cliente extends Usuario {
	
	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private int sistemaDeSalud;
	private String fechaDeNacimiento;
	private String direccion;
	private String comuna;
	
	public Cliente() {
		super();
	}

	public Cliente( int idUsuario, int run, String nombre, String superfechaDeNacimiento, String tipoDeUsuario,int rut, String nombres, String apellidos, String telefono, String afp, int sistemaDeSalud,
			String fechaDeNacimiento, String direccion, String comuna) {
		super( idUsuario, run, nombre, superfechaDeNacimiento, tipoDeUsuario);
		// TODO Auto-generated constructor stub
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud = sistemaDeSalud;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.direccion = direccion;
		this.comuna = comuna;
		
	}
	public Cliente( int run, String nombre, String superfechaDeNacimiento, String tipoDeUsuario,int rut, String nombres, String apellidos, String telefono, String afp, int sistemaDeSalud,
			String fechaDeNacimiento, String direccion, String comuna) {
		super( run, nombre, superfechaDeNacimiento, tipoDeUsuario);
		// TODO Auto-generated constructor stub
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud = sistemaDeSalud;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaDeSalud() {
		return sistemaDeSalud;
	}

	public void setSistemaDeSalud(int sistemaDeSalud) {
		this.sistemaDeSalud = sistemaDeSalud;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaDeSalud=" + sistemaDeSalud + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", direccion=" + direccion + ", comuna=" + comuna + "]";
	}
	
	
	

}
