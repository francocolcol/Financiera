/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author alech
 */
public class Credito {
    private  ArrayList<Cuota> cuotas = new ArrayList<>();
    private double total;
    private int montosolicitado;
    private Plan plan = new Plan();

    public Credito(int montosolicitado) {
        this.total = montosolicitado * (1 + plan.getInteres());
        this.montosolicitado = montosolicitado;
    }

    public Credito() {
        
    }
 
    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public double getTotal() {
        total = montosolicitado * (1 + plan.getInteres());
        return total;
    }

    public int getMontosolicitado() {
        return montosolicitado;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setMontosolicitado(int montosolicitado) {
        this.montosolicitado = montosolicitado;
    }

    
    
    
}


