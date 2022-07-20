package model;

public class Profesional extends Usuario{
	
    private String titulo ="";
    private String fechaDeIngreso="";

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getfechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setfechaDeIngreso(String fechadeIngreso) {
        this.fechaDeIngreso = fechadeIngreso;
    }

    public Profesional() {
    }

    public Profesional(String titulo, String fechaDeIngreso) {
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    
    
    public Profesional(String nombres, String fechaDeNacimiento, int run, String titulo, String fechaDeIngreso) {
		super(nombres, fechaDeNacimiento, run);
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechadeIngreso='" + fechaDeIngreso + '\'' +
                '}';
    }

}
