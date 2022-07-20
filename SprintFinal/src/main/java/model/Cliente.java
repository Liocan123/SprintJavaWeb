package model;

public class Cliente extends Usuario{

	 private int rut = 0;
	    private String nombresC ="";
	    private String apellidos ="";
	    private String telefono ="";
	    private String afp ="";
	    private int sistemaDeSalud = 0;
	    private String direccion = "";
	    private String comuna = "";
	    private int edad = 0;
	  
	    //private List<VisitaEnTerreno> visitasTerreno = (List<VisitaEnTerreno>) new VisitaEnTerreno();


	    public int getRut() {
	        return rut;
	    }

	    public void setRut(int rut) {
	        this.rut = rut;
	    }

	    public String getNombresC() {
	        return nombresC;
	    }

	    public void setNombresC(String nombres) {
	        this.nombresC = nombres;
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

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public Cliente() {
	    }

	    public Cliente(int rut, String nombresC, String apellidos, String telefono, String afp, int sistemaDeSalud, String direccion, String comuna, int edad) {
	        this.rut = rut;
	        this.nombresC = nombresC;
	        this.apellidos = apellidos;
	        this.telefono = telefono;
	        this.afp = afp;
	        this.sistemaDeSalud = sistemaDeSalud;
	        this.direccion = direccion;
	        this.comuna = comuna;
	        this.edad = edad;
	    }
	    
	    
	   

	    public Cliente(String nombres, String fechaDeNacimiento, int run, int rut, String nombresC, String apellidos, String telefono, String afp, int sistemaDeSalud, String direccion, String comuna, int edad) {
			super(nombres, fechaDeNacimiento, run);
			 this.rut = rut;
		        this.nombresC = nombresC;
		        this.apellidos = apellidos;
		        this.telefono = telefono;
		        this.afp = afp;
		        this.sistemaDeSalud = sistemaDeSalud;
		        this.direccion = direccion;
		        this.comuna = comuna;
		        this.edad = edad;
			// TODO Auto-generated constructor stub
		}

		@Override
	    public String toString() {
	        return "Cliente{" +
	                "rut=" + rut +
	                ", nombres='" + nombresC + '\'' +
	                ", apellidos='" + apellidos + '\'' +
	                ", telefono='" + telefono + '\'' +
	                ", afp='" + afp + '\'' +
	                ", sistemaDeSalud=" + sistemaDeSalud +
	                ", direccion='" + direccion + '\'' +
	                ", comuna='" + comuna + '\'' +
	                ", edad=" + edad +
	                '}';
	    }
		
		
	
}
