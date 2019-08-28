/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author alech
 */
public class Empleado {
    private int legajo;
    private String NomyAp;
    private String usuarioEmpleado;
    private String claveEmpleado;
    
    public Empleado(int legajo, String NomyAp, String usuarioEmpleado, String claveEmpleado) {
        this.legajo = legajo;
        this.NomyAp = NomyAp;
        this.usuarioEmpleado = usuarioEmpleado;
        this.claveEmpleado = claveEmpleado;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNomyAp() {
        return NomyAp;
    }

    public void setNomyAp(String NomyAp) {
        this.NomyAp = NomyAp;
    }
    
    public String getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setUsuarioEmpleado(String usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }
    
    
    
}

