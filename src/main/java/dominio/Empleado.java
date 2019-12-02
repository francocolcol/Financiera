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

    private String usuarioEmpleado;
    private String claveEmpleado;

    public Empleado(String usuarioEmpleado, String claveEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
        this.claveEmpleado = claveEmpleado;
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

