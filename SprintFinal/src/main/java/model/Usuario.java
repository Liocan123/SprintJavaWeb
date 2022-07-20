package model;

public class Usuario {

    private String nombres ="";
    private String fechaDeNacimiento="";
    private int run =0;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public Usuario() {
    }

    public Usuario(String nombres, String fechaDeNacimiento, int run) {
        this.nombres = nombres;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombres='" + nombres + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", run=" + run +
                '}';
    }
	
}
