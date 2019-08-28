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
    private double total, gastosadmin, montoaentregar;
    private int montosolicitado;
    private Plan plan = new Plan();
    private String codigo = "142020";
    private Cliente cliente = new Cliente();

    public Credito(int montosolicitado) {
        this.total = montosolicitado * (1 + plan.getInteres());
        this.montosolicitado = montosolicitado;
    }

    public Credito() {
        
    }

    public double getMontoaentregar() {
        return montoaentregar;
    }

    public void setMontoaentregar(double montoaentregar) {
        this.montoaentregar = montoaentregar;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public double getTotal() {
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
        gastosadmin = montosolicitado * plan.getGastosadmin();
        return gastosadmin;
    }

    public void setGastosadmin(double gastosadmin) {
        this.gastosadmin = gastosadmin;
    }
    
    
    
}


