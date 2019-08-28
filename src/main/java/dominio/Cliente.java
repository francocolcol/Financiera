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
public class Cliente {
    private int dni;
    private String nombre;
    private String domicilio;
    private String sueldo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String domicilio, String sueldo, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.sueldo = sueldo;
        this.telefono = telefono;
    }

    public double getDNI() {
        return dni;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
