package model;

public class Revision {
	
    private int idRevision;
    private int idVisita;
    private String nombreRevision;
    private String detalleARevisar;
    private int estado;

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    public String getDetalleARevisar() {
        return detalleARevisar;
    }

    public void setDetalleARevisar(String detalleARevisar) {
        this.detalleARevisar = detalleARevisar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Revision() {
    }

    public Revision(int idRevision, int idVisita, String nombreRevision, String detalleARevisar, int estado) {
        this.idRevision = idRevision;
        this.idVisita = idVisita;
        this.nombreRevision = nombreRevision;
        this.detalleARevisar = detalleARevisar;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "actividad.Revision{" +
                "idRevision=" + idRevision +
                ", idVisita=" + idVisita +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalleARevisar='" + detalleARevisar + '\'' +
                ", estado=" + estado +
                '}';
    }

}
