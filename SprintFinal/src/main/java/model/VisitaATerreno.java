package model;

import java.util.ArrayList;
import java.util.List;

public class VisitaATerreno {
	
    private int idVisita = 0;
    private int rutCliente = 0;
    private String dia = "";
    private String hora = "";
    private String lugar = "";
    private String comentario = "";
    //private List<Revision> revisiones = new ArrayList<Revision>();

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public VisitaATerreno() {
    }

    public VisitaATerreno(int idVisita, int rutCliente, String dia, String hora, String lugar, String comentario) {
        this.idVisita = idVisita;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "actividad.VisitaEnTerreno{" +
                "idVisita=" + idVisita +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }

}
