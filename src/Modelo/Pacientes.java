/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author medin
 */
public class Pacientes {
    private String numeroSeguroSocial, nombrePaciente,padecimientos,alergias;
    private int tipoAtencion;
    
    public Pacientes(String numeroSeguroSocial, String nombrePaciente, String padecimientos, String alergias, int tipoAtencion) {
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.nombrePaciente = nombrePaciente;
        this.padecimientos = padecimientos;
        this.alergias = alergias;
        this.tipoAtencion = tipoAtencion;
        
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(String padecimientos) {
        this.padecimientos = padecimientos;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(int tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "numeroSeguroSocial=" + numeroSeguroSocial + ", nombrePaciente=" + nombrePaciente + ", padecimientos=" + padecimientos + ", alergias=" + alergias + ", tipoAtencion=" + tipoAtencion + '}';
    }
    
}
