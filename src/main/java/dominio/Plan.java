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
public class Plan {
    private double interes, gastosadminper = 0.02;
    private int cantcuotas;

    public double getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public double getGastosadmin() {
        return gastosadminper;
    }

    public void setGastosadmin(double gastosadmin) {
        this.gastosadminper = gastosadmin;
    }

    public int getCantcuotas() {
        return cantcuotas;
    }

    public void setCantcuotas(int cantcuotas) {
        this.cantcuotas = cantcuotas;
    }
    
    
    
}
