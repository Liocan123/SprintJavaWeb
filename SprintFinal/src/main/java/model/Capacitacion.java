package model;



public class Capacitacion{

	 	private int identificador;
	    private int rut;
	    private String dia;
	    private String hora;
	    private String lugar;
	    private String duracion;
	    private int cantidadAsistentes;

	    public int getIdentificador() {
	        return identificador;
	    }

	    public void setIdentificador(int identificador) {
	        this.identificador = identificador;
	    }

	    public int getRut() {
	        return rut;
	    }

	    public void setRut(int rut) {
	        this.rut = rut;
	    }

	    public String getDia() {
	        return dia;
	    }

	    public void setDia(String dia) {
	        this.dia = dia;
	    }

	    public String getHora() {
	        return hora;
	    }

	    public void setHora(String hora) {
	        this.hora = hora;
	    }

	    public String getLugar() {
	        return lugar;
	    }

	    public void setLugar(String lugar) {
	        this.lugar = lugar;
	    }

	    public String getDuracion() {
	        return duracion;
	    }

	    public void setDuracion(String duracion) {
	        this.duracion = duracion;
	    }

	    public int getCantAsistentes() {
	        return cantidadAsistentes;
	    }

	    public void setCantAsistentes(int cantAsistentes) {
	        this.cantidadAsistentes = cantAsistentes;
	    }

	    public Capacitacion() {
	    }

	    public Capacitacion(int identificador, int rut, String dia, String hora, String lugar, String duracion,
	                        int cantidadAsistentes) {
	        this.identificador = identificador;
	        this.rut = rut;
	        this.dia = dia;
	        this.hora = hora;
	        this.lugar = lugar;
	        this.duracion = duracion;
	        this.cantidadAsistentes = cantidadAsistentes;
	    }
	    
	    @Override
	    public String toString() {
	        return "actividad.Capacitacion {" +
	                "Identificador = " + identificador + '\'' +
	                ", Rut= " + rut + '\'' +
	                ", Día= " + dia +
	                ", Hora= " + hora + '\'' +
	                ", Lugar= " + lugar + '\'' +
	                ", Duración= " + duracion + '\'' +
	                ", Asistentes= " + cantidadAsistentes + '\'' +
	                '}';

	    }
	    
}
