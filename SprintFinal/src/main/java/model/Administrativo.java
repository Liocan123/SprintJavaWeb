package model;

public class Administrativo extends Usuario{

	private String area = "";
    private String experiencia = "";

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Administrativo() {
    }

    public Administrativo(String area, String experiencia) {
        this.area = area;
        this.experiencia = experiencia;
    }
    
    

    public Administrativo(String nombres, String fechaDeNacimiento, int run, String area, String experiencia) {
		super(nombres, fechaDeNacimiento, run);
		this.area = area;
        this.experiencia = experiencia;
	}

	@Override
    public String toString() {
        return "Administrativo{" +
                "Área = " + area + '\'' +
                ", Experiencia= " + experiencia + '\'' +
                '}';
    }
    
}
