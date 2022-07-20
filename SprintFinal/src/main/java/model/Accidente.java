package model;

public class Accidente {

		private int idAccidente;
	    private int rutCliente;
	    private String diaAccidente;
	    private String horaAccidente;
	    private String lugarAccidente;
	    private String origenAccidente;
	    private String consecuenciasAccidente;

	    public int getIdAccidente() {
	        return idAccidente;
	    }

	    public void setIdAccidente(int idAccidente) {
	        this.idAccidente = idAccidente;
	    }

	    public int getRutCliente() {
	        return rutCliente;
	    }

	    public void setRutCliente(int rutCliente) {
	        this.rutCliente = rutCliente;
	    }

	    public String getDiaAccidente() {
	        return diaAccidente;
	    }

	    public void setDiaAccidente(String diaAccidente) {
	        this.diaAccidente = diaAccidente;
	    }

	    public String getHoraAccidente() {
	        return horaAccidente;
	    }

	    public void setHoraAccidente(String horaAccidente) {
	        this.horaAccidente = horaAccidente;
	    }

	    public String getLugarAccidente() {
	        return lugarAccidente;
	    }

	    public void setLugarAccidente(String lugarAccidente) {
	        this.lugarAccidente = lugarAccidente;
	    }

	    public String getOrigenAccidente() {
	        return origenAccidente;
	    }

	    public void setOrigenAccidente(String origenAccidente) {
	        this.origenAccidente = origenAccidente;
	    }

	    public String getConsecuenciasAccidente() {
	        return consecuenciasAccidente;
	    }

	    public void setConsecuenciasAccidente(String consecuenciasAccidente) {
	        this.consecuenciasAccidente = consecuenciasAccidente;
	    }

	    public Accidente() {
	    }

	    public Accidente(int idAccidente, int rutCliente, String diaAccidente, String horaAccidente, String lugarAccidente,
	                     String origenAccidente, String consecuenciasAccidente) {
	        this.idAccidente = idAccidente;
	        this.rutCliente = rutCliente;
	        this.diaAccidente = diaAccidente;
	        this.horaAccidente = horaAccidente;
	        this.lugarAccidente = lugarAccidente;
	        this.origenAccidente = origenAccidente;
	        this.consecuenciasAccidente = consecuenciasAccidente;
	    }

	    @Override
	    public String toString() {
	        return "Usuario{" +
	                "IdAccidente= " + idAccidente + '\'' +
	                ", Rut= " + rutCliente + '\'' +
	                ", Dia del Accidente= " + diaAccidente +
	                ", Hora= " + horaAccidente + '\'' +
	                ", Lugar= " + lugarAccidente + '\'' +
	                ", Origen= " + origenAccidente + '\'' +
	                ", Consecuencias= " + consecuenciasAccidente + '\'' +
	                '}';
	    }
	
}
