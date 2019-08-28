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
    private double total, gastosadmin, IDcredito;
    private int montosolicitado;
    private Plan plan = new Plan();
    private Cliente cliente = new Cliente();

    public double getIDcredito() {
        return IDcredito;
    }

    public void setIDcredito(double IDcredito) {
        this.IDcredito = IDcredito;
    }
    
    public Credito(int montosolicitado) {
        this.total = montosolicitado * (1 + plan.getInteres());
        this.montosolicitado = montosolicitado;
    }

    public Credito() {
        
    }
 
    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public double getTotalAdelantado() {
        total = montosolicitado * (1 + plan.getInteres());
        return total;
    }

    public double getTotalVencido() {
        total = montosolicitado * (1 + plan.getInteres()) + getGastosadmin();
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

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    
    public void addCuota(Cuota cuota){
        cuotas.add(cuota);
    }

    public double getGastosadmin() {
        gastosadmin = total * plan.getGastosadmin();
        return gastosadmin;
    }

    public void setGastosadmin(double gastosadmin) {
        this.gastosadmin = gastosadmin;
    }
    
    
    
}


